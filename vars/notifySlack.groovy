slackSend(color: '#05FA1D', message:"${currentBuild.currentResult}: ${env.BUILD_NUMBER}, Branch Name: ${env.BRANCH_NAME}, URL: ${env.BUILD_URL}", channel:'#all-lokesh') 
