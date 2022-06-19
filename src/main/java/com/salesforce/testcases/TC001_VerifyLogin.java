package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Login";
		testDescription = "Login salesforce page and verify title";
		category = "Sanity";
		authors = "Nawin";
		excelFileName = "";
		
	}

	
	@Test
	public void loginTest() {
		new LoginPage()
		.enterUserName("matschie@testleaf.com")
		.enterPassword("BootcampSel$123")
		.clickLogin()
		.verifypagetitle("Home | Salesforce");
		
	}


}
