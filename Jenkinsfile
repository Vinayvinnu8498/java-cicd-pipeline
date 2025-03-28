pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'  // Updated to a valid Maven image with OpenJDK 17
            label 'your-label'
        }
    }
    stages {
        stage('Declarative: Checkout SCM') {
            steps {
                checkout scm
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
                        -Dsonar.login=${SONAR_TOKEN}
                    '''
                }
            }
        }
        stage('Docker Build & Push') {
            steps {
                // Docker build and push logic here
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                // Kubernetes deployment logic here
            }
        }
    }
}
