package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Create an Opportunity";
		testDescription = "Create a new opportuinity";
		authors = "Selvi";
		category = "Smoke";
		//excelFileName = "";
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		//.enterUsername("bootcamp_2024@testleaf.com")
		//.enterPassword("Bootcamp@123")
		.enterUsername(PropertyHandler.readConfigProperty("username"))
		.enterPassword(PropertyHandler.readConfigProperty("password"))
		.clickLoginBtn();
		//.validateInventoryPageUrl();
	}

}