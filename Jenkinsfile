pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('sonar-token')   // Your Sonar token ID in Jenkins
        DOCKER_HUB_CREDENTIALS = credentials('docker-token') // DockerHub token ID
        DOCKER_IMAGE = 'vinay8498/my-java-app'
        DOCKER_TAG = 'latest'
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
                    args '-v $HOME/.m2:/root/.m2'
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
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh "mvn sonar:sonar -Dsonar.login=${SONARQUBE_TOKEN}"
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    dockerImage = docker.build("${DOCKER_IMAGE}")
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-token') {
                        dockerImage.push("${DOCKER_TAG}")
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
                    sh 'kubectl apply -f deployment.yaml'
                    sh 'kubectl rollout status deployment/java-app'
                }
            }
        }
    }

    post {
        success {
            echo '🎉 Build and deployment successful!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}
