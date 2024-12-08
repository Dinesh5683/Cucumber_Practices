package org.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import SeleniumPractice.BaseClass;

public class Hooks extends BaseClass{
    public WebDriver driver;

    

    @After(order = 3)
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
        	
        	TakesScreenshot ts = (TakesScreenshot) driver;
       
        	File file = new File("C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\Screenshots");
            byte[] f = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(f, "image/png", "screenshot");
            
        }
    }
    
    
    
    @After(order = 2)
    public static void closeBrowser() {
		closeBrowser();
	}
}
