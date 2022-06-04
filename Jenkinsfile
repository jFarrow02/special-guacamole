def gv

pipeline {

    agent any

    environment {
        NEXUS_IP = '18.206.201.95'
        NEXUS_PORT = '8083'
        IMAGE_NAME = "${NEXUS_IP}:${NEXUS_PORT}/testapp-b:0.1"
    }
    stages {
        stage('init') {
            steps {
                script {
                    echo 'initializing...'
                    gv = load './scripts/script.groovy'
                }
            }
        }

        stage('build image') {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

        stage('push image') {
            steps {
                script {
                    gv.pushImage()
                }
            }
        }
    }
}