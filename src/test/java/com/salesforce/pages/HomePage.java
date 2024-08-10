package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.framework.utils.WaitUtils;

public class HomePage extends ProjectSpecificMethods {

	WebElement btnToggle = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "toggle.button"));
	WebElement btnViewAll = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "viewAll.button"));
	WebElement btnServiceConsole = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "serviceconsole.button"));
	WebElement btnSales = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "sales.button"));


	
	public HomePage clickToggle() {
		new WaitUtils().waitForElementToBeVisible(btnToggle);
		click(btnToggle);
		return this;
	}
	
	public HomePage verifyandclickViewAll() {
		clickUsingJs(btnViewAll);
		return this;
	}
}
