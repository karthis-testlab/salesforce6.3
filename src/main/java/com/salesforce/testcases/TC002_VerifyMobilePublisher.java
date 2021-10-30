package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.testng.api.base.RetryEngine;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MobilePublisherPage;

public class TC002_VerifyMobilePublisher extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyMobilePublisher";
		testDescription ="Verify Mobile Publisher test case";
		authors="Sandhiya";
		category ="Regression";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData", retryAnalyzer = RetryEngine.class)
	public void mobilePublisher(String username, String password) {
		new LoginPage().enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickLearnMoreLink()
		.clickResourcePage()
		.clickonResource();
		
		

	}
}
