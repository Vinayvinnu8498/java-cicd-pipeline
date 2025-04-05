pipeline {
    agent none

    environment {
        SONARQUBE_URL = 'http://localhost:9000'
        SONARQUBE_TOKEN = credentials('sonar-token')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        DOCKER_IMAGE = 'vinayvinnu8498/mathutils'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Clean Workspace') {
            agent any
            steps {
                cleanWs()
                echo "Workspace cleaned"
            }
        }

        stage('Build (Java 11)') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-11'
                    args '-v $HOME/.m2:/root/.m2'
                    reuseNode true
                }
            }
            steps {
                sh '''
                    mvn --% clean package -Dmaven.compiler.source=11 -Dmaven.compiler.target=11
                '''
                stash includes: 'target/**', name: 'compiled-artifacts'
            }
        }

        stage('Unit Test (Java 21)') {
            agent {
                docker {
                    image 'maven:3.9.9-eclipse-temurin-21'
                    args '-v $HOME/.m2:/root/.m2'
                    reuseNode true
                }
            }
            steps {
                unstash 'compiled-artifacts'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('SonarQube Analysis') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                    reuseNode true
                }
            }
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=math-utils \
                        -Dsonar.host.url=$SONARQUBE_URL \
                        -Dsonar.login=$SONARQUBE_TOKEN
                    '''
                }
            }
        }

        stage('Build Docker Image') {
            agent any
            steps {
                script {
                    sh 'ls -la target/'
                    docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}", '.')
                }
            }
        }

        stage('Push to Docker Hub') {
            agent any
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', DOCKER_HUB_CREDENTIALS) {
                        docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").push()
                        echo "✅ Successfully pushed ${DOCKER_IMAGE}:${DOCKER_TAG}"
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            agent any
            steps {
                script {
                    sh 'kubectl version --client'
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
}
