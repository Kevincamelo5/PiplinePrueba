pipeline {
    agent any

    tools {
        maven 'Maven 3.8.8'
        jdk 'JDK 11'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tu-usuario/Prueba.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
