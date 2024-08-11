package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUsername(String username) {		
		type(locateElement(Locators.ID,PropertyHandler.readObjectProperty("LoginPage", "sp.username.textbox.id")), username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		type(locateElement(Locators.ID, PropertyHandler.readObjectProperty("LoginPage", "sp.password.textbox.id")), password);
		return this;
	}
	
	public InventoryPage clickLoginBtn() {
		click(locateElement(Locators.ID, PropertyHandler.readObjectProperty("LoginPage", "sp.login.button.id")));
		return new InventoryPage();
	}
	
	
}