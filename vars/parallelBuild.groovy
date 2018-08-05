def call(body) {
    echo "parallelBuild"
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    echo "body()"
    pipeline {
        agent none
        stages {
            stage('Update') {
                echo "Update ${config.Name} ${config.Product} ${config.Is}"
            }
            stage('Build') {
                echo "Build ${config.Name} ${config.Product} ${config.Is}"
            }
            stage('Deploy') {
                echo "Deploy ${config.Name} ${config.Product} ${config.Is}"
            }
        }
    }
}