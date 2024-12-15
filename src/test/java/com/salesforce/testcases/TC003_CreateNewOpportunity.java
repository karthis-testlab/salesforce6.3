package com.salesforce.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.LoginPage;

public class TC003_CreateNewOpportunity extends ProjectSpecificMethods{
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "CreateNewOpportunity";
		testDescription = "Verify creating new Opportunity functionality";
		authors = "Thiagarajan";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createNewOpportunity() throws InterruptedException {
		new LoginPage()
		.enterUsername(PropertyHandler.readConfigProperty("username"))
		.enterPassword(PropertyHandler.readConfigProperty("password"))
		.clickLoginBtn()
		.clickAppLauncher()
		.typeSearchKeyword("opportunities")
		.clickOpportunitiesSearchResult();				
	}

}
