@Library("shared-library") _

echo "Entry"
node {
    pipeline {
        parallelBuild {
            [Product= 'rtx', Name= 'ghost', Is= 'true']
        }
    }
}