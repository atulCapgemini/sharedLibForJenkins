def call(String filter_string,int occurence){
  def logs = currentBuild.rawBuild.getlog(10000).join('\n')
  int count = StringUtils.countMatches(logs,filter_string); 
  if(count>occurence-1){
    currentBuild.result = "UNSTABLE"
  }
}
