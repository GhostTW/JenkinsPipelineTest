def call(Closure body) {
    // node {
    //     parallel {
    //         stages {
    //             stage 'Update' { 
    //                 echo "Update ${product} ${name} ${is}"
    //             }
    //             stage 'Build' { 
    //                 echo "Build ${product} ${name} ${is}"
    //             }
    //             stage 'Deploy' { 
    //                 echo "Deploy ${product} ${name} ${is}"
    //             }
    //         }
    //     }
    // }
    node {
        echo body
        echo "${product} ${name}"

    }
}