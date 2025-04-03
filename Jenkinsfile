pipeline {
    agent none

    environment {
        SONARQUBE_TOKEN = credentials('sonar-token')        // Sonar token ID
        DOCKER_HUB_CREDENTIALS = credentials('docker-token') // Docker Hub credentials
    }

    stages {
        stage('Checkout') {
            agent any
            steps {
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Static Code Analysis') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    '''
                }
            }
        }

        stage('Docker Build & Push') {
            agent any
            steps {
                script {
                    dockerImage = docker.build("vinayvinnu8498/java-cicd-pipeline")
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-token') {
                        dockerImage.push('latest')
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            agent any
            steps {
                sh 'kubectl apply -f deployment.yaml'
                sh 'kubectl rollout status deployment/math-utils-deployment'
            }
        }
    }

    post {
        always {
            echo '🧼 Cleaning up...'
            cleanWs()
        }
        success {
            echo '✅ Pipeline succeeded!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}
