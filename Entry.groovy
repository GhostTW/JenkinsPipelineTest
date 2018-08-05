@Library("shared-library") _

echo "Entry"
node {
    stage('pipeline') {
        step {
            parallelBuild {
                [Product= 'rtx', Name= 'ghost', Is= 'true']
            }
        }
    }
}