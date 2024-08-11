package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class AccountsMainPage extends ProjectSpecificMethods {
	
	public AccountsMainPage clickNewButton() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsMainPage", "sf.amp.new.button")));
		return this;
	}
	
	public AccountsMainPage enterAccountName(String keyword) {
		append(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsMainPage", "sf.amp.name.field")), keyword);
		return this;
	}

	public AccountsMainPage clickOwnershipDropdown() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsMainPage", "sf.amp.ownership.dropdown.button")));
		return this;
	}

	public AccountsMainPage clickOwnershipType() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsMainPage", "sf.amp.ownership.dropdown.option")));
		return this;
	}
	
	public AccountsVerificationPage clickSaveButton() {
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsMainPage", "sf.amp.save.button")));
		return new AccountsVerificationPage();
	}	
	

}
	

