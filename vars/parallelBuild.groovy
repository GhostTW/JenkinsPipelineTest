def call(body) {
    echo "parallelBuild"

    stage('Update') {  
        echo "Update ${Name} ${Product} ${Is}" 
    } 
    stage('Build') { 
        echo "Build ${Name} ${Product} ${Is}" 
    } 
    stage('Deploy') { 
        echo "Deploy ${Name} ${Product} ${Is}" 
    }
}