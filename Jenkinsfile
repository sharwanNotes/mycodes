pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
    }
    stages {
        stage('Checkout SCM') {
            steps {
                git branch: 'master',
                    credentialsId: 'devopsdemo',
                    url: 'https://github.com/sharwanNotes/seconApp.git'
            }
        }
        stage('Build') {
            steps {
                withMaven(maven: 'Maven 3.8.6') {
                    bat 'mvn clean package'
                }
            }
        }
    }
}
