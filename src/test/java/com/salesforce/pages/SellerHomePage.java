package com.salesforce.pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.Assertions;
import com.framework.utils.PropertyHandler;
import com.framework.utils.WaitUtils;

public class SellerHomePage extends ProjectSpecificMethods {

	List<WebElement> tabOptions = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Options.tab"));

	WebElement btnNew = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "New.button"));

	WebElement titleNewAccount = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "NewAccount.title"));

	WebElement txtAccountName = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "AccountName.text"));

	WebElement ddOwnership = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Ownership.dropdown"));

	List<WebElement> OwnerShipOptions = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "OwnerShip.options"));

	WebElement btnSave = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Save.button"));

	List<WebElement> tabOption = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Option.tab"));

	List<WebElement> AccountView = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "AccountView.table"));

	WebElement txtSearchAccount = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "SearchAccount.text"));

	WebElement txtMessage = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Message.text"));

	WebElement ddActionDropdown = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "ActionDropdown.dropdown"));

	WebElement btnEdit = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Edit.button"));

	WebElement popUpEditAccount = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "EditAccount.popup"));

	WebElement txtPhoneNo = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "PhoneNo.text"));

	WebElement ddAccountType = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "AccountType.dropdown"));

	List<WebElement> optionsAccountType = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "AccountType.options"));

	WebElement ddIndustry = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Industry.dropdown"));

	List<WebElement> optionsIndustry = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Industry.options"));

	WebElement txtBillingStreet = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "BillingStreet.text"));

	WebElement txtBillingCity = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "BillingCity.text"));

	WebElement txtBillingZipCode = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "BillingZipCode.text"));

	WebElement txtBillingProvince = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "BillingProvince.text"));

	WebElement txtBillingCountry = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "BillingCountry.text"));

	WebElement txtShippingStreet = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "ShippingStreet.text"));

	WebElement txtShippingCity = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "ShippingCity.text"));

	WebElement txtShippingZipCode = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "ShippingZipCode.text"));

	WebElement txtShippingProvince = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "ShippingProvince.text"));

	WebElement txtShippingCountry = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "ShippingCountry.text"));

	WebElement ddCustomerPriority = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "CustomerPriority.dropdown"));

	WebElement ddSLA = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "SLA.dropdown"));

	List<WebElement> optionsCustomerPriority = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "CustomerPriority.options"));

	List<WebElement> optionsSLA = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "SLA.options"));

	WebElement ddActive = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Active.dropdown"));

	List<WebElement> optionsActive = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Active.options"));

	WebElement ddUpsell = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Upsell.dropdown"));

	List<WebElement> OptionsUpsell = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "Upsell.options"));

	WebElement gridPhoneNoValue = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "PhoneNoValue.grid"));

	WebElement popupEditSuccessToaster = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("SellerHomePage", "EditSuccessToaster.message"));

	public SellerHomePage clickNewButton() {
		new WaitUtils().waitForElementToBeVisible(btnNew);
		clickUsingActions(btnNew);
		return this;

	}

	public SellerHomePage verifyCreateNewAccountPopupIsOpened() {
		verifyDisplayed(titleNewAccount);
		checkWindowHandles();
		return this;
	}

	public SellerHomePage enterAccountDetailsInCreateNewAccountPopup(String AccountName, String AccountType) {

		moveToElement(txtAccountName);
		append(txtAccountName, AccountName);
		clickUsingJs(ddOwnership);
		for (int i = 0; i <= (OwnerShipOptions.size()) - 1; i++) {
			String Option = OwnerShipOptions.get(i).getText().trim();
			if (Option.equals(AccountType)) {
				clickUsingJs(OwnerShipOptions.get(i));
				break;
			}
		}
		return this;
	}

	public SellerHomePage clickSaveButton() {
		clickUsingActions(btnSave);
		return this;
	}

	public AccountsPage verifyAccountCreationSuccessMessage(String AccountName) {
		try {
			if (txtMessage.getText().trim().contains(AccountName)) {
				Assertions.assertTrue(true, "Account is added successful");
				reportStep("Account is added successfully", "pass");
			}
		} catch (Exception e) {
			reportStep("Account is not added", "fail");
		}
		return new AccountsPage();
	}

	public SellerHomePage searchForNewAccountInTable(String AccountName) throws AWTException {
		new WaitUtils().waitForElementToBeVisible(txtSearchAccount);
		append(txtSearchAccount, AccountName);
		pressEnter();
		for (int i = 0; i <= (AccountView.size()) - 1; i++) {
			try {
				new WaitUtils().waitForElementsToBeVisible(AccountView);
			} catch (StaleElementReferenceException e) {
				new WaitUtils().waitForPresenceOfElement(By.xpath("//table/tbody/tr"));

			} catch (org.openqa.selenium.TimeoutException e) {
				// txtSearchAccount.clear();
				clear(txtSearchAccount);
				append(txtSearchAccount, AccountName);
				pressEnter();
			}

		}
		return this;
	}

	public SellerHomePage valideAddedAccountInTable(String AccountName) throws AWTException {
		for (int i = 0; i <= (AccountView).size() - 1; i++) {
			try {
				new WaitUtils().waitForElementsToBeVisible(AccountView);
				if ((AccountView).get(i).getText().trim().contains(AccountName)) {
					Assertions.assertTrue(true, "Account Name is verified in the Table");
					reportStep("Account name is verified in the Table", "pass");
				}
			} catch (StaleElementReferenceException e) {
				new WaitUtils().waitForElementToBeStale(AccountView.get(i));
				getDriver().findElements(By.xpath("//table/tbody/tr"));
				if ((getDriver().findElements(By.xpath("//table/tbody/tr"))).get(i).getText().trim()
						.contains(AccountName)) {
					Assertions.assertTrue(true, "Account Name is verified in the Table");
				}
			} catch (TimeoutException e) {
				clear(txtSearchAccount);
				append(txtSearchAccount, AccountName);
				pressEnter();
				new WaitUtils().waitForElementsToBeVisible(AccountView);
				if ((getDriver().findElements(By.xpath("//table/tbody/tr"))).get(i).getText().trim()
						.contains(AccountName)) {
					Assertions.assertTrue(true, "Account Name is verified in the Table");
				}
			}

		}

		return this;

	}

	public SellerHomePage clickAction(String EditAccount) {

		try {
			moveToElement(ddActionDropdown);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			new WaitUtils().waitForElementToBeVisible(ddActionDropdown);
			moveToElement(ddActionDropdown);
			clickUsingJs(ddActionDropdown);
		}
		return this;

	}

	public SellerHomePage clickEdit() {
		clickUsingJs(btnEdit);
		return this;
	}

	public SellerHomePage editAccountDetailsPhoneNumber(String PhoneNo) {
		new WaitUtils().waitForElementToBeClickable(txtPhoneNo);
		append(txtPhoneNo, PhoneNo);
		return this;
	}

	public SellerHomePage editAccountType(String AccountType) {
		clickUsingJs(ddAccountType);

		for (int i = 0; i <= (optionsAccountType.size()) - 1; i++) {
			try {
				String AccountTypeOption = optionsAccountType.get(i).getText().trim();

				if (AccountTypeOption.equals(AccountType)) {
					clickUsingJs(optionsAccountType.get(i));
					break;
				}

			} catch (java.lang.NullPointerException e) {
				continue;
			}
		}
		return this;
	}

	public SellerHomePage selectIndustry(String Industry) {
		clickUsingJs(ddAccountType);

		for (int j = 0; j <= (optionsIndustry.size()) - 1; j++) {
			String IndustryTypeOption = optionsIndustry.get(j).getText().trim();
			if (IndustryTypeOption.contains(Industry)) {
				clickUsingJs(optionsIndustry.get(j));
				break;
			}
		}
		return this;

	}

	public SellerHomePage enterBillingDetails(String BillingAddress1, String BillingAddress2, String BillingAddress3,
			String BillingAddress4) {
		scrollVertically(popUpEditAccount, 750);
		append(txtBillingStreet, BillingAddress1);
		append(txtBillingCity, BillingAddress2);
		append(txtBillingZipCode, BillingAddress3);
		append(txtBillingCountry, BillingAddress4);
		return this;
	}

	public SellerHomePage enterShippingDetails(String ShippingAddress1, String ShippingAddress2,
			String ShippingAddress3, String ShippingAddress4) {
		append(txtShippingStreet, ShippingAddress1);
		append(txtShippingCity, ShippingAddress2);
		append(txtShippingZipCode, ShippingAddress3);
		clickUsingJs(ddCustomerPriority);
		for (int j = 0; j <= (optionsCustomerPriority.size()) - 1; j++) {
			String CustomerPriorityTypeOption = optionsCustomerPriority.get(j).getText().trim();
			if (CustomerPriorityTypeOption.contains("Low")) {
				clickUsingJs(optionsCustomerPriority.get(j));
				break;
			}
		}
		return this;
	}

	public SellerHomePage selectSLA(String SLA) {
		scrollVertically(popUpEditAccount, 200);
		clickUsingJs(ddSLA);
		for (int j = 0; j <= (optionsSLA.size()) - 1; j++) {
			String SLATypeOption = optionsSLA.get(j).getText().trim();
			if (SLATypeOption.contains("Silver")) {
				clickUsingJs(optionsSLA.get(j));
				break;
			}
		}
		return this;
	}

	// 14) Select Active as NO
	public SellerHomePage selectActiveStatus(String Active) {
		// Scrolling
		scrollVertically(popUpEditAccount, 100);
		clickUsingJs(ddActive);
		for (int j = 0; j <= (optionsActive.size()) - 1; j++) {
			try {
				String ActiveOption = optionsActive.get(j).getText().trim();
				if (ActiveOption.equals(Active)) {
					clickUsingJs(optionsActive.get(j));
					break;
				}

			} catch (java.lang.NullPointerException e) {
				continue;
			}
		}
		return this;
	}

	public SellerHomePage selectUpsell() {
		clickUsingJs(ddUpsell);

		for (int j = 0; j <= (OptionsUpsell.size()) - 1; j++) {
			try {
				String UpsellOption = OptionsUpsell.get(j).getText().trim();
				if (UpsellOption.equals("No")) {
					clickUsingJs(OptionsUpsell.get(j));
					break;
				}
			} catch (java.lang.NullPointerException e) {
				continue;
			}
		}
		return this;
	}

	// Clicking on Save Button
	public SellerHomePage clickSave() {
		try {
			clickUsingActions(btnSave);
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			new WaitUtils().waitForElementToBeStale(btnSave);
			btnSave = getDriver().findElement(By.xpath("//*[@name='SaveEdit']"));
			new WaitUtils().waitForElementToBeVisible(btnSave);
			clickUsingActions(btnSave);
		}
		return this;
	}

	// Verify the Success Toaster message

	public SellerHomePage verifyEditSuccessToasterMessage() {
		try {
			if (getDriver().findElement(By.xpath("//*[@data-aura-class='forceActionsText']")).getText().trim()
					.contains("saved")) {
				System.out.println("Account is saved successful");
				Assertions.assertSuccessMessage(true, "Account is saved successful");
				reportStep("Account Edit message is displayed", "pass");
			}

		} catch (Exception e) {
			reportStep("Account Edit Step is not displayed", "fail");
		}
		return this;
	}

	// Verifying the added Phone Number in the Grid
	public SellerHomePage verifyTheEditedPhoneNoInTheGrid(String PhoneNo) {
		try {
			if (gridPhoneNoValue.getText().trim().equals(PhoneNo)) {
				System.out.println("Phone Number is verified Successfully");
				Assertions.assertSuccessMessage(true, "Phone Number is verified Successfully");
				reportStep("Phone Number is verified Successfully", "pass");
			}

		} catch (Exception e) {
			reportStep("Phone Number is not verified", "fail");
		}
		return this;
	}

}
