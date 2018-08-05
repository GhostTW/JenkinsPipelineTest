def call(body) {
    echo "parallelBuild"
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    echo "body()"
    pipeline {
        // stages {
            stage('Update') { 
                step {
                    echo "Update ${config.Name} ${config.Product} ${config.Is}"
                }
            }
            stage('Build') {
                step {
                    echo "Build ${config.Name} ${config.Product} ${config.Is}"
                }
            }
            stage('Deploy') {
                step {
                    echo "Deploy ${config.Name} ${config.Product} ${config.Is}"
                }
            }
        // }
    }
}