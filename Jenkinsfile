pipeline {
    agent none

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9000'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-creds')  // Credentials referenced here
        DOCKER_IMAGE = 'vinay8498/math-utils'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Clean Workspace') {
            agent any
            steps {
                cleanWs()
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline'
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
                    # Clean and build with Java 11
                    mvn clean package \
                    -Dmaven.compiler.source=11 \
                    -Dmaven.compiler.target=11 \
                    -Djava.version=11
                '''
                stash includes: 'target/', name: 'compiled-artifacts'
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
                sh 'mvn test -Dtest="com.example.calculator.CalculatorTest"'
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
                    // Verify files before build
                    sh 'ls -la target/'
                    docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}", '.')
                    echo "Build docker image done"
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

        stage('Deploy to Kubernetes') {
            agent any
            steps {
                script {
                    // Apply the Kubernetes deployment manifest
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
}
