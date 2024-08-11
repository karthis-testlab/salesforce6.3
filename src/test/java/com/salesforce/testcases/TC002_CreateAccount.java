package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;
import com.salesforce.pages.AccountsLoginPage;

public class TC002_CreateAccount extends ProjectSpecificMethods {	
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "CreateNewAccount";
		testDescription = "Verify creating new account functionality";
		authors = "Thiagarajan";
		category = "Smoke";
		excelFileName = "";
	}
	
	@Test
	public void createNewAccount() {
		new AccountsLoginPage()
		.enterUsername(PropertyHandler.readConfigProperty("username"))
		.enterPassword(PropertyHandler.readConfigProperty("password"))
		.clickLoginBtn()
		.clickAppLauncher()
		.typeSearchKeyword("accounts")
		.clickSearchResult()
		.clickNewButton()
		.enterAccountName("New account")
		.clickOwnershipDropdown()
		.clickOwnershipType()
		.clickSaveButton()
		.readToastMessage()
		.clickProfileIcon()
		.clickLogoutButton();
				
	}

}