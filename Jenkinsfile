pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'javac -d out MathUtils.java MathUtilsApplication.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp out myapp.MathUtilsApplication'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t vinay8498/my-java-app:v10 .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh 'docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD'
                    sh 'docker push vinay8498/my-java-app:v10'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                // Use Kubernetes credentials to deploy
                withCredentials([file(credentialsId: 'minikube-kubeconfig', variable: 'KUBECONFIG')]) {
                    sh 'kubectl --kubeconfig=$KUBECONFIG apply -f k8s/deployment.yaml'
                }
            }
        }
    }
}
