pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "vinay8498/java-math-utils"
        SONAR_PROJECT_KEY = "java-math-utils"
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
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-17'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                dir('math-utils') {
                    sh 'mvn test'
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                withCredentials([string(credentialsId: 'sonarqube-token', variable: 'SONAR_TOKEN')]) {
                    dir('math-utils') {
                        sh 'sonar-scanner -Dsonar.projectKey=$SONAR_PROJECT_KEY -Dsonar.sources=. -Dsonar.host.url=http://sonarqube:9000 -Dsonar.login=$SONAR_TOKEN'
                    }
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    script {
                        sh 'docker build -t $DOCKER_IMAGE ./math-utils'
                        sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                        sh 'docker push $DOCKER_IMAGE'
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
