def call(body) {
    body.resolveStrategy = Closure.DELEGATE_FIRST
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