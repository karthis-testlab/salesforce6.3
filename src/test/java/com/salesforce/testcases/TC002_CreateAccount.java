package com.salesforce.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.AccountsPage;
import com.salesforce.pages.DashboardPage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.SellerHomePage;

public class TC002_CreateAccount extends ProjectSpecificMethods{
	
	@Test(priority = 1 )
	public void runLogin() {
		new LoginPage().enterUserName().enterPassword().clickLoginButtonAndLoginIsSuccess();
	}
	
	
	
	@Test(priority = 2)
	public void navigateToSalesPage() {
		new HomePage().clickToggle().verifyandclickViewAll().AppLaucherOption("sales");
		}

	@Test(priority = 3)
	public void navigateToCreateAccountPage() {
		new DashboardPage().clickAccounts();
		}
	
	@Test(priority = 4)
	public void openCreateNewAccountPopup() {
     new SellerHomePage().clickNewButton().verifyCreateNewAccountPopupIsOpened();
		}
	
	@Test(priority = 5 , dataProvider = "getdata1")
	public void fillAccountDetailsAndClickSave(String AccountName, String AccountType) {
		new SellerHomePage().enterAccountDetailsInCreateNewAccountPopup(AccountName , AccountType).clickSaveButton();
		}
	
	@Test(priority = 6, dataProvider = "getdata1")
	public void verifyAccountCreationSuccesMessage(String AccountName) {
		new AccountsPage().verifyAccountCreationSuccessMessage(AccountName);
		}
	
	@Test(priority = 7 , dataProvider = "getdata1")
	public void searchForNewlyAddedAccountInTable(String AccountName) throws AWTException {
		new DashboardPage().clickAccounts().searchForNewAccountInTable(AccountName);
		}
	
	@Test(priority = 8,  dataProvider = "getdata1")
	public void verifyNewlyAddedAccountInAccountsTable(String AccountName) throws AWTException {
		new SellerHomePage().valideAddedAccountInTable(AccountName);
		}

}
