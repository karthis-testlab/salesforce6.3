package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class LoginPageWork extends ProjectSpecificMethods {
	public LoginPageWork enterUsername(String username) {		
		type(locateElement(Locators.ID,PropertyHandler.readObjectProperty("LoginPageWork", "worktype.username.textbox.id")), username);
		return this;
	}
	
	public LoginPageWork enterPassword(String password) {
		type(locateElement(Locators.ID, PropertyHandler.readObjectProperty("LoginPageWork", "worktype.password.textbox.id")), password);
		return this;
	}
	
	public Homepagework clickLoginBtn() {
		click(locateElement(Locators.ID, PropertyHandler.readObjectProperty("LoginPageWork", "worktype.login.button.id")));
		return new Homepagework();
	}
	
	
}


