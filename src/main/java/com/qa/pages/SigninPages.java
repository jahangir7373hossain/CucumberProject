package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.functions.ExceptionalScenario;
import com.qa.utils.TestBase;
import com.qa.utils.TestUtils;

public class SigninPages  {

	@FindBy(xpath = "(//i[@ng-click='removeAlert();'])[2]")
	public WebElement alartElement;
	@FindBy(xpath = "//label[contains(text(),'My Optimum ID')]")
	public WebElement optimumIDHeader;
	@FindBy(xpath = "//label[contains(text(),'Password')]")
	public WebElement optimumPassHeader;
	@FindBy(xpath = "//input[@id ='homeLoginFormOptimumId']")
	public WebElement myOptimumID;
	@FindBy(xpath = "//input[@id = 'homeLoginFormPassword']")
	public WebElement myOptimumPass;
	@FindBy(xpath = "//button[contains(text(),'Sign in to Optimum.net')]")
	public WebElement submitButton;
	@FindBy(xpath = "//h1[contains(text(),'Incorrect Optimum ID or password.')]")
	public WebElement errorMessage;
	@FindBy(xpath = "//a[contains(text(),'TeamViewer')]")
	public WebElement teamViewr;

	// public SigninPages() {
	// PageFactory.initElements(driver, this);
	// }
	//
	//

	public void OptimumSignIn(String UserName, String Password) throws Exception {

		if (alartElement == null) {		
			System.out.println("Alart is not avaiable");}
		else if(alartElement.isDisplayed()) {
			alartElement.click();
		}

		try {

			if (myOptimumID.isDisplayed() && myOptimumPass.isDisplayed()) {
				myOptimumID.clear();
				myOptimumPass.clear();
				myOptimumID.sendKeys(UserName);
				myOptimumPass.sendKeys(Password);
				submitButton.click();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
