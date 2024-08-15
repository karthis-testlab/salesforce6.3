package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.testng.api.base.RetryEngine;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyCreateOpportunity extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Create Opportunity functionality";
		testDescription = "Verify Create Opportunity functionality";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createOpportunity() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.togglebutton()
		.viewAll()
		.appLauncher()
		.clkOpportunityTab()
		.clkNewButton()
		.enterOpportunityName("Salesforce Automation By Vishal")
		.closeDate()
		.stage()
		.clkSave()
		.verifyCreateOpportunity();
		

	}

}