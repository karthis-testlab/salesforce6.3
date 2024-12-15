package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class LandingPage extends ProjectSpecificMethods {
	
	public LandingPage clickAppLauncher() {		
		click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LandingPage", "sf.alp.applauncher.icon")));
		return this;
	}
	
	public LandingPage typeSearchKeyword(String keyword) {
		append(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "sf.alp.searchKeyword.field")), keyword);
		return this;
	}
	
	public AccountsMainPage clickAccountsSearchResult() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage",  "sf.alp.clickSearchResult.field")));
		return new AccountsMainPage();
	}
	
	public OpportunitiesMainPage clickOpportunitiesSearchResult() {
		click(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "sf.alp.clickSearchResult.field"));
		return new OpportunitiesMainPage();
	}


}