
//dev jenkins pipeline
pipeline
{
    
   agent any
   tools
   {
      maven "maven-3.9.13"
   }
   stages
   {
           stage('git checkout')
           {
              steps
              {
                 
                 git branch: 'dev', url: 'https://github.com/lokesh-tatikonda/maven-webapplication-project-kkfunda.git'
              }
           }
           stage('compile')
           {
              steps
              {
                 sh "mvn compile"
              }
           }
           stage('Build')
           {
             steps
             {
               sh "mvn clean package"
             }
           }
         stage('SQ REPORT')
           {
             steps
             {
                sh "mvn sonar:sonar"
             }
           }   
          /* stage('Deploy to nexus')
           {
              steps
              {
                sh "mvn clean deploy"
              }
           }*/
           stage('Deploy to tomcat')
           {
              steps
              {
                 sh """

      curl -u lokesh:lokesh \
--upload-file /var/lib/jenkins/workspace/DL-PL/target/maven-web-application.war \
"http://107.20.70.6:8080/manager/text/deploy?path=/maven-web-application&update=true"
          
        """
              }
           }
          /* stage('airtel-qa')
           {
              steps
              {
                 build job: 'airtel-qa'  //This down stream job
              }
           }*/

   }  //stages ending

   } //pipeline ending





