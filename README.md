# AYO Project for Würth Phoenix Software Reliability and Testing 2017/2018
- [Java](http://www.eclipse.org/downloads/eclipse-packages/) is programming languages used in this repository. AYO is a Java application Project for [Würth Phoenix](https://www.wuerth-phoenix.com/en/). AYO is the project application for [Software Reliability and Testing 2017/2018](http://www.inf.unibz.it/~russo/SoftwareReliabilityTesting.html).

# Developers
* [Opaniyi Ayokunmi Tolulope](https://goo.gl/UMFRH2)
* [Heider Jeffer]( https://goo.gl/JgQb8f)

# Project Tasks 
- [X] [Assignment 1: Reduce the number of combinations](https://goo.gl/6fKDuY)
- [X] [Assignment 2: Create test cases that check the valid combination of data (CombinationLine)](https://goo.gl/5ZsKNg)
- [X] [AYO Project for Würth Phoenix: Implementation of Assignment 1 and Assignment 2 in Würth Phoenix Company](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/tree/master/Ayo%20remote%20desktop%20Connection)

## Partners
- [Master](https://gitlab.inf.unibz.it/Barbara.Russo/VV1718_Master.git)
- [Gretas](https://gitlab.inf.unibz.it/Thora.Markert/VV1718_Gretas.git)
- [Milk](https://gitlab.inf.unibz.it/Kamolchanok.Tangsri1/VV1718_Milk)
- [relax](https://gitlab.inf.unibz.it/DamiriBurlian.Triando/VV1718_relax)
- [RIES](https://gitlab.inf.unibz.it/RIES/VV1718_RIES)
- [Lemon](https://gitlab.inf.unibz.it/LuciaEve.Berger/VV1718_Lemon)

# AYO Project Obtains Two Assignments:
### [A] Assignment 1: Reduce the number of combinations
The goal of this task is to design and develop in Java test cases that can reduce the combinations foreseen in the data csv files.
( more info goto [ole](https://ole.unibz.it/mod/assign/view.php?id=32011) ). Use JUnit 4 to create the annotate tests and the Unit runner 
Parameterized or the TestRule. Create a repository in gitlab.in.unibz.it for your code. 

### [B] Assignment 2: Create test cases that check the valid combination of data (CombinationLine)
The goal is to recreate the class called SampleTestEngineData with different combinations (exhaustively going through the enumerations and
the possible free values). (for mor info goto [ole](https://ole.unibz.it/mod/assign/view.php?id=33792) ).

# Briefings, Contributors, Commits,,,etc. at: 
* [Würth Phoenix Briefings by Heider and Opaniyi](example2/Würth Phoenix Briefings by Heider and Opaniyi.md)
* [Commits](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/commits/master)
* [Contributors](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/graphs/master)
* [Graph](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/network/master)
* [Charts](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/graphs/master/charts)
* [Cycle Analytics](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/cycle_analytics)
* [Activity](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/activity)


# Requirements
* [Java](http://www.eclipse.org/downloads/eclipse-packages/)
* [GitHub Desktop]( https://desktop.github.com/)
* [GitBash](https://git-scm.com/downloads)
* [Sublime editor](https://www.sublimetext.com/)
* [Flow chart diagrams online](https://www.lucidchart.com/users/login)


# Live Versions
[AYO](https://goo.gl/cfccos)

# Way to contribute
1. Clone this repository (https://gitlab.inf.unibz.it/Heider.Jeffer/AYO.git)
2. Or if you already cloned it go to `master` branch with `git checkout master` and then `git pull`
3. Do some changes
4. Then push the code git push
5. Submit a pull request for review


# [A] Assignment - Reduce the number of combinations
## Test class
`src/com/wuerth/phoenix/cis/university/example1/test/Test.java`
## Dependency
```ruby
JUnit4 and JRE System Library.
```
## Total combinations and reduction strategy
```ruby 
Total combinations was 56, which was generated automatically by `CombinationGenerator.Java`
`src/com/wuerth/phoenix/cis/university/example1/test/CombinationGenerator.Java`
```

Steps of `CombinationGenerator.java` to reduce the combinations were:
* Read `Account.csv`
    * skipped 1st row (table header)
    * skipped 1st column because `getCode()` method from `Account.java` is not used as an valid criteria at `Example1Checker.java`
    * removed duplicates from 1819 rows to 23 rows

* Read `CRComponent.csv`
    * skipped 1st row (table header)
    * skipped 1st column because `getName()` method from `CRComponent.java` is not used as an valid criteria at `Example1Checker.java`
    * removed duplicates from 21 rows to 3 rows

* Read `ProfitCenter.csv`
    * skipped 1st row (table header)
    * skipped 1st column because `getName()` method from `ProfitCenter.java` is not used as an valid criteria at `Example1Checker.java`
    * removed duplicates from 78 rows to 2 rows

* Combined Account, CRComponent, and ProfitCenter from 23 x 3 x 2 to 138 rows
* Filtered valid combinations by passing object to `isValid()` method and wrote 56 combinations to `Combination.csv`
* Implemented unit test by using parameterized test and read reduced combinations at `Combination.csv`

The goal of this task is to design and develop in Java test cases that can reduce the combinations foreseen in the data csv files.  Use JUnit 4 to create the annotate tests and the Unit runner Parameterized or the TestRule. Create a repository in gitlab.in.unibz.it for your code. 

### SubTasks
- [X] Reduce the input combinations by automatically merging data from the three files: Account.csv, ProfitCenter.csv CRCComponents.csv. You can do it reading all files and creating a new file with all combinations or reading each file and create an object to pass to the isValid method with a valid combination. 

- [X] Use parametrised tests either with Parameterized runner or with RuleTest. For this you have first to implement a file.csv reader. See the files I uploaded in gitlab

- [X] Create a test for the method isValid() for each combination 

![Alt text](example2/data/Assignment 1 Reduce the number of combinations.PNG)



### Combinations
```ruby 
accountCode,accountClass,accountType,isPartnerAllowed,pcName,isNotAllocated,crName,isNotAllocated,isVKAllowed,isSEANAllowed,external,dataScenarioType,partnerCode,currencyCode
Code,Logistics,,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,AllocationFormula,,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,AllocationFormula,,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,AllocationFormula,,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,AllocationFormula,,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,AllocationFormula,,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,AllocationFormula,,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,BalanceSheet,,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,BalanceSheet,,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,BalanceSheet,AssetPartner,true,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,BalanceSheet,AssetPartner,true,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,BalanceSheet,,true,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,BalanceSheet,,true,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,Customer,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,Customer,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,Customer,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,Customer,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalyses,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesNumOfInvoicingDays,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SpecialAnalysesNumOfInvoicingDays,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesNumOfInvoicingDays,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesNumOfInvoicingDays,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SpecialAnalysesNumOfInvoicingDays,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesNumOfInvoicingDays,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SML,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SML,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SML,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SML,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SMLGrossProfit,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SMLGrossProfit,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SMLGrossProfit,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SMLGrossProfit,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SMLGrossProfit,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SMLGrossProfit,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SMLPotential,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SMLPotential,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SMLPotential,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SMLPotential,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SMLPotential,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SMLPotential,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SEAN,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SEAN,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesServiceDegree,false,ProfitCenter,true,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SpecialAnalysesServiceDegree,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesServiceDegree,false,ProfitCenter,true,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesServiceDegree,false,ProfitCenter,false,CRComponent,false,false,false,true,Actual,,
Code,SalesReporting,SpecialAnalysesServiceDegree,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,SpecialAnalysesServiceDegree,false,ProfitCenter,false,CRComponent,false,true,true,true,Actual,,
Code,SalesReporting,Employees,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,Employees,false,ProfitCenter,false,CRComponent,true,true,true,true,Actual,,
Code,SalesReporting,VK,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,PLStatement,PrognosisNumOfAdmDecember,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,PLStatement,PrognosisNumOfAdmMPlus1,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,PLStatement,PrognosisNumOfAdmMPlus2,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,PLStatement,PrognosisOperatingResult,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
Code,PLStatement,PrognosisSales,false,ProfitCenter,true,CRComponent,true,true,true,true,Actual,,
```



# [B] Assignment 2: Create test cases that check the valid combination of data (CombinationLine)
###  The goal
is to recreate the class called __SampleEngineTestData__ with different combinations (exhaustively going through the enumerations and the possible free values). (See image) 
![Alt text](example2/data/SampleEngineTestData recreated by Heider and Ayo.jpg)

### Pre-condition:
create a package called with your team name __(AYO)__ in the package test; in such new package create two classes one called __EngineTest__ and one called __EngineTestData__. In the former paste the code provided in the word document IEngineTestData. IEngineTestData by AYO (see image)
![Alt text](example2/data/EngineTestData recreated by Heider and Ayo.jpg)

### EngineTest
 EngineTest by AYO (See image)
![Alt text](example2/data/EngineTest created by Heider and Ayo.jpg)

### EngineTestData
EngineTestData recreated by Heider and Ayo (see image)
![Alt text](example2/data/EngineTestData recreated by Heider and Ayo.jpg)

* The latter must implement the class __IEngineTestData__. Such Interface has two abstract methods check(Scenario) and start() that you need to override in your implementation. How to override such methods for same exemplar combinations is described in the SampleEngineTestData.

### IEngineTestData
IEngineTestData by Heider and Ayo (see image) 
![Alt text](example2/data/IEngineTestData by Heider and Ayo.jpg)


### Sub-task1:
- understand all the static methods called __getNewCombinationItem()__ for valid combinations Such methods are defined in the 
- util.CombinationItem.java__ class Understand how settings are compounded in such class [see our solution](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/tree/master/example2)
- To understand the output of the of your scenario creation, build a method in the EngineTest class that calls the method generate in __util.FileGenerator__ class; this method creates a __PrintStream_ that allow you to save or show into the console the result of the combinations. [see our solution](https://gitlab.inf.unibz.it/Heider.Jeffer/AYO/tree/master/example2)


### Sub-task 2:
- Create different types of scenarios to pass to the check method. Use the __SampleEngineTestData__ as example for this task. 
- In our local machine we create folders for __csv__ file 
- csv created by Heider and Ayo (see file location):
```ruby 
C:\\Users\\Public\\test.csv")
```


### Create the Combination,Create the scenario,Compose the Scenario

-  ___Clone the Settings,Create the Combination,Create the scenario,Compose the Scenario created by Heider and Ayo___
-  In EngineTestData at (Settings) we modified this code (see codes):

```ruby
// Clone the Settings
			Settings settings = cloneSettings(implementedCompany, isLongVersion, isAcceptOrders, settingsTemplate, typeList);
			settings.setFilePath("C:\\Users\\Public\\test.csv");
			
			// Create the Combination
			Combination combination = createCombination(settings);
			if(combination != null && combination.getLineList().size() > 0) {
				
				// Create the scenario
				Scenario scenario = new Scenario(companyList, combination, settings);
				try {
					FileGenerator.generate(scenario);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Compose the Scenario
				System.out.println(checkName + ": " + combination.getLineList().size() + " lines, " + settings.getTypeList().size() + " columns");
				
			}
			
			return true;

```

### Create CSV file
CSV1 created by Heider and Ayo see at:
![Alt text](example2/data/EX2 CSV1 .png)


### Reduction Check
Here the reduction check excuted by Heider and Ayo. From (com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType) we checked the following reductions check:
* true true Reduction Check - 1: 6 lines, 9 columns
* true true Reduction Check - 2: 139 lines, 5 columns
* true true Reduction Check - 3: 3 lines, 5 columns
* true true Reduction Check - 4: 9 lines, 6 columns
* true true Reduction Check - 5: 12 lines, 6 columns
* true true Reduction Check - 6: 3 lines, 10 columns



### Combinations 
Here the combinations excuted by Heider and Ayo. We got 6 (Reduction Check) matrix each one of these six matrix has (i) lines and (j) columns:
```ruby
true true Reduction Check - 1: 6 lines, 9 columns
1.0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaa  1000 1420153200000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 1519858800000 1420066800000 
1.01 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab aaaaaaaaaaaaaaaaaaab aaaaaaaaaaaaaaaaaaaaa 8999 1420326000000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab 1519945200000 1420239600000 
1.02 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac aaaaaaaaaaaaaaaaaaad aaaaaaaaaaaaaaaaaaac 1000 1420498800000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac 1520031600000 1420412400000 
   aaaaaaaaaaaaaaaaaaae      
Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaab aaaaaaaaaaaaaaaaaaaf Abc Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Abc Abc 
1.03 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad aaaaaaaaaaaaaaaaaaah aaaaaaaaaaaaaaaaaaag 8999 1420671600000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad 1520118000000 1420585200000 
true true Reduction Check - 2: 139 lines, 5 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaaai   com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaaaj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Abc com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaak aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 1420758000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
 aaaaaaaaaaaaaaaaaaal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab 1420844400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaaam aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac 1420930800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaaan aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad 1421017200000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaao aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaae 1421103600000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaaap aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf 1421190000000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaaaq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaag 1421276400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaaar aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah 1421362800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaaas aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai 1421449200000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaaat aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaj 1421535600000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaau aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaak 1421622000000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaaav aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaal 1421708400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaaaw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaam 1421794800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaax aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaan 1421881200000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaaay aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaao 1421967600000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaaz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap 1422054000000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaba aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaq 1422140400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaabb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar 1422226800000  
 aaaaaaaaaaaaaaaaaabc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas 1422313200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaabd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat 1422399600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaabe aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau 1422486000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaabf aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaav 1422572400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaabg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaw 1422658800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaabh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaax 1422745200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaabi aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaay 1422831600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaabj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz 1422918000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaabk aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaba 1423004400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaabl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabb 1423090800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaabm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc 1423177200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaabn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabd 1423263600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaabo aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabe 1423350000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaabp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabf 1423436400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaabq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabg 1423522800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaabr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabh 1423609200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaabs aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabi 1423695600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
 aaaaaaaaaaaaaaaaaabt aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabj 1423782000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaabu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabk 1423868400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaabv aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabl 1423954800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaabw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabm 1424041200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaabx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabn 1424127600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaaby aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabo 1424214000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaabz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabp 1424300400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaaca aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabq 1424386800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaacb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabr 1424473200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaacc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabs 1424559600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaacd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabt 1424646000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaace aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabu 1424732400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaacf aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabv 1424818800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaacg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabw 1424905200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaach aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabx 1424991600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaci aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaby 1425078000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaacj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabz 1425164400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
 aaaaaaaaaaaaaaaaaack aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaca 1425250800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaacl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacb 1425337200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaacm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacc 1425423600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaacn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacd 1425510000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaaco aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaace 1425596400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaacp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacf 1425682800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaacq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacg 1425769200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaacr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaach 1425855600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaacs aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaci 1425942000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaact aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacj 1426028400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaacu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaack 1426114800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaacv aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacl 1426201200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaacw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacm 1426287600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaacx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacn 1426374000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaacy aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaco 1426460400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaacz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacp 1426546800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaada aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacq 1426633200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
 aaaaaaaaaaaaaaaaaadb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacr 1426719600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaadc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacs 1426806000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaadd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaact 1426892400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaade aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacu 1426978800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaadf aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacv 1427065200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaadg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacw 1427151600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaadh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacx 1427238000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaadi aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacy 1427324400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaadj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacz 1427410800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaadk aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaada 1427497200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaadl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadb 1427583600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaadm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadc 1427666400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaadn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd 1427752800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaado aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaade 1427839200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaadp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadf 1427925600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaadq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadg 1428012000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaadr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadh 1428098400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
 aaaaaaaaaaaaaaaaaads aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadi 1428184800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaadt aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadj 1428271200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaadu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadk 1428357600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaadv aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadl 1428444000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaadw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadm 1428530400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaadx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadn 1428616800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaady aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaado 1428703200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaadz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadp 1428789600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaaea aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadq 1428876000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaeb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadr 1428962400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaaec aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaads 1429048800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaaed aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadt 1429135200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaee aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadu 1429221600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaaef aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadv 1429308000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaeg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadw 1429394400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaeh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadx 1429480800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaaei aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaady 1429567200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
 aaaaaaaaaaaaaaaaaaej aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadz 1429653600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaaek aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaea 1429740000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaael aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeb 1429826400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaem aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaec 1429912800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaaen aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaed 1429999200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaaeo aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaee 1430085600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaaep aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaef 1430172000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaaeq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeg 1430258400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaaer aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeh 1430344800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaes aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaei 1430431200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaaet aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaej 1430517600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaaeu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaek 1430604000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaev aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaael 1430690400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaaew aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaem 1430776800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaex aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaen 1430863200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaey aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeo 1430949600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaaez aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaep 1431036000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
 aaaaaaaaaaaaaaaaaafa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeq 1431122400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaafb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaer 1431208800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaafc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaes 1431295200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaafd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaet 1431381600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaafe aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeu 1431468000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaaff aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaev 1431554400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaafg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaew 1431640800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaafh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaex 1431727200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaafi aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaey 1431813600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaafj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaez 1431900000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaafk aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafa 1431986400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaafl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafb 1432072800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaafm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafc 1432159200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaafn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafd 1432245600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaafo aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafe 1432332000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaafp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaff 1432418400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaafq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafg 1432504800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
true true Reduction Check - 3: 3 lines, 5 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaafr 1432591200000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaafs 1432677600000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaft 1432764000000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafh com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
true true Reduction Check - 4: 9 lines, 6 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaafu  1432850400000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaafv  1432936800000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaafw  1433023200000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafi com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaafx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad 1433109600000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaafy aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaae 1433196000000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaafz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaag 1433282400000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafj com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaga aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafk 1433368800000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaagb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafl 1433455200000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaagc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafm 1433541600000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafn com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
true true Reduction Check - 5: 12 lines, 6 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c   aaaaaaaaaaaaaaaaaagd 1433628000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai aaaaaaaaaaaaaaaaaage 1433714400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafo aaaaaaaaaaaaaaaaaagf 1433800800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 Abc  aaaaaaaaaaaaaaaaaagg 1433887200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaj aaaaaaaaaaaaaaaaaagh 1433973600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafp aaaaaaaaaaaaaaaaaagi 1434060000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93  aaaaaaaaaaaaaaaaaagj 1434146400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaak aaaaaaaaaaaaaaaaaagk 1434232800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafq aaaaaaaaaaaaaaaaaagl 1434319200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2  aaaaaaaaaaaaaaaaaagm 1434405600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaal aaaaaaaaaaaaaaaaaagn 1434492000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafr aaaaaaaaaaaaaaaaaago 1434578400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
true true Reduction Check - 6: 3 lines, 10 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaagp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafs 1434664800000    com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6   
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaagq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaft 1434751200000 Abc Abc Abc com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@7ea987ac Abc Abc 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaagr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafu 1434837600000 1434924000000 com.wuerth.phoenix.cis.university.example2.adapters.IFRS16VATRateType@3fee733d com.wuerth.phoenix.cis.university.example2.adapters.IFRS16PaymentCycle@5acf9800 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@12a3a380 com.wuerth.phoenix.cis.university.example2.adapters.IFRS16PaymentDateType@4617c264 1.04 

```


### Sub-task 3:
Find errors. Set a type of date format and pass a wrong combination of month, day, year input. 




# Würth Phoenix Briefings by Heider and Opaniyi

# Briefing 1 
with [Würth Phoenix Software Developer](https://www.wuerth-phoenix.com/en/career/details/?tx_news_pi1%5Bnews%5D=18&cHash=33f680a22deeef4d54f87ead46374752), The New Model for [UI’s](https://en.wikipedia.org/wiki/User_interface) input and the [Likelihood’](https://en.wikipedia.org/wiki/Maximum_likelihood_estimation) Problems. This document is a briefing for a discussion happened between AYO's Team and the [Würth Phoenix Software Developers](https://www.wuerth-phoenix.com/en/career/details/?tx_news_pi1%5Bnews%5D=18&cHash=33f680a22deeef4d54f87ead46374752) developer.

## New Model


[Würth Phoenix Software Developer](https://www.wuerth-phoenix.com/en/career/details/?tx_news_pi1%5Bnews%5D=18&cHash=33f680a22deeef4d54f87ead46374752) first reduced the UI input manually, then they performed some tests, and after the tests are done they checked the likelihood to improve the UI. 
Now, the question is: Is it possible to build a new model to reduce the UI’s input automatically? 
 
![Alt text](example2/data/CIS problem.jpeg)
 
 
  
## New Model and Likelihood Parameters


Knowing that answer to the above question, the [Würth Phoenix Software Developer](https://www.wuerth-phoenix.com/en/career/details/?tx_news_pi1%5Bnews%5D=18&cHash=33f680a22deeef4d54f87ead46374752) 
can use the [likelihood parameter](https://en.wikipedia.org/wiki/Maximum_likelihood_estimation) to improve the UI.


* If the answer of Q1 was __Yes__ (e.g. Yes, it is possible to build a new model to reduce the UI’s input) then the second question will be the following:
* Is the new model suitable to the likelihood parameter, 
* and if the answer is __No__ then is it possible to provide new parameters for the new model or not?

![Alt text](example2/data/Likelihood CIS New Mdel.jpeg)




# Briefing 2


## Problem

Würth Phoenix in ASIS form The [Würth Phoenix Software Developer](https://www.wuerth-phoenix.com/en/career/details/?tx_news_pi1%5Bnews%5D=18&cHash=33f680a22deeef4d54f87ead46374752) reduced the [big data](https://link.springer.com/article/10.1007/s41019-016-0022-0) manually.

![Alt text](example2/data/First Lab CIS.jpeg)


## Würth Phoenix in TOBE form:

 The company wants to build an algorithm to reduce the [big data](https://link.springer.com/article/10.1007/s41019-016-0022-0).


![Alt text](example2/data/Firs lab2.jpeg)







# Briefing 3

## Test

 This test is the one that the Würth Phoenix company needs to develop.

## Check Method

Würth Phoenix have to implement a function to combine the columns; in order tp reduce the data, and when the data reduced the Würth Phoenix run the test.

## Combination
 Würth Phoenix combines all valid combination, for each combination they checked the data.

## The adapted classes
 The Würth Phoenix do not allow an individual to access the database.

## Goal

The students have to find a way to check the functionality and the database without accessing the database.





#  Würth Phoenix labs: 11th May 2018 & 18th May 2018
## JUnit test

![Alt text](example2/data/1.PNG)



## Java Console

![Alt text](example2/data/3.PNG)


# Würth Phoenix lab 25th May 2018 
## Create Combination 
```ruby
We create (combination) for the typelist where some are (valid) and others are (not valid) and (conbinationline)
```

## File names and locations

### SampleEngineTestData

```ruby
C:\Users\Dell XPS 15\git\AYO\example2\src\com\wuerth\phoenix\cis\university\example2\test\sample\SampleEngineTestData.java
```


```ruby
public ArrayList<Company> createCompanyList() {
		
		ArrayList<Company> companyList = new ArrayList<>();
		
		for(String code : COMPANY_CODES) {
		
			Company company = new Company();
			company.setCode(code);
			companyList.add(company);
			
			for(CompanyType companyType : new CompanyType[] {CompanyType.PRODUCTIVE, CompanyType.CONSOLIDATED}) {
			
				ImplementedCompany implementedCompany = new ImplementedCompany();
				implementedCompany.setType(companyType);
				company.createChildImplementedCompany(implementedCompany);
			}
		}
	
```


## EngineTestData

```ruby
C:\Users\Dell XPS 15\git\AYO\example2\src\com\wuerth\phoenix\cis\university\example2\test\ayo\EngineTestData.java
```

```ruby	
	private boolean[][] createCombinations(int size) {
		int count = Double.valueOf(Math.pow(2,size)).intValue();
		boolean[][] map = new boolean[count][size];
		for(int columnIndex=0; columnIndex<size; columnIndex++) {
			int module = Double.valueOf(Math.pow(2,columnIndex)).intValue();
			boolean value = false;
			for(int index=0; index<count; index++) {
				map[index][columnIndex] = value;
				if((index+1) % module == 0) {
					value = !value;
```

### Create Matrix
```ruby
 * we create matrix for the combination type 
 * The matrix is with Boolean values: (0,1)
```





## Create Example adapter

From the matrix that we created we will select all the (1) values and we will ignore all the (0) values. (i.g See image):

![](example2/data/Example adapter.PNG)

__We will choose cell with value 1, therefor we will have these cells:__

[x] cell(1,1), cell(2,2) and cell(3,3) (see image)



# Würth Phoenix lab 2018 May 25th


```ruby
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin\.'
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin'
getTag(): consider 'C:\phxrepository\cis_dev\dev'
getTag(): consider 'C:\phxrepository\cis_dev'
getTag(): consider 'C:\phxrepository'
getTag(): consider 'C:\'
getTag(): 'UNKNOWN' found!
Using org.netbeans.jemmy.drivers.DefaultDriverInstaller driver installer
2018-05-25 11:27:45.462|getResource|File './data/TASKS.xml' found as 'file:/C:/phxrepository/cis_dev/test/classes/com/wuerth/phoenix/cis/test/menubar/data/TASKS.xml'|OutputChecker.log (enabled)
2018-05-25 11:28:01.514|getResource|File '/com/wuerth/phoenix/cis/images/note_view.png' found as 'file:/C:/phxrepository/cis_dev/dev/classes/com/wuerth/phoenix/cis/images/note_view.png'|OutputChecker.log (enabled)
Found boolean isDailySales(com.wuerth.phoenix.Cis.models.Company)
Found boolean isDailySalesGP(com.wuerth.phoenix.Cis.models.Company)
Found java.util.ArrayList getPossiblePartnerCompanyList(int, short, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isPossibleTISICO(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFactoring(com.wuerth.phoenix.Cis.models.Company)
Found boolean isNDS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isBODetailedPlan(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found void setLeasing(com.wuerth.phoenix.Cis.models.Company, boolean)
Found void onCompanyReset(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLogistics(com.wuerth.phoenix.Cis.models.Company)
Found boolean isActiveActual(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isHalfYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isTP(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isIFRS16Orders(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isWuerthLine(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isRiskManagement(com.wuerth.phoenix.Cis.models.Company)
Found void setWuerthLine(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isOnCapexReports(com.wuerth.phoenix.Cis.models.Company, int)
Found void onCompanyClone(com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found void setPEIssuer(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isOnTISReports(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getME(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isImportFXSap(com.wuerth.phoenix.Cis.models.Company)
Found boolean isSR(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isW3IS(com.wuerth.phoenix.Cis.models.Company)
Found void setNDS(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isBODetailedActual(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyCreation(java.lang.String, com.wuerth.phoenix.Cis.models.Company, boolean, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isFX(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLifecycle(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPEIssuer(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFXHedgeableByWFI(com.wuerth.phoenix.Cis.models.Company)
Found boolean isCreditLimit(com.wuerth.phoenix.Cis.models.Company)
Found boolean isTIS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isSRAutoApprove(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyImport(java.lang.String, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found java.util.ArrayList getPossiblePartnerPeriodIndependentCompanyList(com.wuerth.phoenix.Cis.models.CisController)
Found java.lang.String getSR(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short, short)
Found boolean isME(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isLeasing(com.wuerth.phoenix.Cis.models.Company)
Found long getIFRS16WorkflowEnablingFromDate(com.wuerth.phoenix.Cis.models.Company)
Found boolean isYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
TestSuite|No test specified!
```



### Run Test




```ruby
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin\.'
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin'
getTag(): consider 'C:\phxrepository\cis_dev\dev'
getTag(): consider 'C:\phxrepository\cis_dev'
getTag(): consider 'C:\phxrepository'
getTag(): consider 'C:\'
getTag(): 'UNKNOWN' found!
Using org.netbeans.jemmy.drivers.DefaultDriverInstaller driver installer
2018-05-25 12:27:15.104|getResource|File './data/TASKS.xml' found as 'file:/C:/phxrepository/cis_dev/test/classes/com/wuerth/phoenix/cis/test/menubar/data/TASKS.xml'|OutputChecker.log (enabled)
2018-05-25 12:27:28.650|getResource|File '/com/wuerth/phoenix/cis/images/note_view.png' found as 'file:/C:/phxrepository/cis_dev/dev/classes/com/wuerth/phoenix/cis/images/note_view.png'|OutputChecker.log (enabled)
Found boolean isDailySales(com.wuerth.phoenix.Cis.models.Company)
Found boolean isDailySalesGP(com.wuerth.phoenix.Cis.models.Company)
Found java.util.ArrayList getPossiblePartnerCompanyList(int, short, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isPossibleTISICO(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFactoring(com.wuerth.phoenix.Cis.models.Company)
Found boolean isNDS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isBODetailedPlan(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found void setLeasing(com.wuerth.phoenix.Cis.models.Company, boolean)
Found void onCompanyReset(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLogistics(com.wuerth.phoenix.Cis.models.Company)
Found boolean isActiveActual(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isHalfYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isTP(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isIFRS16Orders(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isWuerthLine(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isRiskManagement(com.wuerth.phoenix.Cis.models.Company)
Found void setWuerthLine(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isOnCapexReports(com.wuerth.phoenix.Cis.models.Company, int)
Found void onCompanyClone(com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found void setPEIssuer(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isOnTISReports(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getME(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isImportFXSap(com.wuerth.phoenix.Cis.models.Company)
Found boolean isSR(com.wuerth.phoenix.Cis.models.Company, int, short)
Found void setNDS(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isW3IS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isBODetailedActual(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyCreation(java.lang.String, com.wuerth.phoenix.Cis.models.Company, boolean, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isFX(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLifecycle(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPEIssuer(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFXHedgeableByWFI(com.wuerth.phoenix.Cis.models.Company)
Found boolean isCreditLimit(com.wuerth.phoenix.Cis.models.Company)
Found boolean isTIS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isSRAutoApprove(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyImport(java.lang.String, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found java.util.ArrayList getPossiblePartnerPeriodIndependentCompanyList(com.wuerth.phoenix.Cis.models.CisController)
Found java.lang.String getSR(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short, short)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isME(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isLeasing(com.wuerth.phoenix.Cis.models.Company)
Found long getIFRS16WorkflowEnablingFromDate(com.wuerth.phoenix.Cis.models.Company)
Found boolean isYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
TestSuite|-DTEST=com.wuerth.phoenix.cis.university.cis.example2.EngineTest(testSample) found
TestSuite|
TestSuite|Test Package Name: 'com.wuerth.phoenix.cis.university.cis.example2'
TestSuite|Test Class Name:   'EngineTest'
TestSuite|Test Case Name:    'testSample'
TestSuite|
TestCaseInfo|-DTEST=com.wuerth.phoenix.cis.university.cis.example2.EngineTest(testSample)|Enable Backup & Restore disabled|Set @CTSBackupAndRestore on test to enable
TEST CASE SET UP com.wuerth.phoenix.cis.university.cis.example2,EngineTest,testSample
Loading configuration: '.\Cis_properties.xml'...
(*) Initialization of database server... 	[unknown][instance:4aksio]
    (-) Initialization of Database services...
(*) The database server services are ready..!	[PBZCISTRAIN004][instance:4aksio]
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1a712f12
Valid combinations: 320
false false - Reduction Check - A: 6 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6b03c35c
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@69d2c460
...END (4609 ms)
310 combinations removed.
false false - Reduction Check - F: 3 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@fe337
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7d741200
...END (856 ms)
3 combinations removed.
false false - Reduction Check - B: 105 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@72b689f6
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@5b5f06bb
...END (5189 ms)
1 combinations removed.
The following 6 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,FROMDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER
Valid combinations: 1088
false true - Reduction Check - A: 6 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6e133ed
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@66da2007
...END (3136 ms)
1054 combinations removed.
false true - Reduction Check - F: 3 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@47c90585
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@274b3fc6
...END (287 ms)
6 combinations removed.
false true - Reduction Check - D: 9 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2a718598
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2a7bc863
...END (902 ms)
1 combinations removed.
false true - Reduction Check - B: 105 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@241e5fe6
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@190f522a
...END (1481 ms)
1 combinations removed.
false true - Reduction Check - C: 3 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@76eb41bc
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7a320260
...END (875 ms)
4 combinations removed.
false true - Reduction Check - E: 12 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@52c3818d
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1b1d9ff5
...END (531 ms)
4 combinations removed.
The following 18 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,FROMDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,ORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,ORDER
CONTRACTNUMBER,FROMDATE,COSTCENTER,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER,ORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER,ORDER
CONTRACTNUMBER,FROMDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTERTYPE,COSTCENTERORORDER
Valid combinations: 10240
true false - Reduction Check - A: 6 lines, 9 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7e566ed5
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4000c8b3
...END (231 ms)
10200 combinations removed.
true false - Reduction Check - F: 3 lines, 10 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@260413c2
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7e97b443
...END (311 ms)
31 combinations removed.
true false - Reduction Check - B: 105 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@52b43d58
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2c44dccf
...END (1630 ms)
1 combinations removed.
The following 8 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,PAYMENTCYCLE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE
CONTRACTNUMBER,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTDATETYPE
CONTRACTNUMBER,PAYMENTCYCLE,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE,PAYMENTDATETYPE
Valid combinations: 34816
true true - Reduction Check - A: 6 lines, 9 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@31a96ac0
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7f8c3326
...END (526 ms)
34680 combinations removed.
true true - Reduction Check - F: 3 lines, 10 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2e73ce05
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4eaa7133
...END (154 ms)
62 combinations removed.
true true - Reduction Check - D: 9 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4c8cfb32
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4ef4a3f2
...END (335 ms)
1 combinations removed.
true true - Reduction Check - B: 105 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4683f3a8
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@671b701f
...END (1503 ms)
1 combinations removed.
true true - Reduction Check - C: 3 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1e3d60c2
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@5f51ae2f
...END (949 ms)
32 combinations removed.
true true - Reduction Check - E: 12 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@761a5983
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@296c35c2
...END (138 ms)
32 combinations removed.
The following 8 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,PAYMENTCYCLE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE
CONTRACTNUMBER,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTDATETYPE
CONTRACTNUMBER,PAYMENTCYCLE,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE,PAYMENTDATETYPE
[main] Closed already open transaction: com.wuerth.phoenix.bcserver.base.TransactionContext@1a712f12
TEST CASE TEAR DOWN com.wuerth.phoenix.cis.university.cis.example2,EngineTest,testSample
```


```ruby
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin\.'
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin'
getTag(): consider 'C:\phxrepository\cis_dev\dev'
getTag(): consider 'C:\phxrepository\cis_dev'
getTag(): consider 'C:\phxrepository'
getTag(): consider 'C:\'
getTag(): 'UNKNOWN' found!
Using org.netbeans.jemmy.drivers.DefaultDriverInstaller driver installer
2018-05-25 13:36:12.958|getResource|File './data/TASKS.xml' found as 'file:/C:/phxrepository/cis_dev/test/classes/com/wuerth/phoenix/cis/test/menubar/data/TASKS.xml'|OutputChecker.log (enabled)
2018-05-25 13:36:26.758|getResource|File '/com/wuerth/phoenix/cis/images/note_view.png' found as 'file:/C:/phxrepository/cis_dev/dev/classes/com/wuerth/phoenix/cis/images/note_view.png'|OutputChecker.log (enabled)
Found boolean isDailySales(com.wuerth.phoenix.Cis.models.Company)
Found boolean isDailySalesGP(com.wuerth.phoenix.Cis.models.Company)
Found java.util.ArrayList getPossiblePartnerCompanyList(int, short, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isPossibleTISICO(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFactoring(com.wuerth.phoenix.Cis.models.Company)
Found boolean isNDS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isBODetailedPlan(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found void setLeasing(com.wuerth.phoenix.Cis.models.Company, boolean)
Found void onCompanyReset(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLogistics(com.wuerth.phoenix.Cis.models.Company)
Found boolean isActiveActual(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isHalfYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isTP(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isIFRS16Orders(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isWuerthLine(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isRiskManagement(com.wuerth.phoenix.Cis.models.Company)
Found void setWuerthLine(com.wuerth.phoenix.Cis.models.Company, boolean)
Found void onCompanyClone(com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isOnCapexReports(com.wuerth.phoenix.Cis.models.Company, int)
Found void setPEIssuer(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isOnTISReports(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getME(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isImportFXSap(com.wuerth.phoenix.Cis.models.Company)
Found boolean isSR(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isW3IS(com.wuerth.phoenix.Cis.models.Company)
Found void setNDS(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isBODetailedActual(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyCreation(java.lang.String, com.wuerth.phoenix.Cis.models.Company, boolean, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isFX(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLifecycle(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPEIssuer(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFXHedgeableByWFI(com.wuerth.phoenix.Cis.models.Company)
Found boolean isCreditLimit(com.wuerth.phoenix.Cis.models.Company)
Found boolean isTIS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isSRAutoApprove(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyImport(java.lang.String, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found java.util.ArrayList getPossiblePartnerPeriodIndependentCompanyList(com.wuerth.phoenix.Cis.models.CisController)
Found java.lang.String getSR(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short, short)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isME(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isLeasing(com.wuerth.phoenix.Cis.models.Company)
Found long getIFRS16WorkflowEnablingFromDate(com.wuerth.phoenix.Cis.models.Company)
Found boolean isYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
TestSuite|-DTEST=com.wuerth.phoenix.cis.university.cis.example2.EngineTest(testSample) found
TestSuite|
TestSuite|Test Package Name: 'com.wuerth.phoenix.cis.university.cis.example2'
TestSuite|Test Class Name:   'EngineTest'
TestSuite|Test Case Name:    'testSample'
TestSuite|
TestCaseInfo|-DTEST=com.wuerth.phoenix.cis.university.cis.example2.EngineTest(testSample)|Enable Backup & Restore disabled|Set @CTSBackupAndRestore on test to enable
TEST CASE SET UP com.wuerth.phoenix.cis.university.cis.example2,EngineTest,testSample
Loading configuration: '.\Cis_properties.xml'...
(*) Initialization of database server... 	[unknown][instance:4aksio]
    (-) Initialization of Database services...
(*) The database server services are ready..!	[PBZCISTRAIN004][instance:4aksio]
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1a712f12
Valid combinations: 320
false false - Reduction Check - A: 6 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6b03c35c
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@229fe7ab
...END (2653 ms)
310 combinations removed.
false false - Reduction Check - F: 3 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@32182bf8
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@77e261e3
...END (913 ms)
3 combinations removed.
false false - Reduction Check - B: 105 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@14b0b7f9
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4c5ae26d
...END (4963 ms)
1 combinations removed.
The following 6 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,FROMDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER
Valid combinations: 1088
false true - Reduction Check - A: 6 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@50859a18
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1d502d6c
...END (1722 ms)
1054 combinations removed.
false true - Reduction Check - F: 3 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2161cc6f
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3ac5a623
...END (197 ms)
6 combinations removed.
false true - Reduction Check - D: 9 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@5eb20abb
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6baf95f9
...END (981 ms)
1 combinations removed.
false true - Reduction Check - B: 105 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@424ef8ca
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3ce3a01
...END (1632 ms)
1 combinations removed.
false true - Reduction Check - C: 3 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@67179928
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2327173a
...END (1036 ms)
4 combinations removed.
false true - Reduction Check - E: 12 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1ad2f5da
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@55148d9b
...END (237 ms)
4 combinations removed.
The following 18 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,FROMDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,ORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,ORDER
CONTRACTNUMBER,FROMDATE,COSTCENTER,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER,ORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER,ORDER
CONTRACTNUMBER,FROMDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTERTYPE,COSTCENTERORORDER
Valid combinations: 10240
true false - Reduction Check - A: 6 lines, 9 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@54132c2f
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@26b9c640
...END (375 ms)
10200 combinations removed.
true false - Reduction Check - F: 3 lines, 10 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3d673a8e
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1986fae9
...END (153 ms)
31 combinations removed.
true false - Reduction Check - B: 105 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4a4840a1
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1740a04a
...END (1250 ms)
1 combinations removed.
The following 8 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,PAYMENTCYCLE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE
CONTRACTNUMBER,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTDATETYPE
CONTRACTNUMBER,PAYMENTCYCLE,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE,PAYMENTDATETYPE
Valid combinations: 34816
true true - Reduction Check - A: 6 lines, 9 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4c489b4f
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@227f9151
...END (703 ms)
34680 combinations removed.
true true - Reduction Check - F: 3 lines, 10 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7183f49e
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@62cb395f
...END (126 ms)
62 combinations removed.
true true - Reduction Check - D: 9 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@16f1ef37
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@459d199b
...END (479 ms)
1 combinations removed.
true true - Reduction Check - B: 105 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@236ad928
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@21031cc4
...END (1595 ms)
1 combinations removed.
true true - Reduction Check - C: 3 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@75a59520
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@459b0521
...END (670 ms)
32 combinations removed.
true true - Reduction Check - E: 12 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3c046c9f
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@5accfb37
...END (158 ms)
32 combinations removed.
The following 8 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,PAYMENTCYCLE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE
CONTRACTNUMBER,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTDATETYPE
CONTRACTNUMBER,PAYMENTCYCLE,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE,PAYMENTDATETYPE
[main] Closed already open transaction: com.wuerth.phoenix.bcserver.base.TransactionContext@1a712f12
TEST CASE TEAR DOWN com.wuerth.phoenix.cis.university.cis.example2,EngineTest,testSample
```
# secound red

```ruby
true true Reduction Check - 1: 6 lines, 9 columns
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaa  1000 1.0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 1519858800000 1420066800000 
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab aaaaaaaaaaaaaaaaaaab aaaaaaaaaaaaaaaaaaaaa 8999 1.01 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab 1519945200000 1420153200000 
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac aaaaaaaaaaaaaaaaaaad aaaaaaaaaaaaaaaaaaac 1000 1.02 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac 1520031600000 1420239600000 
  aaaaaaaaaaaaaaaaaaae       
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaab aaaaaaaaaaaaaaaaaaaf Abc Abc Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Abc Abc 
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad aaaaaaaaaaaaaaaaaaah aaaaaaaaaaaaaaaaaaag 8999 1.03 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad 1520118000000 1420326000000 
true true Reduction Check - 2: 105 lines, 5 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaaai   com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaaj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Abc com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaak aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 1420412400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
 aaaaaaaaaaaaaaaaaaal aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab 1420498800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaaam aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac 1420585200000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaan aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad 1420671600000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaaao aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaae 1420758000000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaap aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf 1420844400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaaaq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaag 1420930800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaaar aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah 1421017200000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaaas aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai 1421103600000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaaat aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaj 1421190000000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaau aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaak 1421276400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaaav aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaal 1421362800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaaaw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaam 1421449200000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaaax aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaan 1421535600000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaay aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaao 1421622000000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaaaz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap 1421708400000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaba aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaq 1421794800000  
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaabb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar 1421881200000  
 aaaaaaaaaaaaaaaaaabc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas 1421967600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaabd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat 1422054000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaabe aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau 1422140400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaabf aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaav 1422226800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaabg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaw 1422313200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaabh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaax 1422399600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaabi aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaay 1422486000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaabj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz 1422572400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaabk aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaba 1422658800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaabl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabb 1422745200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaabm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc 1422831600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaabn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabd 1422918000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaabo aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabe 1423004400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaabp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabf 1423090800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaabq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabg 1423177200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaabr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabh 1423263600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaabs aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabi 1423350000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
 aaaaaaaaaaaaaaaaaabt aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabj 1423436400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaabu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabk 1423522800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaabv aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabl 1423609200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaabw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabm 1423695600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaabx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabn 1423782000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaaby aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabo 1423868400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaabz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabp 1423954800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaaca aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabq 1424041200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaacb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabr 1424127600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaacc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabs 1424214000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaacd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabt 1424300400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaace aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabu 1424386800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaacf aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabv 1424473200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaacg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabw 1424559600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaach aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabx 1424646000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaci aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaby 1424732400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaacj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabz 1424818800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
 aaaaaaaaaaaaaaaaaack aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaca 1424905200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaacl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacb 1424991600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaacm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacc 1425078000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaacn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacd 1425164400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaco aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaace 1425250800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaacp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacf 1425337200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaacq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacg 1425423600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaacr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaach 1425510000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaacs aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaci 1425596400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaact aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacj 1425682800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaacu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaack 1425769200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaacv aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacl 1425855600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaacw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacm 1425942000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaacx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacn 1426028400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaacy aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaco 1426114800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaacz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacp 1426201200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaada aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacq 1426287600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
 aaaaaaaaaaaaaaaaaadb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacr 1426374000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaadc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacs 1426460400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaadd aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaact 1426546800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaade aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacu 1426633200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaadf aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacv 1426719600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaadg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacw 1426806000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaadh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacx 1426892400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaadi aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacy 1426978800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaadj aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacz 1427065200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaadk aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaada 1427151600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaadl aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadb 1427238000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaadm aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadc 1427324400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaadn aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd 1427410800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaado aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaade 1427497200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaadp aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadf 1427583600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaadq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadg 1427666400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaadr aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadh 1427752800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
 aaaaaaaaaaaaaaaaaads aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadi 1427839200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4d7e1886 aaaaaaaaaaaaaaaaaadt aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadj 1427925600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaadu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadk 1428012000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@355da254 aaaaaaaaaaaaaaaaaadv aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadl 1428098400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaadw aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadm 1428184800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e2de80c aaaaaaaaaaaaaaaaaadx aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadn 1428271200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@5e481248 aaaaaaaaaaaaaaaaaady aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaado 1428357600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@266474c2 aaaaaaaaaaaaaaaaaadz aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadp 1428444000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@66d3c617 aaaaaaaaaaaaaaaaaaea aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadq 1428530400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaeb aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadr 1428616800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaaec aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaads 1428703200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4dc63996 aaaaaaaaaaaaaaaaaaed aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadt 1428789600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@63947c6b aaaaaaaaaaaaaaaaaaee aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadu 1428876000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaef aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadv 1428962400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6ff3c5b5 aaaaaaaaaaaaaaaaaaeg aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadw 1429048800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@1d44bcfa aaaaaaaaaaaaaaaaaaeh aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadx 1429135200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@6f94fa3e aaaaaaaaaaaaaaaaaaei aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaady 1429221600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
true true Reduction Check - 3: 3 lines, 5 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaej 1429308000000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaek 1429394400000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaael 1429480800000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadz com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
true true Reduction Check - 4: 9 lines, 6 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaem  1429567200000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaen  1429653600000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaeo  1429740000000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaea com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaep aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad 1429826400000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 aaaaaaaaaaaaaaaaaaeq aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaae 1429912800000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d aaaaaaaaaaaaaaaaaaer aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaag 1429999200000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeb com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaaes aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaec 1430085600000  com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaaet aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaed 1430172000000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaaeu aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaee 1430258400000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaef com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
true true Reduction Check - 5: 12 lines, 6 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93   aaaaaaaaaaaaaaaaaaev 1430344800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai aaaaaaaaaaaaaaaaaaew 1430431200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeg aaaaaaaaaaaaaaaaaaex 1430517600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d Abc  aaaaaaaaaaaaaaaaaaey 1430604000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaj aaaaaaaaaaaaaaaaaaez 1430690400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeh aaaaaaaaaaaaaaaaaafa 1430776800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d com.wuerth.phoenix.cis.university.example2.adapters.IFRS16CostCenterType@5451c3a8  aaaaaaaaaaaaaaaaaafb 1430863200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 com.wuerth.phoenix.cis.university.example2.adapters.IFRS16CostCenterType@2626b418 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaak aaaaaaaaaaaaaaaaaafc 1430949600000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d com.wuerth.phoenix.cis.university.example2.adapters.IFRS16CostCenterType@5451c3a8 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaei aaaaaaaaaaaaaaaaaafd 1431036000000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee com.wuerth.phoenix.cis.university.example2.adapters.IFRS16CostCenterType@2626b418  aaaaaaaaaaaaaaaaaafe 1431122400000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@60e53b93 com.wuerth.phoenix.cis.university.example2.adapters.IFRS16CostCenterType@5451c3a8 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaal aaaaaaaaaaaaaaaaaaff 1431208800000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@29453f44 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@2b193f2d com.wuerth.phoenix.cis.university.example2.adapters.IFRS16CostCenterType@2626b418 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaej aaaaaaaaaaaaaaaaaafg 1431295200000 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@5cad8086 
true true Reduction Check - 6: 3 lines, 10 columns
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@d716361 aaaaaaaaaaaaaaaaaafh  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaek 1431381600000   com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@6e0be858   
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@3764951d aaaaaaaaaaaaaaaaaafi Abc aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaael 1431468000000 Abc Abc com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@61bbe9ba Abc Abc 
com.wuerth.phoenix.cis.university.example2.adapters.IFRS16ConditionType@4b1210ee aaaaaaaaaaaaaaaaaafj 1431640800000 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaem 1431554400000 com.wuerth.phoenix.cis.university.example2.adapters.IFRS16PaymentDateType@4617c264 1.04 com.wuerth.phoenix.cis.university.example2.adapters.ConcreteAccount@610455d6 com.wuerth.phoenix.cis.university.example2.adapters.IFRS16PaymentCycle@36baf30c com.wuerth.phoenix.cis.university.example2.adapters.IFRS16VATRateType@7a81197d 
```

# Final Junit test
```ruby
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin\.'
getTag(): consider 'C:\phxrepository\cis_dev\dev\bin'
getTag(): consider 'C:\phxrepository\cis_dev\dev'
getTag(): consider 'C:\phxrepository\cis_dev'
getTag(): consider 'C:\phxrepository'
getTag(): consider 'C:\'
getTag(): 'UNKNOWN' found!
Using org.netbeans.jemmy.drivers.DefaultDriverInstaller driver installer
2018-05-25 15:38:03.088|getResource|File './data/TASKS.xml' found as 'file:/C:/phxrepository/cis_dev/test/classes/com/wuerth/phoenix/cis/test/menubar/data/TASKS.xml'|OutputChecker.log (enabled)
2018-05-25 15:38:15.964|getResource|File '/com/wuerth/phoenix/cis/images/note_view.png' found as 'file:/C:/phxrepository/cis_dev/dev/classes/com/wuerth/phoenix/cis/images/note_view.png'|OutputChecker.log (enabled)
Found boolean isDailySales(com.wuerth.phoenix.Cis.models.Company)
Found boolean isDailySalesGP(com.wuerth.phoenix.Cis.models.Company)
Found java.util.ArrayList getPossiblePartnerCompanyList(int, short, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isPossibleTISICO(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFactoring(com.wuerth.phoenix.Cis.models.Company)
Found boolean isNDS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isBODetailedPlan(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found void setLeasing(com.wuerth.phoenix.Cis.models.Company, boolean)
Found void onCompanyReset(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLogistics(com.wuerth.phoenix.Cis.models.Company)
Found boolean isActiveActual(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isHalfYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isTP(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isIFRS16Orders(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isWuerthLine(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isPossiblePartner(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isRiskManagement(com.wuerth.phoenix.Cis.models.Company)
Found void setWuerthLine(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isOnCapexReports(com.wuerth.phoenix.Cis.models.Company, int)
Found void onCompanyClone(com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found void setPEIssuer(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isIFRS16Workflow(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isOnTISReports(com.wuerth.phoenix.Cis.models.Company)
Found java.lang.String getME(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isImportFXSap(com.wuerth.phoenix.Cis.models.Company)
Found boolean isSR(com.wuerth.phoenix.Cis.models.Company, int, short)
Found void setNDS(com.wuerth.phoenix.Cis.models.Company, boolean)
Found boolean isW3IS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isBODetailedActual(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyCreation(java.lang.String, com.wuerth.phoenix.Cis.models.Company, boolean, com.wuerth.phoenix.Cis.models.CisController)
Found boolean isFX(com.wuerth.phoenix.Cis.models.Company)
Found boolean isLifecycle(com.wuerth.phoenix.Cis.models.Company)
Found boolean isPEIssuer(com.wuerth.phoenix.Cis.models.Company)
Found boolean isFXHedgeableByWFI(com.wuerth.phoenix.Cis.models.Company)
Found boolean isCreditLimit(com.wuerth.phoenix.Cis.models.Company)
Found boolean isTIS(com.wuerth.phoenix.Cis.models.Company)
Found boolean isIFRS16LongVersion(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isSRAutoApprove(com.wuerth.phoenix.Cis.models.Company)
Found void onCompanyImport(java.lang.String, com.wuerth.phoenix.Cis.models.Company, com.wuerth.phoenix.Cis.models.CisController)
Found java.util.ArrayList getPossiblePartnerPeriodIndependentCompanyList(com.wuerth.phoenix.Cis.models.CisController)
Found java.lang.String getSR(com.wuerth.phoenix.Cis.models.Company, java.util.Locale)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short, short)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int)
Found boolean isCapex(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isME(com.wuerth.phoenix.Cis.models.Company, int, short)
Found boolean isLeasing(com.wuerth.phoenix.Cis.models.Company)
Found long getIFRS16WorkflowEnablingFromDate(com.wuerth.phoenix.Cis.models.Company)
Found boolean isYearEnd(com.wuerth.phoenix.Cis.models.Company, int)
TestSuite|-DTEST=com.wuerth.phoenix.cis.university.cis.example2.EngineTest(testSample) found
TestSuite|
TestSuite|Test Package Name: 'com.wuerth.phoenix.cis.university.cis.example2'
TestSuite|Test Class Name:   'EngineTest'
TestSuite|Test Case Name:    'testSample'
TestSuite|
TestCaseInfo|-DTEST=com.wuerth.phoenix.cis.university.cis.example2.EngineTest(testSample)|Enable Backup & Restore disabled|Set @CTSBackupAndRestore on test to enable
TEST CASE SET UP com.wuerth.phoenix.cis.university.cis.example2,EngineTest,testSample
Loading configuration: '.\Cis_properties.xml'...
(*) Initialization of database server... 	[unknown][instance:4aksio]
    (-) Initialization of Database services...
(*) The database server services are ready..!	[PBZCISTRAIN004][instance:4aksio]
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1a712f12
Valid combinations: 320
false false - Reduction Check - A: 6 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6b03c35c
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@229fe7ab
...END (2178 ms)
310 combinations removed.
false false - Reduction Check - F: 3 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@32182bf8
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@77e261e3
...END (782 ms)
3 combinations removed.
false false - Reduction Check - B: 105 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@14b0b7f9
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4c5ae26d
...END (4483 ms)
1 combinations removed.
The following 6 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,FROMDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER
Valid combinations: 1088
false true - Reduction Check - A: 6 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@50859a18
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1d502d6c
...END (1620 ms)
1054 combinations removed.
false true - Reduction Check - F: 3 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2161cc6f
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3ac5a623
...END (510 ms)
6 combinations removed.
false true - Reduction Check - D: 9 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@5eb20abb
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6baf95f9
...END (905 ms)
1 combinations removed.
false true - Reduction Check - B: 105 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@424ef8ca
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3ce3a01
...END (1438 ms)
1 combinations removed.
false true - Reduction Check - C: 3 lines, 4 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@67179928
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2327173a
...END (1147 ms)
4 combinations removed.
false true - Reduction Check - E: 12 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1ad2f5da
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@55148d9b
...END (254 ms)
4 combinations removed.
The following 18 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,FROMDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER
CONTRACTNUMBER,FROMDATE,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,ORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,ORDER
CONTRACTNUMBER,FROMDATE,COSTCENTER,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTER,ORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTER,ORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTER,ORDER
CONTRACTNUMBER,FROMDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,FROMDATE,UNTILDATE,COSTCENTERTYPE,COSTCENTERORORDER
CONTRACTNUMBER,AMOUNTWITHOUTVALUEADDEDTAX,FROMDATE,UNTILDATE,COSTCENTERTYPE,COSTCENTERORORDER
Valid combinations: 10240
true false - Reduction Check - A: 6 lines, 9 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@54132c2f
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@26b9c640
...END (259 ms)
10200 combinations removed.
true false - Reduction Check - F: 3 lines, 10 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@3d673a8e
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1986fae9
...END (134 ms)
31 combinations removed.
true false - Reduction Check - B: 105 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4a4840a1
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1740a04a
...END (1303 ms)
1 combinations removed.
The following 8 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,PAYMENTCYCLE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE
CONTRACTNUMBER,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTDATETYPE
CONTRACTNUMBER,PAYMENTCYCLE,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE,PAYMENTDATETYPE
Valid combinations: 34816
true true - Reduction Check - A: 6 lines, 9 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@6adcccc7
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@734c1673
...END (681 ms)
34680 combinations removed.
true true - Reduction Check - F: 3 lines, 10 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@2a3bb68c
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@416d3d02
...END (136 ms)
62 combinations removed.
true true - Reduction Check - D: 9 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4cb2c334
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@7a0f88c9
...END (455 ms)
1 combinations removed.
true true - Reduction Check - B: 105 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@5b760132
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1c7d3fd5
...END (1732 ms)
1 combinations removed.
true true - Reduction Check - C: 3 lines, 5 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@24e8a908
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@4688e297
...END (384 ms)
32 combinations removed.
true true - Reduction Check - E: 12 lines, 6 columns
START...
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@1288c40a
[main] New Transaction Cis com.wuerth.phoenix.bcserver.base.TransactionContext@f1895
...END (183 ms)
32 combinations removed.
The following 8 combinations have to be tested
CONTRACTNUMBER
CONTRACTNUMBER,GROUPPOSITION
CONTRACTNUMBER,PAYMENTCYCLE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE
CONTRACTNUMBER,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTDATETYPE
CONTRACTNUMBER,PAYMENTCYCLE,PAYMENTDATETYPE
CONTRACTNUMBER,GROUPPOSITION,PAYMENTCYCLE,PAYMENTDATETYPE
[main] Closed already open transaction: com.wuerth.phoenix.bcserver.base.TransactionContext@1a712f12
TEST CASE TEAR DOWN com.wuerth.phoenix.cis.university.cis.example2,EngineTest,testSample
```
#   S o f t w a r e - R e l i a b i l i t y - a n d - T e s t i n g - A n a l y s i s - b y - H e i d e r - J e f f e r  
 #   S o f t w a r e - R e l i a b i l i t y - a n d - T e s t i n g - A n a l y s i s - b y - H e i d e r - J e f f e r  
 