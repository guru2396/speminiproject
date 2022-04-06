pipeline {
    agent any

    stages {
        stage('Clone project') {
            steps {
                git 'https://github.com/guru2396/speminiproject.git'
                echo 'Project cloned'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn clean install'
                echo 'Maven build completed'
            }
        }
        stage('Test'){
            steps {
                sh 'mvn test'
                echo 'Testing completed'
            }
        }
        stage('Build image'){
            steps {
                echo 'creating docker image'
                sh 'docker build -t calc:latest .'
                echo 'docker image created'
            }
        }
        stage('Push image to docker hub'){
            steps {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml'
            }
        }
    }
}