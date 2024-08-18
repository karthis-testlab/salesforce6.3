package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUsername(String username) {		
		type(locateElement(Locators.ID,PropertyHandler.readObjectProperty("LoginPage", "sf.alp.username.field")), username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		type(locateElement(Locators.ID, PropertyHandler.readObjectProperty("LoginPage", "sf.alp.password.field")), password);
		return this;
	}
	
	public LandingPage clickLoginBtn() {
		click(locateElement(Locators.ID, PropertyHandler.readObjectProperty("LoginPage", "sf.alp.login.button")));
		return new LandingPage();
	}
	
}