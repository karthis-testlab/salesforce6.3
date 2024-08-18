package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.LoginPageWork;

public class TC001_VerifyLoginwork extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "VerifyLoginwork";
		testDescription = "Verify Login functionality with positive data";
		authors = "Vinothkumar";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void runLogin() throws Exception {
		new LoginPageWork()
		.enterUsername("bootcamp_2024@testleaf.com")
		.enterPassword("Bootcamp@123")
		.clickLoginBtn()
	     .togglebutton()
	     .viewAll()
	     .appLauncher()
	     .clkworktype();
	     
	     
	     
	     
		
		
		

}}