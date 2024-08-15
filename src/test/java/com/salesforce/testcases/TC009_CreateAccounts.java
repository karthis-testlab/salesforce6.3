package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC009_CreateAccounts extends ProjectSpecificMethods
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Create Accounts";
		testDescription = "Verify Create Accounts functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createAccounts() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.togglebutton()
		.viewAll()
		.clkSalesAccount()
		.clkAccounts()
		.clkNew()
		.typeAccountName()
		.clkOwnershipDropDown()
		.listOfOwnershipOptions()
		.clkSave()
		.verifyAccountCreated();

	}
}
