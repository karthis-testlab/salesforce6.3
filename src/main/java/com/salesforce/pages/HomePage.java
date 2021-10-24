package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	/*
	 * Author/Date: Sathya / 23OCT21
	 * For clicking the Toggle button in Home page
	 */
	public HomePage clickToggleButton() {
		click(Locators.CLASS_NAME, "slds-icon-waffle");
		reportStep("Toggle button is clicked", "pass"); 
		return this; 
		
	}
	
	/*
	 * Author/Date: Sathya / 23OCT21
	 * For clicking the "View All" link after clicking the Toggle button
	 */
	public HomePage clickViewAllLink() {
		click(Locators.XPATH, "//button[@class='slds-button']");
		reportStep("View All link is clicked", "pass"); 
		return this; 
	}
	
	
	/*
	 * Author/Date: Sathya / 24OCT21
	 * For clicking link "Individuals" after clicking "View All"
	 * This click is using JavaScript Click
	 */
	public NewIndividualPage clickIndividualsLink() {
		WebElement elementIndividual = locateElement(Locators.XPATH, "//p[@class='slds-truncate' and text()='Individuals']"); 
		clickUsingJs(elementIndividual);
		reportStep("Individuals link is clicked", "pass"); 
		return new NewIndividualPage(); 
	}
	
	/*
	 * Author/Date: Sathya / 24OCT21
	 * For clicking link "Individuals" after clicking "View All"
	 * This click is using Actions Class
	 */
	public NewIndividualPage clickIndividualsLinkusingAction() {
		WebElement elementIndividual = locateElement(Locators.XPATH, "//p[@class='slds-truncate' and text()='Individuals']"); 
		moveToElement(elementIndividual);
		click(elementIndividual);
		reportStep("Individuals link is clicked", "pass"); 
		return new NewIndividualPage(); 
	}
	
	
}
