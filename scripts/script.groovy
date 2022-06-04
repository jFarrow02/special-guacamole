def buildImage() {
    echo 'building image...'
      withCredentials([usernamePassword(credentialsId: 'nexus-creds', usernameVariable: 'USER', passwordVariable: 'PWD')]){
        sh "docker build -t $IMAGE_NAME ."
        sh "echo $PWD | docker login -u $USER --password stdin $NEXUS_IP:$NEXUS_PORT"
        sh "docker push $IMAGE_NAME"
    }
}

return this