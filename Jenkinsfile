pipeline {
    agent none

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9000'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        DOCKER_IMAGE = 'vinayvinnu8498/calculatorjavacode'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Clean Workspace') {
            agent any
            steps {
                cleanWs()
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
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
                dir('math-utils') {
                    sh 'mvn clean package -Dmaven.compiler.source=11 -Dmaven.compiler.target=11'
                }
                stash includes: 'math-utils/target/', name: 'compiled-artifacts'
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
                dir('math-utils') {
                    sh 'mvn test'
                }
            }
            post {
                always {
                    junit 'math-utils/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Static Code Analysis') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-17'
                    args '-v $HOME/.m2:/root/.m2'
                    reuseNode true
                }
            }
            steps {
                dir('math-utils') {
                    withSonarQubeEnv('SONARQUBE') {
                        sh """
                            mvn sonar:sonar \
                            -Dsonar.projectKey=math-utils \
                            -Dsonar.host.url=${SONARQUBE_URL} \
                            -Dsonar.login=${SONARQUBE_TOKEN}
                        """
                    }
                }
            }
        }

        stage('Build Docker Image') {
            agent any
            steps {
                dir('math-utils') {
                    sh 'ls -la target/'
                    script {
                        docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                    }
                }
            }
        }

        stage('Push to Docker Hub') {
            agent any
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-token') {
                        docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").push()
                        echo "✅ Docker image pushed: ${DOCKER_IMAGE}:${DOCKER_TAG}"
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            agent any
            steps {
                script {
                    sh 'kubectl version --client'
                    sh 'kubectl apply -f /var/jenkins_home/deployment.yaml'
                }
            }
        }
    }
}
