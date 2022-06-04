def gv

pipeline {

    agent any

    environment {
        NEXUS_IP = '54.198.172.26'
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
    }
}