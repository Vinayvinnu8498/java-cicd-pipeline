pipeline {
    agent none

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9001'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-creds')
        DOCKER_IMAGE = 'vinayvinnu8498/math-utils'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Check kubectl') {
            steps {
                script {
                    // Check if kubectl is installed
                    sh 'which kubectl || (echo "kubectl not found" && exit 1)'
                }
            }
        }

        stage('Install kubectl') {
            steps {
                script {
                    // Install kubectl if not found
                    sh '''
                        curl -LO https://storage.googleapis.com/kubernetes-release/release/v1.21.0/bin/linux/amd64/kubectl
                        chmod +x ./kubectl
                        mv ./kubectl /usr/local/bin/kubectl
                    '''
                }
            }
        }

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
                sh 'mvn test -Dtest="com.mathutils.MathUtilsTest"'
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
                    sh 'kubectl apply -f deployment.yaml'
                }
            }
        }
    }
}
