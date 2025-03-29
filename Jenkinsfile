pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'vinay8498/my-java-app'
        DOCKER_TAG = 'v10'
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
                    image 'maven:3.8.3-openjdk-17'
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
                withCredentials([string(credentialsId: 'sonar-token', variable: 'SONAR_TOKEN')]) {
                    withSonarQubeEnv('My SonarQube Server') {
                        sh '''
                            echo "Running SonarQube Analysis..."
                            mvn sonar:sonar \
                              -Dsonar.projectKey=java-cicd-pipeline \
                              -Dsonar.projectName="java-cicd-pipeline" \
                              -Dsonar.host.url=http://localhost:9000 \
                              -Dsonar.login=$SONAR_TOKEN
                        '''
                    }
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    dockerImage = docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-creds') {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
                    sh '''
                        echo "Deploying to Kubernetes..."
                        kubectl apply -f deployment.yaml
                        kubectl rollout status deployment/java-app
                    '''
                }
            }
        }
    }

    post {
        failure {
            echo '❌ Pipeline failed. Check the console output for more details.'
        }
        success {
            echo '✅ Pipeline completed successfully!'
        }
    }
}
