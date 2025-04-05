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
                dir('math-utils') {
                    sh '''
                        docker run --rm -v "$PWD:/app" -w /app maven:3.8.6-eclipse-temurin-11 mvn clean package
                    '''
                }
            }
        }

        stage('Unit Test (Java 21)') {
            steps {
                dir('math-utils') {
                    sh '''
                        docker run --rm -v "$PWD:/app" -w /app maven:3.9.9-eclipse-temurin-21 mvn test
                    '''
                }
            }
            post {
                always {
                    junit 'math-utils/target/surefire-reports/*.xml'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                dir('math-utils') {
                    withSonarQubeEnv('SONARQUBE') {
                        sh '''
                            docker run --rm -v "$PWD:/app" -w /app maven:3.8.6-eclipse-temurin-17 mvn sonar:sonar \
                            -Dsonar.projectKey=MyProject \
                            -Dsonar.host.url=$SONARQUBE_URL \
                            -Dsonar.login=$SONARQUBE_TOKEN
                        '''
                    }
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('math-utils') {
                    script {
                        sh 'ls -la target/'
                        docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}", ".")
                        echo "✅ Docker image built."
                    }
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-creds') {
                        docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").push()
                        echo "✅ Docker image pushed to DockerHub."
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl version --client'
                sh 'kubectl apply -f /var/jenkins_home/deploymentdh.yaml'
            }
        }
    }
}
