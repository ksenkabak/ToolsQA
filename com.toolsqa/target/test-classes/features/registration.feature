@smoke 
Feature: ToolsQA DemoPage Registration 

Background: 
	Given the user is on the signup page 
	
Scenario: sign up on ToolsQA DemoPage 
	When  the user enters first name with "Rita2" and last name with "Ricoto2" 
	And the user chooses maritual status as married and hobby as cricket 
	And the user chooses country as United States 
	Then the user enters his date of birth 
	And the user provides his phone number 
	And the user enters username and email 
	And the user chooses profile picture 
	Then the user describes about himself 
	And the user enters following passwords and system displays password level message: 
		|Invalid |abc|
		|Weak    |Javajava12|
		|Medium  |Abc_12345@#$|
		|Strong  |Abc_12345@#-$123|
	Then the user submits the application 
	And the user should see the approval message 	
		

	
	
	
	