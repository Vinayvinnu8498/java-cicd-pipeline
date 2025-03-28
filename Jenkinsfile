pipeline {
    agent {
        docker {
            image 'maven:3.8.7-openjdk-17'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

    environment {
        SONAR_TOKEN = credentials('sonarqube-token')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
    }

    tools {
        maven 'Maven 3.8.7'  // Optional: fallback if not using docker agent
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git',
                    credentialsId: 'docker-token'
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
                        -Dsonar.host.url=http://host.docker.internal:9000 \
                        -Dsonar.login=${SONAR_TOKEN}
                    '''
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                sh '''
                    docker build -t vinay8498/java-cicd-pipeline:latest .
                    echo "${DOCKER_HUB_CREDENTIALS_PSW}" | docker login -u "${DOCKER_HUB_CREDENTIALS_USR}" --password-stdin
                    docker push vinay8498/java-cicd-pipeline:latest
                '''
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
