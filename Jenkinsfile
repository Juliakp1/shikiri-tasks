pipeline {
    agent any
    stages {
        stage('Jenkins Task') {
            steps {
                echo 'Task Interface'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}