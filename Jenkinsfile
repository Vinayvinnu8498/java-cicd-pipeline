pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-token')
        SONARQUBE_TOKEN = credentials('sonar-token')
    }

    stages {
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline', branch: 'main'
            }
        }

        stage('Build (Java 11)') {
            steps {
                sh '''
                docker run --rm \
                -v $PWD:/app \
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
                -v $PWD:/app \
                -w /app \
                maven:3.8.6-eclipse-temurin-21 \
                mvn test
                '''
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh '''
                    docker run --rm \
                    -v $PWD:/app \
                    -w /app \
                    maven:3.8.6-eclipse-temurin-11 \
                    mvn sonar:sonar \
                    -Dsonar.projectKey=java-cicd-pipeline \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.login=$SONARQUBE_TOKEN
                    '''
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                sh '''
                docker build -t vinayvinnu8498/math-utils:latest .
                '''
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry(credentialsId: 'docker-token', url: '') {
                    sh 'docker push vinayvinnu8498/math-utils:latest'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh '''
                kubectl apply -f deployment.yaml
                '''
            }
        }
    }
}
