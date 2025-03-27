FROM jenkins/jenkins:lts

USER root

RUN apt-get update && \
    apt-get install -y curl && \
    curl -LO https://storage.googleapis.com/kubernetes-release/release/v1.24.0/bin/linux/amd64/kubectl && \
    chmod +x kubectl && \
    mv kubectl /usr/local/bin/
