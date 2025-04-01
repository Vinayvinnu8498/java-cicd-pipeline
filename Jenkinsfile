pipeline {
    agent any

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9000'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn test'
            }
        }

        stage('Static Code Analysis') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                withSonarQubeEnv('SONARQUBE') {
                    sh """
                        mvn sonar:sonar \
                        -Dsonar.projectKey=MyProject \
                        -Dsonar.host.url=${SONARQUBE_URL} \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    """
                }
            }
        }

        stage('Docker Build & Push') {
            agent any
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-token') {
                        def image = docker.build("vinay8498/java-cicd-pipeline")
                        image.push("latest")
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
                sh 'kubectl rollout status deployment/math-utils-deployment'
            }
        }
    }

    post {
        always {
            echo '✅ Pipeline finished.'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}