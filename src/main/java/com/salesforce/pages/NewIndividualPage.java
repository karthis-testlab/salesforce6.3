package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewIndividualPage extends ProjectSpecificMethods {
	

	/*
	 * Author/Date: Sathya / 24OCT21
	 * For clicking the New button for Individual
	 */
	public NewIndividualPage clickNewButton() {
		click(Locators.XPATH, "//div[@title='New']");
		reportStep("New button for Individual is clicked", "pass"); 
		return this; 
	}
	
	
	/*
	 * Author/Date: Sathya / 24OCT21
	 * For entering Last Name for Individual
	 */
	public NewIndividualPage enterLastName() {
		WebElement lastName = locateElement(Locators.XPATH, "//input[@placeholder='Last Name']");
		clearAndType(lastName, "Muthumariappan");
		reportStep("Last Name is entered for Individual", "pass"); 
		return this; 
	}
	
	
	/*
	 * Author/Date: Sathya / 24OCT21
	 * For Saving the New Individual
	 */
	public NewIndividualPage clickSaveButton() {
		click(Locators.XPATH, "//div[@data-aura-class='forceRecordEditActions']//span[text()='Save']"); 
		reportStep("Save button for New Individual is clicked", "pass"); 
		return this; 
	}
	
	
	/*
	 * Author/Date: Sathya / 24OCT21
	 * For verifying that the New Individual is created successfully
	 */
	public NewIndividualPage verifyCreatedIndividual() {
		WebElement successText = locateElement(Locators.XPATH, "//span[text()='We found no potential duplicates of this Individual.']");
		verifyExactText(successText, "We found no potential duplicates of this Individual.");
		reportStep("New Individual is successfully created", "pass"); 
		return this; 
	}
	
}
