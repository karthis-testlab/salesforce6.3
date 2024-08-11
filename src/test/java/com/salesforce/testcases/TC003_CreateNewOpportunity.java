package com.salesforce.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.OpportunitiesLauncherPage;
import com.salesforce.pages.OpportunitiesLoginPage;

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
		new OpportunitiesLoginPage()
		.enterOppUsername(PropertyHandler.readConfigProperty("username"))
		.enterOppPassword(PropertyHandler.readConfigProperty("password"))
		.clickOppLoginBtn();
		
		new OpportunitiesLauncherPage()
		.clickOppAppLauncher()
		.typeOppSearchKeyword("opportunities")
		.clickOppSearchResult();
		
		Thread.sleep(5000);
				
	}

}
