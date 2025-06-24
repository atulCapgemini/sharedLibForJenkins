def call(String filter_string, int occurrence) {
 def logs = currentBuild.rawBuild.getLog(10000).join('\n')
 int count = logs.count(filter_string)
   if (count > occurrence - 1) {
    currentBuild.result = "UNSTABLE"
   }
}
