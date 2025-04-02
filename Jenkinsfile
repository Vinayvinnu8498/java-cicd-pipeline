pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('sonar-token')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        DOCKER_IMAGE = 'vinayvinnu8498/math-utils'
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
                    args '-v /root/.m2:/root/.m2'
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
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn test'
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=math-utils \
                        -Dsonar.host.url=http://host.docker.internal:9000 \
                        -Dsonar.login=${SONARQUBE_TOKEN}
                    '''
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    def image = docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-token') {
                        image.push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
                sh 'kubectl rollout status deployment/math-utils-deployment'
            }
        }
    }

    post {
        always {
            echo '✅ Pipeline finished.'
            cleanWs()
        }
        success {
            echo '🎉 Pipeline succeeded!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        DOCKER_IMAGE = 'vinayvinnu8498/math-utils'
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
                    args '-v /root/.m2:/root/.m2'
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
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn test'
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    withCredentials([string(credentialsId: 'sonar-token', variable: 'SONARQUBE_TOKEN')]) {
                        sh '''
                            mvn sonar:sonar \
                            -Dsonar.projectKey=math-utils \
                            -Dsonar.host.url=http://host.docker.internal:9000 \
                            -Dsonar.login=${SONARQUBE_TOKEN}
                        '''
                    }
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    def image = docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-token') {
                        image.push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
                sh 'kubectl rollout status deployment/math-utils-deployment'
            }
        }
    }

    post {
        always {
            echo '✅ Pipeline finished.'
            cleanWs()
        }
        success {
            echo '🎉 Pipeline succeeded!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}

