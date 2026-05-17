def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariable: 'DockerHubPass', usernameVariable: 'DockerHubUsername')]) {
      sh "docker login -u ${DockerHubUsername} -p ${DockerHubPass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
