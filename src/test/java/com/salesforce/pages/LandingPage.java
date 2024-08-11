package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class LandingPage extends ProjectSpecificMethods{
	public LandingPage verifyTitle() {
		verifyTitle("Lightning Experience");
		return this;
	}
	
	public LandingPage clickOnAppLauncher() {
		
		WebElement ele = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "salesforce.applauncher.div.xpath"));
	    clickUsingJs(ele);
	    return this;
	}
	
	public LandingPage clickViewAll() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "salesforce.applauncher.button.xpath")));
		return this;
	}
	public LandingPage typeSearchKeyword(String keyword) {
		append(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "salesforce.applauncher.input.xpath")), keyword);
		return this;
	}
	public OpportunitiesPage clickSalesTab() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "salesforce.applauncher.sales.xpath")));
		return new OpportunitiesPage();
	}
//	public OpportunitiesPage clickOnTheOpportunityMenu() {
//		click(locateElement(Locators.LINK_TEXT, getDomValue("LandingPage", "sf.lap.search.list.menu")));
//		return new OpportunitiesPage();
//	}


}
