pipeline {
    agent any  // This will run the pipeline on any available Jenkins agent.
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }
        stage('Build') {
            agent {
                docker {
                    image 'maven:3.8.3-openjdk-17'  // Use a different version of Maven Docker image
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            agent {
                docker {
                    image 'maven:3.8.3-openjdk-17'
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
                        -Dsonar.projectKey=java-cicd-pipeline \
                        -Dsonar.host.url=http://localhost:9000 \
                        -Dsonar.login=${SONAR_TOKEN}
                    '''
                }
            }
        }
        stage('Docker Build & Push') {
            steps {
                script {
                    dockerImage = docker.build("vinayvinnu8498/math-utils")
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-creds') {
                        dockerImage.push('latest')
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
}
