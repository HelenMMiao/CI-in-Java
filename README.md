# CI-in-Java
Xray, Java, IntelliJ, Jenkins, Maven

Below explains what I did in sequence

Set up my own Jira instance in https://helennz.atlassian.net/jira/your-work. 
And then add Xray as test management.
Create Epic, Story, Test Cases, Test Plan, Test Execution.

Open Test Execution in Xray and explort it. 
Then automate it in Java.
Run it successfully. 
Import test result successfully.

Install Jenkins locally and install suggested plugins. 
Install Maven and Xray plugins and configure them.
And then run from Jenkins will update the result in Jira-Xray.

Please set HOME_JAVA to JDK11, so that Jenkins could run perfect. 
Do not specify any JDK version in pom.xml, but default JDK11 will work fine for maven project.



