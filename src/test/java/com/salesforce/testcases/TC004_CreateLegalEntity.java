package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC004_CreateLegalEntity extends ProjectSpecificMethods
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Create LegalEntity";
		testDescription = "Verify Create LegalEntity functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createLegalEntity() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.legaltogglebutton()
		.appLauncherLegalEntity()
		.searchLegalEntity("lega")
		.clksearchedLegalEntity()
		.clkNewLegalEntity()
		.enterLegalEntityName()
		.clkSave()
		.actualTextLegalEntity();

	}
}
