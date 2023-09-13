package com.testing.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import static com.testing.commons.GlobalConstants.URL;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl(URL)
public class GoogleSearchPage extends PageObject {

	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchTextArea;

    @FindBy(xpath = "//h3")
    private WebElement actualTextResult;
    
    public void searchSpecificKeyword(String keyword) {
    	searchTextArea.sendKeys(keyword);
    	searchTextArea.sendKeys(Keys.ENTER);
    }
    
    public void verifySearchResults(String expectedResult) {
    	String actualResult = actualTextResult.getText();
    	Assert.assertEquals(expectedResult, actualResult);
    }
    
}