package com.qa.runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//src//main//java//com//qa//features",
		glue= {"com.qa.stepDefination"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		)
public class TestRunner {
	@BeforeClass
	public static void setUp() {
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();       
        ExtentCucumberFormatter.loadConfig(new File("./src/main/java/com/qa/config/extent-config.xml"));
	}
}
