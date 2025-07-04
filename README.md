Entrata Automation Assignment:

Running Steps:-

Note: Select "Master" branch from git.

1 go to my git hub account --> VipinBorole7601 or https://github.com/VipinBorole7601/Entrata.git (master)

2 click on code and select download zip this will download project file to you.

3 Extract this zip file in your laptop

4 Open Eclipse IDE/Intellij --> click open project --> select project from downloaded folder> select folder --> finish

5 Wait until project completly loaded in Exclipse/intellij workspace

6 Right click on project click on show in Local Terminal --> select Terminal

7 Now in this Terminal write following command

--> mvn clean

wait until it execute then next command on same terminal

--> mvn test

8 Execution started 

9 also after the run is completed , target folder has extent reprot folder in it copy absolute path of
the .html file open any browser paste in URL bar. (to see the report and test status)

20 surefire reports folder all test report e.g target/surefire-reports/All Test Suite/C__Users_vipin_Intellij Projects_Entrata.html
also refer those reports. 

Project discription and strategy used in this Framework

1 here I used a Maven Architype Project with TestNG Framework

2 I create a POM model to execute my test cases

3 as you see the folders src/main/java --> contains Pages package which has page element adress and oprational methods

4 in src/test/java ---> I create a Tests package , Basec package,Extent report package,Test package

5 added my required dependencies in pom.xml tile

6 to run my project I have my testng.xml file

7 I used the POM hybrid/TDD Framework 


Project Flow :

You can run the file code using testng.xml , just right click on testng.xml and select run.