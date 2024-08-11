package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_VerifyEditOpportunity extends ProjectSpecificMethods
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Edit Opportunity";
		testDescription = "Verify Edit Opportunity functionality ";
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
		.clkSsearch()
		.searchName()
		.clkdropDown()
		.clkEdit()
		.clkPerceptionAnalysis()
		.clkSave();
		
		

	}

}
