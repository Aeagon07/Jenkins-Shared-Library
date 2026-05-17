def call(String projectName, String imageTag, String dockerHubUser) {
    sh """
    export NODE_OPTIONS="--max-old-space-size=384"

    docker build -t ${dockerHubUser}/${projectName}:${imageTag} .
    """
}
