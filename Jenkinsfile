pipeline {
    agent any

    tools {
        maven 'Maven3'   // Make sure this exists under Jenkins -> Global Tool Configuration
        jdk 'JDK17'      // Ensure JDK17 is installed and configured
    }

    environment {
        SONARQUBE_TOKEN = credentials('sonarqube-token')         // ID of SonarQube secret
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')     // DockerHub credentials ID
    }

    stages {

        stage('Checkout') {
            steps {
                git credentialsId: 'github-credentials',
                    url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git',
                    branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh """
                        mvn sonar:sonar \
                        -Dsonar.projectKey=MyProject \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    """
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.withRegistry('', 'docker-token') {
                        def app = docker.build("vinay8498/java-cicd-pipeline")
                        app.push('latest')
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }

    post {
        always {
            echo '🧼 Cleaning workspace...'
            cleanWs()
        }
        failure {
            echo '❌ Pipeline failed!'
        }
        success {
            echo '✅ Pipeline succeeded!'
        }
    }
}
