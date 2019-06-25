pipeline {
	agent {
		docker {
			image 'maven:3.6.1-jdk-11'
			args '-v /root/.m2:/root/.m2'
		}
	}
	stages {
		stage('Build') {
			steps {
				sh 'mvn -B -Dskiptests clean package'
			}
		}
		stage('Test') {
			steps {
				sh 'mvn -B test'
			}
			post {
				always {
					junit 'target/surefire-reports/*.xml'
				}
			}
		}
	}
}
