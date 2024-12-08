@Login
Feature: To validate Login functionality of Facebook Application

	Background:
	Given User have to enter the Facebook login through Edge browser

	Scenario: To validate login by using valid email and invalid password
		
		When User have to enter valid Email and invalid password
		|username|password|email|PhoneNo|
		|dinesh852@gmail.com|123456789|selenium@gmail.com|987654321|
		|dinesh963@gmail.com|rangedel|seleniummanual@gmail.com|852963741|
		|dinesh741@gmail.com|963852741|seleniumjava@gmail.com|9517538462|
		|dinesh456@gmail.com|741852963|seleniumpython@gmail.com|1122336655|
		And User have to click login button
		Then User have to reach inavlid credentials page
		
		@Sanity
		Scenario: To validate login by using invalid email and invalid password
		
		When User have to enter invalid email and invalid password
		And User have to click login button
		Then User have to reach inavlid credentials page
	
		
		
		