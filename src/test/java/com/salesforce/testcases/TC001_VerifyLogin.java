package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "VerifyLogin";
		testDescription = "Verify Login functionality with positive data";
		authors = "Karthikeyan";
		category = "Smoke";
	}
	
	@Test
	public void runLogin() {
	
		new LoginPage().enterUserName().enterPassword().clickLoginButtonAndLoginIsSuccess();

}
	



}