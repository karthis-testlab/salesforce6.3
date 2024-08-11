package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class OpportunitiesPage extends ProjectSpecificMethods{
	
	public OpportunitiesPage VerifyOpportunitiesPage() {
		
		return this;
	}
	public OpportunitiesPage clickOnTheOpportunityMenu() {
		WebElement ele = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "salesforce.opportunities.atag.xpath"));
	    clickUsingJs(ele);
		return this;
	}
	public OpportunitiesPage clickOnNewButton() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "salesforce.opportunities.new.xpath")));
		return this;
	}
	
}
