pipeline{
    agent{
        docker{
            image 'maven:3.8-openjdk-17'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

    stages{
        stage('Checkout'){
            steps{
                checkout scm
            }
        }

        stage('compile'){
            steps{
                sh 'mvn compile'
            }
        }

        stage('Unit Tests'){
            steps{
                sh 'mvn test'
            }

            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Integration tests'){
            steps{
                sh 'mvn verify -DskipUnitTests'
            }
        }

        stage('SonarQube Analysis'){
            when{
                expression {env.BRANCH_NAME == 'main'}
            }

            steps{
                withSonarQubeEnv('sonar-server'){
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Build Package'){
            steps{
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Docker Build'){
            when{
                expression {env.BRANCH_NAME == 'main'}
            }

            steps{
                script{
                    def image = docker.build("mon-app-java:${env.BUILD_NUMBER}")
                    image.push()
                }
            }
        }
    }
}