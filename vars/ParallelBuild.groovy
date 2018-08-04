def call(Map config) {
    node {
        parallel {
            stages {
                stage 'Update' { 
                    echo "Update ${config.product} ${config.name} ${config.is}"
                }
                stage 'Build' { 
                    echo "Build ${config.product} ${config.name} ${config.is}"
                }
                stage 'Deploy' { 
                    echo "Deploy ${config.product} ${config.name} ${config.is}"
                }
            }
        }
    }
}