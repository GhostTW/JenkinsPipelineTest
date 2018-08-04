def call(config) {
    node {
        parallel {
            stages {
                stage 'Update' { 
                    echo "Update ${config.Product} ${config.Name} ${config.Is}"
                }
                stage 'Build' { 
                    echo "Build ${config.Product} ${config.Name} ${config.Is}"
                }
                stage 'Deploy' { 
                    echo "Deploy ${config.Product} ${config.Name} ${config.Is}"
                }
            }
        }
    }
}