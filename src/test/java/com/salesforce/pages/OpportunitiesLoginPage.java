package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class OpportunitiesLoginPage extends ProjectSpecificMethods {
	
	public OpportunitiesLoginPage enterOppUsername(String username) {		
		type(locateElement(Locators.ID,PropertyHandler.readObjectProperty("OpportunitiesLoginPage", "sf.olp.username.field")), username);
		return this;
	}
	
	public OpportunitiesLoginPage enterOppPassword(String password) {
		type(locateElement(Locators.ID, PropertyHandler.readObjectProperty("OpportunitiesLoginPage", "sf.olp.password.field")), password);
		return this;
	}
	
	public OpportunitiesLauncherPage clickOppLoginBtn() {
		click(locateElement(Locators.ID, PropertyHandler.readObjectProperty("OpportunitiesLoginPage", "sf.olp.login.button")));
		return new OpportunitiesLauncherPage();
	}
	
}