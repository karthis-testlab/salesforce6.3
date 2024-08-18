package com.salesforce.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.LoginPage;

public class TC005_VerifyAccountSorting extends ProjectSpecificMethods{
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Verify account sort";
		testDescription = "Verify account sort functionality";
		authors = "Thiagarajan";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void runVerifyAccountSort() throws InterruptedException {
		new LoginPage()
		.enterUsername(PropertyHandler.readConfigProperty("username"))
		.enterPassword(PropertyHandler.readConfigProperty("password"))
		.clickLoginBtn()
		.clickAppLauncher()
		.typeSearchKeyword("accounts")
		.clickAccountsSearchResult();
		Thread.sleep(5000);
		
	}


}
