pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('dockerhub-creds')
        SONAR_TOKEN = credentials('sonarqube-token')
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
                dir('math-utils') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests (mock)...'
            }
        }

        stage('Static Code Analysis') {
            steps {
                dir('math-utils') {
                    sh 'mvn sonar:sonar -Dsonar.projectKey=java-cicd-pipeline -Dsonar.host.url=http://sonar:9000 -Dsonar.login=$SONAR_TOKEN'
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                sh 'docker build -t vinay8498/java-cicd-pipeline:latest .'
                sh 'echo $DOCKER_HUB_CREDENTIALS_PSW | docker login -u $DOCKER_HUB_CREDENTIALS_USR --password-stdin'
                sh 'docker push vinay8498/java-cicd-pipeline:latest'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}