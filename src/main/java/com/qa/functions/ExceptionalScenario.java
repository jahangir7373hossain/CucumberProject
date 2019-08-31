package com.qa.functions;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.utils.TestBase;
import com.qa.utils.TestUtils;

public class ExceptionalScenario {

	
	/**
	 * Metohd: scrollToView
	 */
//	
//	public void scrollToView(WebElement element) {
//	
//		try {
//			if (element.isDisplayed() || element.isEnabled()) {
//				
//				JavascriptExecutor je = (JavascriptExecutor) driver;
//				je.executeScript("arguments[0].scrollIntoView(true);",element);
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//	
//	
	
//	public void scrollUp(int height) {
//		if (height > 0) {
//			String str = Integer.toString(height);
//			((JavascriptExecutor) driver).executeScript("scroll(0,-" + str + ");");
//		} else {
//			String str = Integer.toString(height * -1);
//			((JavascriptExecutor)driver).executeScript(("window.scrollTo(0," + str + ");"));
//		}
//	}

	/**
	 * Method Name : ScrollToView Method Description: Method to scroll to view
	 * the particular webelement
	 * 
	 * @param :element - to focus
	 * @return none
	 * @author Dhivya Durairaj
	 */

//	public boolean ScrollToView(WebElement element) {
//		boolean blnFlag = false;
//		try {
//			// Thread.sleep(2000);
//			int y = element.getLocation().y;
//			int y1 = 380;
//			// getDriver().manage().window().getSize().getHeight();
//
//			this.scrollUp(y1 / 2 - y);
//			// Thread.sleep(2000);
//			blnFlag = true;
//			System.out.println("Scroll to view is done");
//		} catch (Exception e) {
//			e.printStackTrace();
//			blnFlag = false;
//		}
//		return blnFlag;
//	}


}
