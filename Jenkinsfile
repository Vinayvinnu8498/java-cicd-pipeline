pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('dockerhub-creds')
        SONAR_TOKEN = credentials('sonarqube-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git', branch: 'main'
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
                dir('math-utils') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                dir('math-utils') {
                    sh 'mvn test'
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                dir('math-utils') {
                    sh """
                        mvn sonar:sonar \
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=$SONAR_TOKEN
                    """
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    dockerImage = docker.build("vinayvinnu8498/java-cicd-pipeline")
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-creds') {
                        dockerImage.push("latest")
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/deployment.yaml'
                sh 'kubectl apply -f k8s/service.yaml'
            }
        }
    }
}
