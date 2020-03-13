pipeline {
      agent any 
      stages {
            stage("Parallel Execution") {
                  steps {
                        parallel (
                              a: { bat "mvn clean" },
                              b: { bat "mvn test" },
                              c: { bat "mvn package }
                        )
                  }
            }
            stage("Consolidate Results") {
                  steps {
                        input("Do you want to save the results ?")
                        junit '**/target/surefire-reports/TEST-*.xml'
                        archiveArtifacts 'target/*.jar'
                  }
            }
       }
}
