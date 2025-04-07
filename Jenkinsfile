pipeline {
    agent any
    environment {
        DOCKER_HOST = 'tcp://localhost:2375'  // Point Jenkins to Docker TCP endpoint
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    // Ensure Docker is running and accessible
                    sh 'docker --version'
                    sh 'docker ps'  // Check if Docker is accessible
                }
            }
        }
        stage('Build and Test (Java 11)') {
            steps {
                script {
                    // Build the Docker image using Maven
                    sh 'docker build -t your-image-name .'
                }
            }
        }
        stage('Push to Docker Hub') {
            steps {
                script {
                    // Push to Docker Hub
                    sh 'docker push your-image-name:latest'
                }
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Kubernetes deploy commands here
                }
            }
        }
    }
}
