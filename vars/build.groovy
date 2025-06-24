def call(String mvnaction){
  if(mvnaction == "clean"){
    sh "mvn clean"
  }
  else if(mvnaction == "compile"){
    sh "mvn clean compile"
  }
  
  else if(mvnaction == "clean"){
    sh "mvn clean test
  }
  
  else if(mvnaction == "install"){
    sh "mvn clean install"
  }
}
