pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'  // Use Maven image with OpenJDK 17
        }
    }
    environment {
        SONAR_TOKEN = credentials('sonarqube-token')  // Set your SonarQube token as environment variable
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm  // Check out the code from the repository
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'  // Build the project with Maven
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'  // Run tests using Maven
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {  // Use SonarQube for static code analysis
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
                sh 'docker build -t your-docker-image .'  // Build Docker image
                sh 'docker push your-docker-image'  // Push Docker image to registry
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/deployment.yaml'  // Deploy the application to Kubernetes
            }
        }
    }
}
