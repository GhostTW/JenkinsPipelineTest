@Library("shared-library") _

echo "Entry"
pipeline {
    parallelBuild {
        [Product= 'rtx', Name= 'ghost', Is= 'true']
    }
}