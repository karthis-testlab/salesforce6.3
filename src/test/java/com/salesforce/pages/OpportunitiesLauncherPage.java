package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class OpportunitiesLauncherPage extends ProjectSpecificMethods {
	
	public OpportunitiesLauncherPage clickOppAppLauncher() {		
		click(locateElement(Locators.ID,PropertyHandler.readObjectProperty("OpportunitiesLauncherPage", "sf.olp.applauncher.icon")));
		return this;
	}
	
	public OpportunitiesLauncherPage typeOppSearchKeyword(String keyword) {
		type(locateElement(Locators.ID, PropertyHandler.readObjectProperty("OpportunitiesLauncherPage", "sf.olp.searchKeyword.field")), keyword);
		return this;
	}
	
	public OpportunitiesMainPage clickOppSearchResult() {
		click(locateElement(Locators.ID, PropertyHandler.readObjectProperty("OpportunitiesLauncherPage", "sf.olp.clickSearchResult.field")));
		return new OpportunitiesMainPage();
	}
	
}