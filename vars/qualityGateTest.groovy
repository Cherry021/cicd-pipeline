def call(cid){
    waitForQualityGate abortPipeline: false, credentialsId: cid
}