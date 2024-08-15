package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC007_EditCase extends ProjectSpecificMethods
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Edit New Case";
		testDescription = "Verify Edit Case functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void EditCase() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.togglebutton()
		.viewAll()
		.clkSales()
		.clkMore()
		.clkCases()
		.clkEdit()
//		.statusWorking()
//		.setPriority()
//		.caseOriginPhone()
//		.slaViolation()
		.clkSave();

	}
}
