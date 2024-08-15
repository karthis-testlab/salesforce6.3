package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC008_DeleteCases extends ProjectSpecificMethods
{
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Delete Case";
		testDescription = "Verify Delete Case functionality ";
		authors = "Vishal";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void DeleteCase() throws InterruptedException, Exception  {
		new LoginPage()
		.enterUsername("vishal@testleaf.com")
		.enterPassword("trustmavish@2024")
		.clickLoginBtn()
		.togglebutton()
		.viewAll()
		.clkSales()
		.clkMore()
		.clkCases()
		.clkDelete();

}
}