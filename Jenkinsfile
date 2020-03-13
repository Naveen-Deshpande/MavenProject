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
            stage("Consolidate Results") {
                  steps {
                        input("Do you want to save the results ?")
                        junit '**/target/surefire-reports/TEST-*.xml'
                        archiveArtifacts 'target/*.jar'
                  }
            }
            stage("Email Build Status") {
                  steps {
                        mail body: 'Sample body', cc: '', from: '', replyTo: '', subject: 'Sample Subject', to: 'gurumadhav08@gmail.com'
                  }
            }
       }
}
