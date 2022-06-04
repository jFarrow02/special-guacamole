def buildImage() {
    echo 'building image...'
    sh "docker build -t ${IMAGE_NAME} ."
}

return this