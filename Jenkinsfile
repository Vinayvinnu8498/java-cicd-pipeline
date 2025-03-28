pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'
            // Ensure this label matches your Jenkins node label or remove the label if not needed
            label 'your-label'  
        }
    }
    environment {
        SONAR_TOKEN = credentials('sonarqube-token')  // Retrieve SonarQube token securely
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    // Run Maven build
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Run Maven tests
                    sh 'mvn test'
                }
            }
        }
        stage('Static Code Analysis') {
            steps {
                script {
                    // Run SonarQube analysis
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
                    // Add your Docker build & push steps here
                    sh 'docker build -t my-image .'
                    sh 'docker push my-image'
                }
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Add Kubernetes deployment steps here
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
    post {
        always {
            // Ensure cleanWs is within the node block
            node {
                cleanWs()  // Make sure cleanWs is inside a node block
            }
        }
    }
}