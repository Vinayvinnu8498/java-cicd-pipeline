pipeline {
    agent any

    environment {
        SONARQUBE_SERVER = 'http://sonar:9000'
        DOCKER_IMAGE = 'vinay8498/my-java-app:latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    docker.image('maven:3.8.1-openjdk-17').inside {
                        sh 'mvn clean package'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    docker.image('openjdk:11-jdk').inside {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                script {
                    docker.image('openjdk:8-jdk').inside {
                        sh 'mvn sonar:sonar -Dsonar.host.url=${SONARQUBE_SERVER}'
                    }
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t ${DOCKER_IMAGE} .'
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    sh 'docker login -u vinay8498 -p YOUR_PASSWORD'
                    sh 'docker push ${DOCKER_IMAGE}'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
}
