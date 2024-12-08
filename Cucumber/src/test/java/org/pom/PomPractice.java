package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import SeleniumPractice.BaseClass;

public class PomPractice extends BaseClass {
	
	public PomPractice() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBys({
		@FindBy (id = "email"),
		@FindBy (xpath = "//input[@name='email']")	
	
	})
	private WebElement txtEmail;
	
	
	@FindBys({
		@FindBy (name = "pass"),
		@FindBy (xpath = "//input[@name='pass']")
	
	})
	private WebElement txtPass;
	
	@FindBy(name = "login")
	private WebElement logbtn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getLogbtn() {
		return logbtn;
	}

	
	
}
