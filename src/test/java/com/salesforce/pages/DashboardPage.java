package com.salesforce.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class DashboardPage extends ProjectSpecificMethods {
	
List<WebElement> tabOptions = locateElements(Locators.XPATH, PropertyHandler.readObjectProperty("DashboardPage", "options.tab"));
	
	public SellerHomePage clickAccounts() {
		checkWindowHandles();
		for(int i=0; i<=(tabOptions.size())-1; i++) {
			String TabName = tabOptions.get(i).getAttribute("title").trim();
			if (TabName.equals("Accounts")) {
			clickUsingJs(tabOptions.get(i));
		break;
		}
			
		}
		return new SellerHomePage();	
	}
		
		
}


