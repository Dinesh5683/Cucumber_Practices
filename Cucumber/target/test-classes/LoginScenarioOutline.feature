Feature: To validate Login functionality of Facebook Application

	Background:
	Given User have to enter the Facebook login through Edge browser

	Scenario Outline: To validate login by using different credentials
		
		When User have to enter "<username>" and "<password>"
		And User have to click login button
		Then User have to reach inavlid credentials page
		
		Examples:
			|username|password|
			|dinesh@gmail.com|123456789|
			|selenium@gmail.com|987654321|
			|cucumber@gmail.com|741852963|
			|963852741|junit@gmail.com|
			|something@gmail.com|someone@gmail.com|