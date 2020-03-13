pipeline {
      agent any 
      stages {
            stage("Cleaning Stage") {
                  steps {
                      bat "mvn clean"
                  }
            }
            stage("Testing Stage") {
                   steps {
                        bat "mvn test"
                   }
            }
            stage("Packaging Satge") {
                  steps {
                      bat "mvn package"
                  }
            }
       }
}
