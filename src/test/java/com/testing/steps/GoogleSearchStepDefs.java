package com.testing.steps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import com.testing.commons.*;
import com.testing.steps.serenity.GoogleSearchSteps;

public class GoogleSearchStepDefs {
	
	@Steps
	GoogleSearchSteps searchSteps;

	@BeforeScenario
	public void userAccessToGoogleHomePage() {
		searchSteps.openGoogleHomePage();
	}
	
	@Given("I perform a search action for keyword '$keyword'")
	public void userInputSearchKeyword(String keyword) {
		searchSteps.performASearchActionForSpecificKeyWord(keyword);
	}
	
	@Then("I see the search results includes '$expectedtext'")
	public void userShouldSeeCorrectResults(String expectedText) {
		searchSteps.verifyTheDisplayedSearchResults(expectedText);
	}
}
