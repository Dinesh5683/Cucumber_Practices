package org.cucumber;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.pom.ForgotbtnPojoClass;
import org.pom.PomPractice;

import SeleniumPractice.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	WebDriver driver;
	PomPractice p;
	ForgotbtnPojoClass po;
	
	/*
	@Given("User have to enter the Facebook login through Chrome browser")
	public void user_have_to_enter_the_facebook_login_through_chrome_browser() {
	    System.out.println("Chrome Browser");
	    System.out.println("Facebook");
	}
	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
	    System.out.println("Valid email and invalid password");
	    
	}
	@When("User have to click login button")
	public void user_have_to_click_login_button() {
	    System.out.println("Login button");
	}
	@Then("User have to reach inavlid credentials page")
	public void user_have_to_reach_inavlid_credentials_page() {
	    System.out.println("invalid credentials page");
		
	}
	*/
	
	/*
	@Given("User have to enter the Facebook login through Chrome browser")
	public void user_have_to_enter_the_facebook_login_through_chrome_browser() {
	    
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.manage().window().maximize();
	}
	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
	    WebElement element = driver.findElement(By.id("email"));
	    element.sendKeys("dinesh123@gamil.com");
	    WebElement pass = driver.findElement(By.name("pass"));
	    pass.sendKeys("123456789");
	}
	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
	    WebElement logbtn = driver.findElement(By.name("login"));
	    logbtn.click();
	    Thread.sleep(5000);
	}
	@Then("User have to reach inavlid credentials page")
	public void user_have_to_reach_inavlid_credentials_page() {
	    
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("privacy_mutation_token")) {
			
			System.out.println("The user is in invalid credentials page");
		}
		else {
			System.out.println("The user is not in invalid credentials page");
		}
		
	}
	*/
	
	/*
	//Using base class along with POJO class
	@Given("User have to enter the Facebook login through Chrome browser")
	public void user_have_to_enter_the_facebook_login_through_chrome_browser() {
	    
			edgeBrowser();
			maxWindow();
			launchUrl("https://www.facebook.com/?_rdr");
			
	}
	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
			p = new PomPractice();
			fillTextBox((p.getTxtEmail()), "dinesh123@gmail.com");
			fillTextBox((p.getTxtPass()), "123456789");
	}
	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
			p.getLogbtn().click();
			Thread.sleep(5000);
	}
	@Then("User have to reach inavlid credentials page")
	public void user_have_to_reach_inavlid_credentials_page() {
	    
			String url = pageUrl();
			System.out.println(url);
		
		if(url.contains("privacy_mutation_token")) {
			
			System.out.println("The user is in invalid credentials page");
		}
		else {
			System.out.println("The user is not in invalid credentials page");
		}
		
	}
	*/
	/*
	
	//using Examples for Scenario Outline
	
	@Given("User have to enter the Facebook login through Chrome browser")
	public void user_have_to_enter_the_facebook_login_through_chrome_browser() {
		edgeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/?_rdr");
		
	}
	@Given("User have to enter the Facebook login through Edge browser")
	public void user_have_to_enter_the_facebook_login_through_edge_browser() {
		edgeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/?_rdr");
	}
	
	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String pass) {
		p = new PomPractice();
		fillTextBox((p.getTxtEmail()), email);
		fillTextBox((p.getTxtPass()), pass);
	}
	
	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
			p.getLogbtn().click();
			Thread.sleep(5000);
	}
	@Then("User have to reach inavlid credentials page")
	public void user_have_to_reach_inavlid_credentials_page() {
	    
			String url = pageUrl();
			System.out.println(url);
		
		if(url.contains("privacy_mutation_token")) {
			
			System.out.println("The user is in invalid credentials page");
		}
		else {
			System.out.println("The user is not in invalid credentials page");
		}
		
	}
	
	
	@Given("User have to enter the Facebook login through Chrome browser")
	public void user_have_to_enter_the_facebook_login_through_chrome_browser()  {
		
	}
	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
	    
	}
	@When("User have to click login button")
	public void user_have_to_click_login_button() {
	   
	}
	@Then("User have to reach inavlid credentials page")
	public void user_have_to_reach_inavlid_credentials_page() {
	    
	}
	*/
	
	@Given("User have to enter the Facebook login through Edge browser")
	public void user_have_to_enter_the_facebook_login_through_edge_browser() {
		edgeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/?_rdr");
		
	}
	
	/*
	//two dimensional DATATABLE - List
		@When("User have to enter valid Email and invalid password")
		public void user_have_to_enter_valid_email_and_invalid_password(io.cucumber.datatable.DataTable data) {
		    List<List<String>> list = data.asLists();
		    String email = list.get(2).get(2);
		    String pass = list.get(3).get(3);
		    System.out.println(email);
		    System.out.println(pass);
		    
		    p = new PomPractice();
		    WebElement txtEmail = p.getTxtEmail();
		    fillTextBox(txtEmail, email);
		    WebElement txtPass = p.getTxtPass();
		    fillTextBox(txtPass, pass);
		    
		}
	*/
	
	//two dimensional DATATABLE - Map
			@When("User have to enter valid Email and invalid password")
			public void user_have_to_enter_valid_email_and_invalid_password(io.cucumber.datatable.DataTable data) {
			    List<Map<String, String>> map = data.asMaps();
			    String pass = map.get(2).get("password");
			    String email = map.get(3).get("username");
			    System.out.println(email);
			    System.out.println(pass);
			    
			    p = new PomPractice();
			    WebElement txtEmail = p.getTxtEmail();
			    fillTextBox(txtEmail, email);
			    WebElement txtPass = p.getTxtPass();
			    fillTextBox(txtPass, pass);
			    
			}
	
	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
		p = new PomPractice();
		fillTextBox((p.getTxtEmail()), "dinesh123@gmail.com");
		fillTextBox((p.getTxtPass()), "123456789");
	}
	
	@When("User have to click login button")
	public void user_have_to_click_login_button()  {
		WebElement logbtn = p.getLogbtn();
		btnClick(logbtn);
		
	}
	
	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password() throws InterruptedException {
		threadSleep();
		p = new PomPractice();
		fillTextBox((p.getTxtEmail()), "dinesh@gmail.com");
		fillTextBox((p.getTxtPass()), "987654321");
	}
	
	@Then("User have to reach inavlid credentials page")
	public void user_have_to_reach_inavlid_credentials_page() {
		String url = pageUrl();
		System.out.println(url);
	
	if(url.contains("privacy_mutation_token")) {
		
		System.out.println("The user is in invalid credentials page");
	}
	else {
		System.out.println("The user is not in invalid credentials page");
	}
	}
	
	@Given("User have to click forgotten button")
	public void user_have_to_click_forgotten_button() throws InterruptedException {
	    po = new ForgotbtnPojoClass();
	    WebElement forgtpass = po.getBtnForgtpass();
	    btnClick(forgtpass);
	    threadSleep();
	}
	@When("User have to enter email or phoneNo")
	public void user_have_to_enter_email_or_phone_no() {
	    WebElement noTxtBox = po.getPhoneNoTxtBox();
	    fillTextBox(noTxtBox, "8667070807");
		
	}
	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
	    WebElement searchbtn = po.getSearchbtn();
	    btnClick(searchbtn);
	}
	
	System.out.println("Code Successfully commited");
	
}
