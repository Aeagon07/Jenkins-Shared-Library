def call(String projectName, String imageTag, String dockerHubUser){
  sh "docker buit -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
