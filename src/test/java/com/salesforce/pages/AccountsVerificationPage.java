package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class AccountsVerificationPage extends ProjectSpecificMethods {
	
	public AccountsVerificationPage readToastMessage() {
		getElementText(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsVerificationPage", "sf.avp.toastmessage.text")));
		return this;
	}
	
	public AccountsVerificationPage clickProfileIcon() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsVerificationPage", "sf.avp.profile.icon")));
		return this;
	}
	
	public LoginPage clickLogoutButton() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsVerificationPage", "sf.avp.logout.button")));
		return new LoginPage();
	}
	
	

}
	

