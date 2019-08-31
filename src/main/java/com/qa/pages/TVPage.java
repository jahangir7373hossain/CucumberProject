package com.qa.pages;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVPage {

	@FindBy(xpath = "//span[contains(text(),'TV')]")
	public WebElement TVElement;
	@FindBy(xpath = "//A[contains(text(),'On Demand')]")
	public WebElement onDemandElement;
	@FindBy(xpath= "(//div[@ng-repeat='items in ribbons'])[1]//div[@class='vodCarousel-true']")
	public List<WebElement> listOfMostWatchPrimeTimeShow;
	@FindBy(xpath="(//div[@ng-repeat='items in ribbons'])[1]//div[@ng-style='ieCSSFilters']")
	public List<WebElement> listOfMovies;
	@FindBy(xpath = "(//i[@ng-click='removeAlert();'])[2]")
	public WebElement alartElement;
	
	
	public  void getMovieList(Integer number, String productDetelies) {
		Map<Integer, String> values = new TreeMap<Integer, String>();
		values.put(number, productDetelies);
		for (Entry value : values.entrySet()) {
			System.out.println(value.getKey() + " --------> " + value.getValue());
			System.out.println("-------------------------------");

		}

	}

}
