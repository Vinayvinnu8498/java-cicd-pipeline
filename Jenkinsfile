pipeline {
    agent any

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9000'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-creds')
        DOCKER_IMAGE = 'kattabhanuanusha/calculatorjavacode'
        DOCKER_TAG = 'latest'
    }

    stages {

        stage('Clean Workspace') {
            steps {
                cleanWs()
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build (Java 11)') {
            steps {
                sh '''
                    docker run --rm \
                      -v "$PWD:/app" \
                      -w /app \
                      maven:3.8.6-eclipse-temurin-11 \
                      mvn clean package -Dmaven.compiler.source=11 -Dmaven.compiler.target=11
                '''
            }
        }

        stage('Unit Test (Java 21)') {
            steps {
                sh '''
                    docker run --rm \
                      -v "$PWD:/app" \
                      -w /app \
                      maven:3.9.6-eclipse-temurin-21 \
                      mvn test -Dtest="com.mathutils.MathUtilsTest"
                '''
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SONARQUBE') {
                    sh '''
                        docker run --rm \
                          -v "$PWD:/app" \
                          -w /app \
                          maven:3.8.6-eclipse-temurin-17 \
                          mvn sonar:sonar \
                          -Dsonar.projectKey=MyProject \
                          -Dsonar.host.url=$SONARQUBE_URL \
                          -Dsonar.login=$SONARQUBE_TOKEN
                    '''
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
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-creds') {
                        docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl version --client'
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
