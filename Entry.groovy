@Library("shared-library") _

echo "Entry"
parallelBuild {
    [Product= 'rtx', Name= 'ghost', Is= 'true']
}