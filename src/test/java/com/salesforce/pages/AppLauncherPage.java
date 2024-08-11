package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class AppLauncherPage extends ProjectSpecificMethods {
	
	public AppLauncherPage clickAppLauncher() {		
		click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("AppLauncherPage", "sf.alp.applauncher.icon")));
		return this;
	}
	
	public AppLauncherPage typeSearchKeyword(String keyword) {
		append(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AppLauncherPage", "sf.alp.searchKeyword.field")), keyword);
		return this;
	}
	
	public AccountsMainPage clickSearchResult() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AppLauncherPage",  "sf.alp.clickSearchResult.field")));
		return new AccountsMainPage();
	}
	



}