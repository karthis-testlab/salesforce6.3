package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "CreateOpportunity";
		testDescription = "Verify Login functionality with positive data";
		authors = "Anu";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		.enterUsername(PropertyHandler.readConfigProperty("username"))
		.enterPassword(PropertyHandler.readConfigProperty("password"))
		.clickLoginBtn()
		.verifyTitle()
		.clickOnAppLauncher()
		.clickViewAll()
		.typeSearchKeyword("Sales")
		.clickSalesTab()
		.clickOnTheOpportunityMenu()
		.clickOnNewButton();
	}

}