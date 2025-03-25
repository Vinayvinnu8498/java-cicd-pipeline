pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'vinay8498/my-java-app:v10'
    }
    stages {
        stage('Build') {
            steps {
                sh 'javac java/src/MathUtils.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp java/src MathUtils'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh 'docker login -u $DOCKER_USER -p $DOCKER_PASS'
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
