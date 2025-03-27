pipeline {
    agent any

    environment {
        DOCKER_USER = 'vinay8498'
        DOCKER_TOKEN = credentials('docker-token')
        SONAR_TOKEN = credentials('sonar-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-17').inside {
                        sh 'mvn clean package -DskipTests'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    docker.image('openjdk:11-jdk').inside {
                        sh 'java -version'
                        // Replace with your test command if needed
                    }
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                script {
                    docker.image('openjdk:8-jdk').inside {
                        withSonarQubeEnv('MySonarQubeServer') {
                            sh 'mvn sonar:sonar -Dsonar.login=$SONAR_TOKEN'
                        }
                    }
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.build('java-app')
                    docker.withRegistry('', 'docker-hub-credentials') {
                        docker.image('java-app').push('latest')
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
}
