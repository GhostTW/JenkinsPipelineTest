@Library('utils') _

node {
    def product = 'rtx'
    echo Name
    echo Is
    echo product
    def config = ['Name': Name, 'Is': Is, 'Product': product]
    echo config.Name
    echo config.Is
    echo config.Poduct
    ParallelBuild config
}