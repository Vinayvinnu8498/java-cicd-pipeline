pipeline {
    agent none

    environment {
        SONARQUBE_URL = 'http://localhost:9000'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-creds')
        DOCKER_IMAGE = 'vinay8498/my-java-app'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Clean Workspace') {
            agent any
            steps {
                cleanWs()
                echo 'Workspace cleaned and ready.'
            }
        }

        stage('Build (Java 11)') {
            agent {
                docker {
                    image 'maven:3.8.6-eclipse-temurin-11'
                    args '-v %USERPROFILE%\\.m2:/root/.m2'
                    reuseNode true
                }
            }
            steps {
                sh '''
                    mvn clean package \
                    -Dmaven.compiler.source=11 \
                    -Dmaven.compiler.target=11 \
                    -Djava.version=11
                '''
                stash includes: 'target/', name: 'compiled-artifacts'
            }
        }

        stage('Unit Test (Java 17)') {
            agent {
                docker {
                    image 'maven:3.9.4-eclipse-temurin-17'
                    args '-v %USERPROFILE%\\.m2:/root/.m2'
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
                    image 'maven:3.8.6-eclipse-temurin-8'
                    args '-v %USERPROFILE%\\.m2:/root/.m2'
                    reuseNode true
                }
            }
            steps {
                withSonarQubeEnv('SONARQUBE') {
                    sh """
                        mvn sonar:sonar \
                        -Dsonar.projectKey=MyProject \
                        -Dsonar.host.url=${SONARQUBE_URL} \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    """
                }
            }
        }

        stage('Build Docker Image') {
            agent any
            steps {
                script {
                    sh 'ls -la'
                    docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                }
            }
        }

        stage('Push to Docker Hub') {
            agent any
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-creds') {
                        docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").push()
                        echo "Successfully pushed ${DOCKER_IMAGE}:${DOCKER_TAG}"
                    }
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed - cleaning up'
            script {
                node {
                    cleanWs()
                }
            }
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
