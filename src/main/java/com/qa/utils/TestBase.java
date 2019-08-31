package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.qa.pages.SigninPages;
import com.qa.pages.TVPage;

public class TestBase extends TestUtils {

	public static SigninPages signinPage;
	public static TVPage tvPage;

	@BeforeSuite
	public void setUp() {

		initilization();

		signinPage = PageFactory.initElements(driver, SigninPages.class);
		tvPage = PageFactory.initElements(driver, TVPage.class);
	}

	@AfterSuite
	public void classTearDown() {
		driver.quit();
	}

}
