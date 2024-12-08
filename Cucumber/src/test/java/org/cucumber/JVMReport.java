package org.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class JVMReport  {

	public static void generateJvmReport (String jsonPath) {
		
		//target folder loc
		File f = new File("C:\\Users\\MDK Dinesh\\eclipse-workspace\\Cucumber\\AllReports\\JVMReport");
		
		//configuration for additional details
		net.masterthought.cucumber.Configuration c = new net.masterthought.cucumber.Configuration(f, "FACEBOOK APPLICATION");
		
		c.addClassifications("platform", "Windows");
		c.addClassifications("Sprint", "10");
		c.addClassifications("Java Version", "1.8");
		
		
		//adding json file path into List<String>
		List<String> l = new ArrayList<String>();	
		l.add(jsonPath);

		//Creating object for report generating
		ReportBuilder b = new ReportBuilder(l, c);
		b.generateReports();
		
		
	}
	
}
