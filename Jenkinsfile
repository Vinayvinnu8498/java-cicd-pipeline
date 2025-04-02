pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('SonarUser') // Make sure this matches the credential ID in Jenkins
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git', branch: 'main'
            }
        }

        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=MyProject \
                        -Dsonar.host.url=http://host.docker.internal:9000 \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    '''
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    dockerImage = docker.build("vinayvinnu8498/math-utils:latest")
                    docker.withRegistry('', 'docker-token') {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Kubernetes Deployment') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            echo '✅ Pipeline succeeded!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}
