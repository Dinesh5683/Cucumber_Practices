package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumPractice.BaseClass;

public class ForgotbtnPojoClass extends BaseClass {

	public ForgotbtnPojoClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement btnForgtpass;
	
	@FindBy (xpath = "(//input[@name='email'])[2]")
	private WebElement phoneNoTxtBox;
	
	@FindBy (xpath = "//button[@name='did_submit']")
	private WebElement searchbtn;

	public WebElement getBtnForgtpass() {
		return btnForgtpass;
	}

	public WebElement getPhoneNoTxtBox() {
		return phoneNoTxtBox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
}
