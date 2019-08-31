package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TestUtils {
	public static WebDriver driver;

	
	/**
	 * Method: Mouse hover 
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	/**
	 * Metohd: scrollToView
	 * 
	 * @paramIt will scroll down to particular element
	 */
	public void scrollToView(WebElement element) {

		try {
			if (element.isDisplayed() || element.isEnabled()) {

				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Method: initilization This metod will initilize the browser
	 */
	public void initilization() {

		String browser = getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//src//main//java//exxfile//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//src//main//java//exeFile//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(getProperty("URL"));
	}

	/**
	 * Method name: getProperty
	 * 
	 * @Purpose: This method will fetch value from property file
	 * @return
	 */

	public String getProperty(String key) {
		String value = null;

		Properties prop = loadProperty("testRun");
		value = prop.getProperty(key);

		if (value == null) {
			String env = prop.getProperty("env");
			prop = loadProperty(env);
			value = prop.getProperty(key);

		}

		return value;
	}

	/*
	 * Method Name: loadProperty Purpose : This method will help to load the
	 * properties from property file
	 */

	public Properties loadProperty(String propFileName) {
		Properties prop = new Properties();

		String filePath = ".\\src\\main\\java\\com\\qa\\config\\" + propFileName + ".properties";

		try {
			File file = new File(filePath);
			FileInputStream steam = new FileInputStream(file);
			prop.load(steam);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return prop;
	}

}
