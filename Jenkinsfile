pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        SONAR_TOKEN = credentials('sonar-token')
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
                sh 'cd math-utils && mvn clean package -DskipTests'
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
                sh 'cd math-utils && mvn test'
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('MySonarQubeServer') {
                    sh 'cd math-utils && mvn sonar:sonar -Dsonar.projectKey=java-cicd-pipeline -Dsonar.login=$SONAR_TOKEN'
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
