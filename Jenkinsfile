pipeline{
    agent any
    stages {
        stage('Build App'){
            steps{
		        echo "Build App now......"
                sh "rm -rf SpringBootHelloWorld3"
                sh "git clone https://github.com/hugo01718/SpringBootHelloWorld3.git/"
                sh "mvn clean -f SpringBootHelloWorld3"
                sh "mvn package -f SpringBootHelloWorld3"
                sh "mvn install dockerfile:build"
                
		        //sh "docker login -u hugo01718 -p 213456789"
		        //sh "docker push springboot_dockerimage"
            }
        }
        stage('Deploy DEV'){
            steps{
                echo "Deploy DEV now......"
                //openshift.withCluster(){
                    //oc login -u hugo01718 -p 213456789
                    //oc project qa
                //}
                sh "oc login -u hugo01718 -p 213456789"
                sh "oc project dev"
                sh "oc new-app springboot_dockerimage"
            }
        }
        stage('Promote to UAT'){
            steps{
                input "Deploy to UAT?"
            }
        }
        stage('Deploy UAT'){
            steps{
                echo "Deploy UAT now......"
                //openshift.withCluster(){
                    //oc login -u hugo01718 -p 213456789
                    //oc project qa
                //}
                sh "oc login -u hugo01718 -p 213456789"
                sh "oc project qa"
                sh "oc new-app springboot_dockerimage"
            }
        }
    }   
}
