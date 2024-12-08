package org.runner;

import org.cucumber.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

//for  report generating
@CucumberOptions(features = "@Rerun\\failed.txt", glue = "org.cucumber", dryRun = false, plugin = {
		"rerun:C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\Rerun\\failed.txt" })

public class reRunner {

	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(
				"C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\AllReports\\JsonReport\\fb.json");

	}
}
