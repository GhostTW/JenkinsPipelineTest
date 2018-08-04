def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    node {
        parallel {
            stages {
                stage 'Update' { 
                    echo "Update ${Product} ${Product} ${Is}"
                }
                stage 'Build' { 
                    echo "Build ${Product} ${Product} ${Is}"
                }
                stage 'Deploy' { 
                    echo "Deploy ${Product} ${Product} ${Is}"
                }
            }
        }
    }
}