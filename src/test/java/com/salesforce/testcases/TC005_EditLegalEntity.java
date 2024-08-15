package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC005_EditLegalEntity extends ProjectSpecificMethods 
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Edit Legal Entity";
		testDescription = "Verify Edit LegalEntity functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void editLegalEntity() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.legaltogglebutton()
		.appLauncherLegalEntity()
		.searchLegalEntity("lega")
		.clksearchedLegalEntity()
		.editsearch_legalentity()
		.editslegalEntity_clkdropdown()
		.edits_legalEntity_clkedit()
		.edits_companyname()
		.desc()
		.edit_StatusActive()
		.clkSave();

	}
}


