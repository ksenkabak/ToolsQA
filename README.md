# ToolsQA

This is a sample Software Test Automation Framework built as a Maven Project.
Overall project consist of the following folders and file:

project hierarchy is :
 
Project : com.disney -->
              src/test/java -->
                         pages -->
                         runners -->
                         stepDefinitions -->
                         utilities -->
                scr/test/resources -->
                         excelTestData -->
                         features -->
                         properties -->
                JRE system library -->
                Maven dependencies -->
                src -->
                target -->
                pom.xml -->

src/test/java: this folder is for the classes where I define my automation script implementation.
 
--> pages folder consists of couple java classes which play a role of object repository for the pages 
of the application. basically, I stored all the elements needed from the UI of the application 
and initialized them in the class so that I can call and use anytime i want. 
This approuch is called Page Object Module which maximizes reusability, makes it easy to 
maintain of my code through out the development.

--> runners folder has a class through which i invoke my test classes and features.

--> stepDefinitions folder is for implemented steps of the scenario we have in the cucumber feature file.

--> utilities folder is for my utility classes which are basically reusable methonds which is created once there
and can be used as many times as I want through out the ddevelopment cycle.

scr/test/resources: This folder is for any related resources for the development like testData,
 cucumber feature files and property files so on...

--> excelTestData folder was created for the testData comes from the excel. for the time shortage, 
couldn't be able to implement scenarios on that.

--> features folder consist of cucumber feature files where I define my unimplemented scenarios
 in gherkin language, by doing this, I'm making sure that my scenarios are described understandable 
to my team even for those manager level who are not technical.

--> properties folder is for defining the properties needed for the framework.

JRE system library
Maven dependencies 
                    these two are for the system jar files of Java and other dependencies as I needed.

--> target folder is for results and html, json report files generated after execution of the script
so that I can come up with test pass/ fail reports in a pretty format.

--> pom.xml is a file where I define the dependencies (tools) that my framework need in the development cycle.



That's pretty much what they do, and in order to run the code, 
--> import the code into eclipse 
--> update the maven project
--> go to the runner class
--> run the class as Junit test.
--> then go to target folder after execution, find the html report which basically tells what steps are pass
and what are failed with embeded screenShot in the report.

Thank you!!
