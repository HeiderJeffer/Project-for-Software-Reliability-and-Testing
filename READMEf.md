Software Reliability and Testing 
Professor Barbara Russo

Document Status: Final Documentation
Date: June 28th, 2018

Developed by
Ayokunmi Tolulope Opaniyi
Heider Jeffer



Free University of Bozen-Bolzano
Faculty of Computer Science
Dominikanerplatz 3 - piazza Domenicani, 3
Italy - 39100, Bozen-Bolzano

 









     












Contents
Goal of the project	2
Project Tasks	2
Requirements	2
Live Versions	2
Way to contribute	3
Name of project and components’ members	3
1st Assignment	3
2nd Assignment	5
Challenges	11
Conclusion	11

Goal of the project 
Include a "readMe.md" file in which you report your project. The file shout describes at least the following items:
1.	Name of the project and components' members.
2.	Activities performed for Task 1 and Task 2.
3.	Testing Strategies chosen for Task 1 and Task 2
4.	Initial combinations and reduction obtained with your strategies
5.	Challenges you faced and the solutions you performed
6.	Highlight the code snippets that show your best contribution to the project
7.	Final reflection on the testing and results of your work
Project Tasks
1.	Assignment 1: Reduce the number of combinations
2.	Assignment 2: Create test cases that check the valid combination of data (CombinationLine)
3.	AYO Project for Würth Phoenix: Implementation of Assignment 1 and Assignment 2 in Würth Phoenix Company
Requirements
•	Java
•	GitHub Desktop
•	GitBash
•	Sublime editor
•	Flow chart diagrams online
Live Versions
AYO ( https://gitlab.inf.unibz.it/Heider.Jeffer/AYO )
Way to contribute
•	Clone this repository (https://gitlab.inf.unibz.it/Heider.Jeffer/AYO.git)
•	Or if you already cloned it go to master branch with git checkout master and then git pull
•	Do some changes
•	Then push the code git push
•	Submit a pull request for review (Lecturer, Company Developers, etc.) 
Name of project and components’ members
•	AYO Project for Würth Phoenix Software Reliability and Testing 2017/2018
•	Ayokunmi Opaniyi 
•	 Heider Jeffer 

1st Assignment 
-Reduce the number of combinations
•	Test class
src/com/wuerth/phoenix/cis/university/example1/test/Test.java
•	Dependency
JUnit4 and JRE System Library.
•	Total combinations and reduction strategy
Total combinations were 302, which was generated automatically.
Steps of CombinationGenerator.java to reduce the combinations were:
•	Read Account.csv
-	skipped 1st row (table header)
-	skipped 1st column because getCode () method from Account.java is not used as a valid criterion in Example1Checker.java
-	removed duplicates from 1819 rows to 23 rows

•	Read CRComponent.csv
-	skipped 1st row (table header)
-	skipped 1st column because getName () method from CRComponent.java is not used as a valid criterion in Example1Checker.java
-	removed duplicates from 21 rows to 3 rows

•	Read ProfitCenter.csv
-	skipped 1st row (table header)
-	skipped 1st column because getName() method from ProfitCenter.java is not used as an valid   criteria in Example1Checker.java
-	removed duplicates from 78 rows to 2 rows

•	Combined Account, CRComponent, and ProfitCenter from 23 x 3 x 2 to 138 rows



•	Combined previous list with input of
external {"true, "false"}
dataScenarioType {"Actual", "Deferral", "Extrapolation", "Target", "Plan"}
partnerCode {"Yes", ""}
currencyCode {"Yes", ""}

•	Filtered valid combinations by passing object to isValid() method and wrote 302 combinations to Combination.csv
 
•	Implemented unit test by using parameterized test and read reduced combinations in Combination.csv, the implemented unit test can be found in src/com/wuerth/phoenix/cis/university/example1/test/Test.java
 
•	Unit test result
 
•	Combinations
 
2nd Assignment 
 Create test cases that check the valid combination of data (CombinationLine)
•	Activities performed for Task 2
•	Test Data class
src/com/wuerth/phoenix/cis/university/example2/test/Ayo/EngineTestData.java
•	Dependency
Source codes from company, JUnit4, and JRE System Library.

•	Create CSV file - Git and Continuous Integration 
We generated more than 16 csv file for the output. Now we able to generate automatically our outputs in csv after every running test, then these csv files will be saved in a folder that we created. Then we use Git for continuous integration to push the changes between our local machine and online project (AYO) 
‘Git – Continuous Integration 
 

Automatic output csv file generating 

 




Sample for our output in CSV file form 

  
 































•	Würth Phoenix All Implementations 
-	Modifying the code
-	Setup Ayo project 
-	Connect AYO project with Remote Desktop Connection at Würth Phoenix
-	Modify Eclipse and the Run configuration 
-	Execute the project for several times to check out the results 
•	JUnit test Würth Phoenix 
 
 

Reducing the Combination
•	Before
-	Before Reduced Combination - Remote Desktop at Würth Phoenix lab 2018 May 25th
-	Before the reduction we have 139 combinations (image-highlighted)

Then we got the following results:
 - 1st Combination (with 6 lines)
- 2nd Combination (with 139 lines)
- 3rd Combination (with 3 lines)
- 4th Combination (with 9 lines)
- 5th Combination (with 12 lines)
- 6th Combination (with 3 lines
 
   
•	After 
-	After modifying the code
-	After modifying the code at EngineTestData.Java 
-	See the Highlight the code snippets that show our best contribution to the project) 

Then we got the following results
-	1st Combination (with 6 lines)
-	2nd Combination (with 105 lines)
-	3rd Combination (with 3 lines)
-	4th Combination (with 9 lines)
-	5th Combination (with 12 lines)
-	6th Combination (with 3 lines)
 














The reduced combination will be (105) as it shows in the highlighted image below:  
 
•	Final test of execution times
-	After reducing the combination - Remote Desktop at Würth Phoenix lab 2018 May 25th.
-	We run Junit test for ten times 
-	the running time test for our project is less than 79 Time/s. 

NO.	TIME/S
01	67.938
02	63.926
03	60.906
04	59.718
05	66.382
06	59.422
07	58.133
08	60.487
09	60.044
10	59.001
TOTAL	616.057






•	Possible Errors Found
During the execution of the combinations the system encounter the following possible errors.
 
Challenges
1.	There was a communication gap with the company.
2.	Developing the code locally i.e. no access to the company's system.
3.	Issues with understanding the domain.
4.	Initial issues with gaining an overall view of the system.
Conclusion 
This project tasks and the codes have been approved by developers of at Würth Phoenix. In the presentation at Würth Phoenix company, the developer at Würth Phoenix showed us their tests and the comparison of each team. The result, as the developer says, according to their investigation was that AYO team hit the best result in term of performance and testing, and it satisfied task 1 and 2. The developers promised us to send the excel file as recommendation on our behalf.	


Thank you in Advanced,
Ayokunmi Tolulope Opaniyi and Heider Jeffer
