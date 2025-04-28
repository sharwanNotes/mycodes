pipeline {
    agent any

    tools {
        maven 'M2_HOME'  // Make sure this matches the name in Jenkins global tools
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
                bat 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                // Example: Copying .war or .jar file to a deploy directory
                bat 'copy target\\*.jar C:\ProgramData\Jenkins\.jenkins\workspace'
            }
        }
    }
}
