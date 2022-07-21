#!/usr/bin/groovy

node("master"){

    def workspace = env.WORKSPACE;

    try{

        stage("Clone"){
            checkout([
                $class: 'GitSCM',
                branches: [[name: "master"]],
                doGenerateSubmoduleConfigurations: false,
                extensions: [[
                    $class: 'RelativeTargetDirectory',
                    relativeTargetDir: "${workspace}"
                ]],
                submoduleCfg: [],
                userRemoteConfigs: [[
                    credentialsId: 'githubSSHMichaelUfuoma',
                    url: 'git@github.com:mikeufuoma/TaxCalculator.git'
                ]]
            ])
        }
        
        stage("Test"){
            sh "${workspace}/gradlew test"
        }

        stage("Compile Artifact"){
            sh "${workspace}/gradlew build -x test"
        }

    } catch(err){
        println err;
        currentBuild.result = "FAILURE"
        error(err)
    }
}