pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {

        stage ('Build') {
            steps {
                bat 'mvn -f D:/project/tutorial/impt/BackEndServer clean package' 
            }
        }
    }
    post {
        success {
            bat 'D:\\project\\tutorial\\impt\\BackEndServer\\deploy.bat'
        }
    }
}