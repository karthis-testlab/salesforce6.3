package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.framework.utils.WaitUtils;

public class LoginPage extends ProjectSpecificMethods {
	
	WebElement txtUserName = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LoginPage", "username.field"));
	
	WebElement txtPassword = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LoginPage", "password.field"));
	
	WebElement btnLogin = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LoginPage", "login.button"));
	
	public LoginPage enterUserName() {
		append(txtUserName, PropertyHandler.readConfigProperty("username"));
		return this;
	}

	public LoginPage enterPassword() {
		append(txtPassword, PropertyHandler.readConfigProperty("password"));
		return this;
	}

	public HomePage clickLoginButtonAndLoginIsSuccess() {
		click(btnLogin);	
		new WaitUtils().waitForTitleOfPage("Home");
		return new HomePage();
	
	}
	
	
	
	
}