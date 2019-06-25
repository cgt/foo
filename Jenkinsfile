pipeline {
	agent {
		docker {
			image 'maven:3.6.1-jdk-11'
			args '-v /root/.m2:/root/.m2'
		}
	}
	stages {
		stage('Build') {
			sh 'mvn -B -Dskiptests clean install'
		}
	}
}
