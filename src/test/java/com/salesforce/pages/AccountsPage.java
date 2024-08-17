package com.salesforce.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.Assertions;
import com.framework.utils.PropertyHandler;
import com.framework.utils.WaitUtils;

public class AccountsPage extends ProjectSpecificMethods{

	
	

	WebElement txtMessage  = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsPage","Message.textBox"));
	
	List<WebElement> tabOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountsPage", "Options.tab"));
	
	public AccountsPage verifyAccountCreationSuccessMessage(String AccountName) {

		new WaitUtils().waitForElementToBeVisible(txtMessage);
		try {
		if (txtMessage.getText().trim().contains(AccountName)) {
			Assertions.assertTrue(true, "Account is added successful");
			reportStep("Account is added successful", "pass");
		}} catch(Exception e) {
			reportStep("User Name is not Entered ", "fail");
		}
		return this;
	}
	
	
	public SellerHomePage clickAccounts() {
		checkWindowHandles();
		for (int i = 0; i <= (tabOptions.size()) - 1; i++) {
			String TabName = tabOptions.get(i).getAttribute("title").trim();
			if (TabName.equals("Accounts")) {
				clickUsingJs(tabOptions.get(i));
				break;
			}			
	}
		return new SellerHomePage();
		
}

}
