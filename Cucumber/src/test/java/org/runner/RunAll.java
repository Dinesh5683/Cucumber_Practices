package org.runner;

import org.cucumber.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

//for  report generating
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "org.cucumber", dryRun = false, tags = "@Login", plugin = {
		"pretty", "html:C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\AllReports\\HtmlReport\\fb.html",
		"json:C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\AllReports\\JsonReport\\fb.json",
		"junit:C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\AllReports\\JunitReport\\fb.xml",
		"rerun:C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\Rerun\\failed.txt"})

public class RunAll {

	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(
				"C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\AllReports\\JsonReport\\fb.json");

	}
}
