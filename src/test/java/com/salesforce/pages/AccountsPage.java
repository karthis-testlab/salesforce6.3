package com.salesforce.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class AccountsPage extends ProjectSpecificMethods
{

	private static final String Vishal = null;


	public AccountsPage clkNew() 
	{
		clickUsingJs(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkNew.btn")));

//	executeTheScript("arguments[0].click();", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "sf.homepage.more.button")));
		return this;
	}
	
	public AccountsPage typeAccountName() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.enterAccountName")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.enterAccountName")), "Vishal");
		return this;
	}
	
	public AccountsPage clkOwnershipDropDown() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkOwnerShip.dropdown.btn")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkOwnerShip.dropdown.btn")));
		
		
		return this;
	}
	
	public AccountsPage listOfOwnershipOptions() 
	{
		
		List<WebElement> ownerShipOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkOwnerShip.dropdown.listOfOptions"));
		for(WebElement option:ownerShipOptions)
		{
			if(option.getText().equals("Public")) 
			{
				click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkOwnerShip.public")));
	
			}
		}
			
		return this;
	}
	
	public AccountsPage verifyAccountCreated() 
	{
		WebElement actual = locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.verifyAccountName"));
		String text = actual.getText();
		System.out.println(text);
		
		
		
  String expected="Account \"Vishal\" was created.";
		
		assertEquals(text, expected);
		return this;
	}
	
	
	public AccountsPage clkSave() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkSave")));

		return this;
	}
	
	public AccountsPage clkUniqueSearch() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkUniqueSearch")));

		return this;
	}
	
	public AccountsPage clkUniqueAccountName() 
	{
//		List<WebElement> accountNamesList = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.listOfAccountNames"));
//		for(WebElement accountName:accountNamesList) 
//		{
//			if(accountName.getText().equals("Vishal accounts")) 
//			{
//				click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.AccountName")));
//	
//			}
//		}
		
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.AccountName")));

		

		return this;
	}
	
	public AccountsPage clkDropDown() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkdropDown")));

		return this;
	}
	
	public AccountsPage clkEdit() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkEdit")));

		return this;
	}
	
	public AccountsPage clkType() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkType")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkType")));

		return this;
	}
	
	public AccountsPage listOfTypeOptions() 
	{

		List<WebElement> typeOfOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.listOfTypeOptions"));

		for(WebElement type:typeOfOptions) 
		{
		if(type.getText().equals("Technology Partner"))	
		{
			click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.listOfTypeOptions")));

		}
		}
		return this;
	}
	
	public AccountsPage clkIndustry() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkIndustry")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkIndustry")));

		return this;
	}
	
	public AccountsPage listOfIndustryOptions() 
	{

		List<WebElement> typeOfIndustryOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.listOfIndustryOptions"));

		for(WebElement industry:typeOfIndustryOptions) 
		{
		if(industry.getText().equals("Healthcare"))	
		{
			click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.listOfIndustryOptions")));

		}
		}
		return this;
	}
	
	public AccountsPage enterBillingAddress() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.billing.street")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.billing.street")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.billing.street")), "XYZ Street");
		
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.city")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.city")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.city")), "Chennai");
		
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.postalCode")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.postalCode")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.postalCode")), "600 077");
		
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.country")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.country")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.billing.country")), "India");
		
		
		return this;
	}
	
	public AccountsPage enterShippingAddress() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.shipping.street")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.shipping.street")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.shipping.street")), "XYZ Street");
		
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.shupping.city")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.shupping.city")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.shupping.city")), "Chennai");
		
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.shipping.postalCode")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.shipping.postalCode")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.shipping.postalCode")), "600 077");
		

		
		
		return this;
	}
	
	public AccountsPage clkCustomerPriority() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clk.customerPriority")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clk.customerPriority")));

		return this;
	}
	
	public AccountsPage listOfCustomerPriorityOptions() 
	{

		List<WebElement> typeOfCustomerPriorityOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.customerPriority.listOfOptions"));

		for(WebElement customer:typeOfCustomerPriorityOptions) 
		{
		if(customer.getText().equals("Low"))	
		{
			click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.customerPriority.listOfOptions")));

		}
		}
		return this;
	}
	
	public AccountsPage clkSla() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkSla")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.clkSla")));

		return this;
	}
	
	public AccountsPage listOfSlaOptions() 
	{

		List<WebElement> typeOfSlaOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.Sla.listOfOptions"));

		for(WebElement sla:typeOfSlaOptions) 
		{
		if(sla.getText().equals("Silver"))	
		{
			click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.Sla.listOfOptions")));

		}
		}
		return this;
	}
	
	public AccountsPage clkActive() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkActive")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkActive")));

		return this;
	}
	
	public AccountsPage listOfActiveOptions() 
	{

		List<WebElement> typeOfActiveOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.Active.listOfOptions"));

		for(WebElement active:typeOfActiveOptions) 
		{
		if(active.getText().equals("NO"))	
		{
			click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.Active.listOfOptions")));

		}
		}
		return this;
	}
	
	public AccountsPage clkUpSellOpportunity() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkUpSellOpportunity")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkUpSellOpportunity")));

		return this;
	}
	
	public AccountsPage listOfUpSellOpportunityOptions() 
	{

		List<WebElement> typeOfUpSellOpportunityOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.UpSellOpportunity.listOfOptions"));

		for(WebElement upSell:typeOfUpSellOpportunityOptions) 
		{
		if(upSell.getText().equals("NO"))	
		{
			click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.UpSellOpportunity.listOfOptions")));

		}
		}
		return this;
	}
	
	public AccountsPage typeNumber() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkNumber")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkNumber")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.scrollIntoView.clkNumber")), "9876554321");
		return this;
	}
	
	public AccountsPage verifyEditResult() 
	{

		WebElement actual = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("AccountPage","sf.accountspage.toastMessage"));
		String text = actual.getText();
		System.out.println(text);
		String expected="Account \"Vishal\" was saved.";
		assertEquals(text, expected);
		
		return this;
	}
	
	
}
