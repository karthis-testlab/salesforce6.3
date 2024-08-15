package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC006_CreateNewCase extends ProjectSpecificMethods
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Create New Case";
		testDescription = "Verify Create New Case functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createNewCase() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.togglebutton()
		.viewAll()
		.clkSales()
		.clkMore()
		.clkCases()
		.clkNew()
		.clkStatus()
		.clkEscalated()
		.clkCaseOrigin()
		.clkEmail()
		.clickAndSelectContactNames()
		.typeSubject()
		.typeDescription()
		.clkSave();

	}
}
