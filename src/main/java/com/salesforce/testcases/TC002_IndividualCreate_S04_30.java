package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_IndividualCreate_S04_30 extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Indiviudal";
		testDescription ="Test case to verify Individual is created successfully";
		authors="Sathya";
		category ="Smoke";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void createIndividual(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickToggleButton()
		.clickViewAllLink()
		.clickIndividualsLink()
		.clickNewButton()
		.enterLastName()
		.clickSaveButton()
		.verifyCreatedIndividual(); 

	}

}
