@Library("shared-library") _

echo "Entry"
node {
    stage('pipeline') {
        pipeline {
            parallelBuild {
                [Product= 'rtx', Name= 'ghost', Is= 'true']
            }
        }
    }
}