pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'  // Use a valid Docker image for Maven and OpenJDK
            label 'any'  // Ensures it uses any available node/agent
        }
    }
    environment {
        SONAR_TOKEN = credentials('sonarqube-token')  // Use secure credentials for SonarQube token
    }
    stages {
        stage('Checkout SCM') {
            steps {
                // Checkout code from the repository
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Run the Maven build process
                    sh 'mvn clean compile'
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    // Run the Maven test process
                    sh 'mvn test'
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                script {
                    // Run SonarQube analysis with your SonarQube token and project details
                    sh """
                        mvn sonar:sonar \
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=${SONAR_TOKEN}
                    """
                }
            }
        }
        
        stage('Docker Build & Push') {
            steps {
                script {
                    // Build the Docker image and push it to DockerHub (or other registry)
                    sh 'docker build -t my-image .'
                    sh 'docker push my-image'
                }
            }
        }
        
        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Deploy the application to Kubernetes
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }

    post {
        always {
            // Ensure that workspace is cleaned after the build completes
            node {
                cleanWs()  // Clean up the workspace to avoid leftover files
            }
        }
    }
}
