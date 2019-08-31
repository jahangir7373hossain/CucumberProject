package com.qa.stepDefination;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.qa.pages.TVPage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TVFeatureTest extends TestBase {

	TVPage TV = new TVPage();
	@Given("^User open the optimtum dot net app$")
	public void user_open_the_optimtum_dot_net_app() throws Throwable {
		setUp();
	}

	@Then("^user mouse hover over TV tab and click on On Demand$")
	public void user_mouse_hover_over_TV_tab_and_click_on_On_Demand() throws Throwable {
		try {
			if (tvPage.TVElement.isDisplayed()) {
				mouseHover(tvPage.TVElement);
				tvPage.onDemandElement.click();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("^User collect the most watched Prime Time Shows$")
	public void user_collect_the_most_watched_Prime_Time_Shows() throws Throwable {
		if (tvPage.alartElement == null) {
			System.out.println("Alart is not available");
		} else if (tvPage.alartElement.isDisplayed()) {
			tvPage.alartElement.click();
		}

		for (int i = 0; i < tvPage.listOfMostWatchPrimeTimeShow.size(); i++) {
			Integer serialNumber = i + 1;
			String moviesList = tvPage.listOfMostWatchPrimeTimeShow.get(i).getText();
			TV.getMovieList(serialNumber,moviesList);
		}
	}
}
