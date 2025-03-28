pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'
            label 'your-label'  // Specify the appropriate label for your agent
        }
    }

    environment {
        // Access your credentials securely from Jenkins
        SONAR_TOKEN = credentials('sonarqube-token')  // SonarQube token stored securely
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-credentials')  // DockerHub credentials stored securely
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the Git repository
                checkout scm
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {  // Use SonarQube environment settings
                    sh '''
                        mvn clean verify sonar:sonar \
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=${SONAR_TOKEN}  // Use the SonarQube token securely
                    '''
                }
            }
        }

        stage('Build') {
            steps {
                // Run the Maven build command
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run the tests using Maven
                sh 'mvn test'
            }
        }

        stage('Docker Build & Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    // Build and push Docker image
                    sh '''
                        docker build -t ${DOCKER_USERNAME}/java-cicd-pipeline .
                        docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}
                        docker push ${DOCKER_USERNAME}/java-cicd-pipeline
                    '''
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                // Deploy the Docker image to Kubernetes
                sh 'kubectl apply -f k8s-deployment.yaml'
            }
        }
    }

    post {
        always {
            // Clean up after the pipeline runs
            cleanWs()
        }
    }
}
