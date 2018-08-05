@Library("shared-library") _

echo "Entry"
pipeline {
    agent none

    stage('Parallel Build') {
        script {
            parallelBuild {
                [Product= 'rtx', Name= 'ghost', Is= 'true']
            }
        }
    }
}