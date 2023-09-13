package com.testing.steps.serenity;

import com.testing.pages.GoogleSearchPage;

import net.thucydides.core.annotations.Step;

public class GoogleSearchSteps {
    GoogleSearchPage searchPage;
    
    @Step
    public void openGoogleHomePage() {
    	searchPage.open();
    }

    @Step
    public void performASearchActionForSpecificKeyWord(String keyword) {
    	searchPage.searchSpecificKeyword(keyword);
    }
    
    @Step
    public void verifyTheDisplayedSearchResults(String resultText) {
    	searchPage.verifySearchResults(resultText);
    }
    
}