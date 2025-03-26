pipeline {
    agent any

    environment {
        // Define Docker image name and tag
        DOCKER_IMAGE = "vinay8498/my-java-app:v10"
    }

    stages {
        stage('Checkout SCM') {
            steps {
                // Checkout the repository to get the source code
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Compile the Java code
                sh 'javac -d out MathUtils.java MathUtilsApplication.java'
            }
        }

        stage('Run') {
            steps {
                // Run the Java application
                sh 'java -cp out myapp.MathUtilsApplication'
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build Docker image
                sh "docker build -t ${DOCKER_IMAGE} ."
            }
        }

        stage('Push to Docker Hub') {
            steps {
                // Push the Docker image to Docker Hub
                withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh 'echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin'
                    sh "docker push ${DOCKER_IMAGE}"
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                // Deploy the Docker image to Kubernetes
                withKubeConfig([credentialsId: 'k8s-creds']) {
                    sh 'kubectl apply -f k8s-deployment.yaml'
                }
            }
        }
    }
}
