node {
    
	stage("Clone a Repo"){
        checkout([$class: 'GitSCM', branches: [[name: 'october2021']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/jenkins-class.git']]])
    }
	stage("Build EC2"){
		ws("${workspace}/AWS/EC2"){
            sh "ENVIRONMENT=${ENVIR}   make tf-fmt  tf-init  tf-plan  tf-${TF_ACTION}"
        }
    }
	stage("Send Notification"){
		echo "hello"
    }
}
