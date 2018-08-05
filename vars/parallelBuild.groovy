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
                steps {
                    step {
                        echo "Update ${config.Name} ${config.Product} ${config.Is}"
                    }
                }
            }
            stage('Build') {
                steps {
                    step {
                        echo "Build ${config.Name} ${config.Product} ${config.Is}"
                    }
                }
            }
            stage('Deploy') {
                steps {
                    step {
                        echo "Deploy ${config.Name} ${config.Product} ${config.Is}"
                    }
                }
            }
        }
    }
}