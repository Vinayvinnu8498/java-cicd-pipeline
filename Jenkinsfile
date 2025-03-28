pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('sonarqube-token')  // Store your SonarQube token securely
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'  // Build your project
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'  // Run tests
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                        mvn clean verify sonar:sonar \
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=${SONAR_TOKEN}
                    '''
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.build('your-image-name') // Build Docker image
                    docker.push('your-image-name')  // Push Docker image
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Add your Kubernetes deployment commands here
                }
            }
        }
    }
}
