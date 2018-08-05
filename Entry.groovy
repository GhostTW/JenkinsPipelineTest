@Library("shared-library") _

echo "Entry"
pipeline {
    agent none

    stages {
        stage('Parallel Build') {
            steps {
                parallelBuild {
                    [Product= 'rtx', Name= 'ghost', Is= 'true']
                }
            }
        }
    }
}