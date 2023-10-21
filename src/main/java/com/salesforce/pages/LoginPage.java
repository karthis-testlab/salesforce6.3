package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUsername(String username) {		
		type(locateElement(Locators.ID,"user-name"), username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		type(locateElement(Locators.ID, "password"), password);
		return this;
	}
	
	public InventoryPage clickLoginBtn() {
		click(locateElement(Locators.ID, "login-button"));
		return new InventoryPage();
	}
	
	
}