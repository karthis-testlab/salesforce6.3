package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class InventoryPage extends ProjectSpecificMethods {
	
	public InventoryPage validateInventoryPageUrl() {
		verifyUrl("https://testleaf65-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home");		
		return this;
	}

}