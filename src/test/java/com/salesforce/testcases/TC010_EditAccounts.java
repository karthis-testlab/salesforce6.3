package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC010_EditAccounts extends ProjectSpecificMethods 
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Edit Accounts";
		testDescription = "Verify Edit Accounts functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void editAccounts() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.togglebutton()
		.viewAll()
		.clkSalesAccount()
		.clkAccounts()
		.clkUniqueSearch()
		.clkUniqueAccountName()
		.clkDropDown()
		.clkEdit()
		.clkType()
		.listOfTypeOptions()
		.clkIndustry()
		.listOfIndustryOptions()
		.enterBillingAddress()
		.enterShippingAddress()
		.clkCustomerPriority()
		.listOfCustomerPriorityOptions()
		.clkSla()
		.listOfSlaOptions()
		.clkActive()
		.listOfActiveOptions()
		.clkUpSellOpportunity()
		.listOfUpSellOpportunityOptions()
		.typeNumber()
		.clkSave()
		.verifyEditResult();

	}
}
