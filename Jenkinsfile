pipeline {
    agent any

    environment{
        DOCKERHUB_CREDENTIALS=credentials('docker-hub-creds')
    }

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
                echo 'docker tag'
                sh 'docker tag calc gururajmujumdar/calc:latest'
                echo 'docker login'
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                echo 'Pushing image to hub'
                sh 'docker push gururajmujumdar/calc'
                echo 'docker logout'
                sh 'docker logout'
            }
        }
        stage('Pull image from docker hub'){
            steps {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml'
            }
        }
    }
}