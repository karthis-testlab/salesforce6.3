package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class InventoryPage extends ProjectSpecificMethods {
	
	public InventoryPage validateInventoryPageUrl() {
		verifyUrl("https://www.saucedemo.com/inventory.html");		
		return this;
	}

}