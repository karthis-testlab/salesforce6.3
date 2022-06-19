package com.salesforce.pages;

import org.openqa.selenium.WebDriver;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUserName(String data) {
		
		clearAndType(locateElement(Locators.ID, "username"), data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		
		clearAndType(locateElement(Locators.ID, "password"), data);
		return this;
	}
	
	public LandingPage clickLogin() {
		click(locateElement(Locators.ID, "Login"));
		return new LandingPage();
	}
		
	
	
}
