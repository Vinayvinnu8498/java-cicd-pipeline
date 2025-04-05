pipeline {
    agent any

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9000'
        SONARQUBE_TOKEN = credentials('sonar-token')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        DOCKER_IMAGE = 'vinay8498/my-java-app'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Checkout') {
            steps {
                cleanWs()
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build with Maven') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Static Code Analysis') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh """
                        mvn sonar:sonar \
                        -Dsonar.projectKey=my-java-app \
                        -Dsonar.host.url=${SONARQUBE_URL} \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    """
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKER_HUB_CREDENTIALS) {
                        docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    sh 'kubectl apply -f /var/jenkins_home/deployment.yaml'
                }
            }
        }
    }

    post {
        always {
            echo "🧼 Cleaning up workspace..."
            cleanWs()
        }
        failure {
            echo "❌ Pipeline failed!"
        }
    }
}
