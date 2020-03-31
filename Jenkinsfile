pipeline {
  agent any
  environment {
      VERSION = "1.5.0"
      APP_NAME = "BURGASM-APP"
  }
  parameters {
      string(name: "FIRST_NAME", defaultValue: 'Mohammed')
      choice(name: "ENV", choices: ['DEV', 'PROD'])
  }
  stages {
        stage("Init"){
            steps {
                script{
                    groovy = load "script.groovy"
                }
            }
        }
        stage("Build") {
            steps {
                script {
                    groovy.buildApp()
                }
            }
        }

        stage("Test") {
            steps {
                echo 'echo Testing Stage'
            }
        }

        stage("Deploy"){
            when {
                expression {
                    params.ENV == "DEV"
                }
            }
            steps {
                echo 'echo Deploying Stage'
            }
        }
    }   
}
