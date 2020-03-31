def buildApp() {
    echo 'Building Stage'
    echo "The name of app is ${APP_NAME} and the version is ${VERSION}"
}

def testApp() {
    echo 'Testing the Burgasm App'
}

def deployApp() {
    echo 'Deploying the Burgasm App'
}

return this