pipeline {
    agent any

    tools {
        maven 'Maven 3.8.8'     // Make sure this matches the Maven name in Jenkins global config
        jdk 'Java 17'           // Make sure this matches the JDK name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Abin-Isaac/LoginAutomation.git', branch: 'main'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/*.*', fingerprint: true

        }
    }
}
