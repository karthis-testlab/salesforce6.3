package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class AccountsLoginPage extends ProjectSpecificMethods {
	
	public AccountsLoginPage enterUsername(String username) {		
		type(locateElement(Locators.ID,PropertyHandler.readObjectProperty("AccountsLoginPage", "sf.alp.username.field")), username);
		return this;
	}
	
	public AccountsLoginPage enterPassword(String password) {
		type(locateElement(Locators.ID, PropertyHandler.readObjectProperty("AccountsLoginPage", "sf.alp.password.field")), password);
		return this;
	}
	
	public AppLauncherPage clickLoginBtn() {
		click(locateElement(Locators.ID, PropertyHandler.readObjectProperty("AccountsLoginPage", "sf.alp.login.button")));
		return new AppLauncherPage();
	}
	
}