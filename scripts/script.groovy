def buildImage() {
    echo 'building image...'
    sh "docker build -t $IMAGE_NAME ."
}


def pushImage() {
    echo 'pushing image...'
    sh "echo $PWD | docker login -u $USER --password stdin $NEXUS_IP:$NEXUS_PORT"
    sh "docker push $IMAGE_NAME"
}
return this