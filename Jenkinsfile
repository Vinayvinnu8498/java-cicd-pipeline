pipeline {
    agent any

    environment {
        SONARQUBE_URL = 'http://host.docker.internal:9000'
        SONARQUBE_TOKEN = credentials('SonarUser')
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        DOCKER_IMAGE = 'vinayvinnu8498/calculatorjavacode'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Checkout') {
            steps {
                cleanWs()
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh '''
                    docker run --rm -v "$PWD":/app -w /app maven:3.8.6-eclipse-temurin-17 \
                    mvn clean package -Dmaven.test.skip=true
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    docker run --rm -v "$PWD":/app -w /app maven:3.9.9-eclipse-temurin-21 \
                    mvn test -Dtest="com.example.calculator.CalculatorTest"
                '''
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('SONARQUBE') {
                    sh '''
                        docker run --rm -v "$PWD":/app -w /app maven:3.8.6-eclipse-temurin-17 \
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
                sh '''
                    docker build -t $DOCKER_IMAGE:$DOCKER_TAG .
                '''
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('', 'docker-token') {
                        docker.image("$DOCKER_IMAGE:$DOCKER_TAG").push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh '''
                    kubectl apply -f /var/jenkins_home/deployment.yaml
                '''
            }
        }
    }
    post {
        always {
            echo '🧼 Cleaning up workspace...'
            cleanWs()
        }
    }
}
