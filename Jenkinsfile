pipeline {
    agent any

    environment {
        SONAR_HOST_URL = 'http://host.docker.internal:9000'
        DOCKER_IMAGE = 'vinayvinnu8498/java-cicd-pipeline'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Vinayvinnu8498/java-cicd-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    docker.image('maven:3.8.3-openjdk-17').inside {
                        sh 'mvn clean compile'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    docker.image('maven:3.8.3-openjdk-17').inside {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage('Static Code Analysis') {
            steps {
                withCredentials([string(credentialsId: 'sonar-token', variable: 'SONAR_TOKEN')]) {
                    withSonarQubeEnv('My SonarQube Server') {
                        script {
                            docker.image('maven:3.8.3-openjdk-17').inside {
                                sh '''
                                    echo 'Running SonarQube Analysis...'
                                    mvn verify sonar:sonar \
                                      -Dsonar.projectKey=java-cicd-pipeline \
                                      -Dsonar.projectName=java-cicd-pipeline \
                                      -Dsonar.host.url=$SONAR_HOST_URL \
                                      -Dsonar.login=$SONAR_TOKEN
                                '''
                            }
                        }
                    }
                }
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.withRegistry('', 'docker-token') {
                        sh '''
                            docker build -t $DOCKER_IMAGE .
                            docker push $DOCKER_IMAGE
                        '''
                    }
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
                    sh 'kubectl apply -f deployment.yaml'
                    sh 'kubectl rollout status deployment/math-utils-deployment'
                }
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline completed successfully.'
        }
        failure {
            echo '❌ Pipeline failed. Check the console output for more details.'
        }
    }
}
