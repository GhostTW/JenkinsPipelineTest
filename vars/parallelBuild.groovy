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
                steps {
                    echo "Update ${config.Name} ${config.Product} ${config.Is}"
                }
            }
            stage('Build') {
                steps {
                    echo "Build ${config.Name} ${config.Product} ${config.Is}"
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploy ${config.Name} ${config.Product} ${config.Is}"
                }
            }
        // }
    }
}