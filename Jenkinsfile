pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'  // Use this instead of maven:3.8.7-openjdk-17
        }
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm  // Checks out the code from your repository
            }
        }

        stage('Build') {
            steps {
                script {
                    // Running Maven build
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Running Maven tests
                    sh 'mvn test'
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                script {
                    // Running SonarQube analysis
                    sh 'mvn sonar:sonar -Dsonar.projectKey=java-cicd-pipeline -Dsonar.host.url=http://localhost:9000 -Dsonar.login=${SONAR_TOKEN}'
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    // Building and pushing Docker image
                    sh 'docker build -t your-docker-image .'
                    sh 'docker push your-docker-image'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Deploy to Kubernetes
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
}
