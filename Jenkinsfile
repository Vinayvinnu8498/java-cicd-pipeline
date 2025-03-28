pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('sonarqube-token')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'docker-token', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=$SONAR_TOKEN
                    '''
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-token') {
                        def app = docker.build("vinay8498/java-cicd-pipeline")
                        app.push("latest")
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
