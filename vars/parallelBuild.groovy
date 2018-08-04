def call(String product) {
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
    echo "${product}"
}