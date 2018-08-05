@Library("shared-library") _

echo "Entry"
node {
    parallelBuild {
        [Product= 'rtx', Name= 'ghost', Is= 'true']
    }
}