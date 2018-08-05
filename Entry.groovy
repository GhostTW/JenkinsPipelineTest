@Library("shared-library") _

echo "Entry"
pipeline {
    agent none

    stages {
        stage('Parallel Build') {
            steps {
                script {
                    parallelBuild {
                        [Product= 'rtx', Name= 'ghost', Is= 'true']
                    }
                }
            }
        }
    }
}