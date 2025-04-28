pipeline {
    agent any
    tools{
        maven 'M2_HOME'
    }

    stages {
        stage('Checkout SCM') {
            steps {
                git branch: 'master',
                    credentialsId: 'devopsdemo',
                    url: 'https://github.com/sharwanNotes/mycodes.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn package'
            }
        }
    }
}
