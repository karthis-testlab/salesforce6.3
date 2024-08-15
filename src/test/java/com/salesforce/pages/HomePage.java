package com.salesforce.pages;



import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class HomePage extends ProjectSpecificMethods
{
	public HomePage clkMore() 
	{
		clickUsingJs(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage","sf.homepage.more.button")));

//	executeTheScript("arguments[0].click();", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "sf.homepage.more.button")));
		return this;
	}
	
	public CasesPage clkCases() 
	{
		executeTheScript("arguments[0].click();", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage", "sf.homepage.cases.button")));

//		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("HomePage","sf.homepage.cases.button")));
	
		return new CasesPage();
		
	}
}
