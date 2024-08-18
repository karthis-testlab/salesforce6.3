package com.salesforce.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.LoginPage;

public class TC004_DeleteAccount extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "Delete an account";
		testDescription = "Verify delete account functionality";
		authors = "Thiagarajan";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void deleteAnAccount() {
		new LoginPage()
		.enterUsername(PropertyHandler.readConfigProperty("username"))
		.enterPassword(PropertyHandler.readConfigProperty("password"))
		.clickLoginBtn()
		.clickAppLauncher()
		.typeSearchKeyword("accounts")
		.clickAccountsSearchResult()
		.clickDeleteDropdownButton()
		.clickDeleteButton()
		.clickDeleteButton2()
		.readToastMessage()
		.clickProfileIcon()
		.clickLogoutButton();				
	}

}