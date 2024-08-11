package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;



public class LandingPage extends ProjectSpecificMethods 
{
	public LandingPage togglebutton() 
	{
		click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LandingPage", "sf.landingpage.toggle.button")));
		return this;
	}

	public LandingPage viewAll() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "sf.landingpage.viewall")));

		return this;
	}

	public LandingPage appLauncher() 
	{
		clearAndType(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LandingPage","sf.landingpage.applauncher.search")), "sales");
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage","sf.landingpage.applauncher.sales")));

		return this;
	}

	public OpportunityPage clkOpportunityTab() throws Exception 
	{

		executeTheScript("arguments[0].click();", locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LandingPage","sf.landingpage.homepage.opportunities")));
	
		return new OpportunityPage();

	}
	
	public LegalEntityPage legaltogglebutton() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("LandingPage", "sf.landingpage.toggle.button")));
		return new LegalEntityPage();
	}

}
