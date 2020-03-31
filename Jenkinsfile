pipeline {
  agent any
  environment {
      VERSION = "1.5.0"
      APP_NAME = "BURGASM-APP"
  }

  stages {
        stage("Build") {
            steps {
                echo 'echo Building Stage'
                echo "The name of app is ${APP_NAME} and the version is ${VERSION}"
            }
        }

        stage("Test") {
            steps {
                echo 'echo Testing Stage'
            }
        }

        stage("Deploy"){
            steps {
                echo 'echo Deploying Stage'
            }
        }
    }   
}
