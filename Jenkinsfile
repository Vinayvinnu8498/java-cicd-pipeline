pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'
            label 'your-label'
        }
    }
    stages {
        stage('Checkout SCM') {
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
                    sh 'mvn sonar:sonar -Dsonar.projectKey=java-cicd-pipeline -Dsonar.host.url=http://localhost:9000 -Dsonar.login=$SONAR_TOKEN'
                }
            }
        }
        stage('Docker Build & Push') {
            steps {
                // Docker build and push commands here
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                // Deployment commands here
            }
        }
    }
    post {
        always {
            cleanWs()  // Make sure this is inside the 'node' block or in the 'post' block
        }
    }
}
