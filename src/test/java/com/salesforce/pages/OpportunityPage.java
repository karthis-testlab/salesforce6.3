package com.salesforce.pages;

import static org.testng.Assert.assertEquals;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;


public class OpportunityPage extends ProjectSpecificMethods
{
	public OpportunityPage clkNewButton() throws InterruptedException
	{

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.newbutton")));
	return this;
}

public OpportunityPage enterOpportunityName(String oppurtunityName) throws Exception 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.opportunityname")));

	type(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.opportunityname")),oppurtunityName);
	return this;
}

public OpportunityPage closeDate() 
{
	click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.clkclosedate")));
	click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.listofclosedate")));


	return this;
}

public OpportunityPage stage() 
{
	executeTheScript("arguments[0].scrollIntoView(true)", locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.clkstage")));
	click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.clkstage")));
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.clkneedanalysis")));

	
	return this;
}

public OpportunityPage clkSave() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.save")));
	return this;
}

public OpportunityPage clkSsearch() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.search")));

	return this;
}

public OpportunityPage searchName()
{
	
click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.searchname")));
	
	return this;
}

public OpportunityPage clkdropDown() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.clkdropdown")));

	
	return this;
}

public OpportunityPage clkEdit() 
{

	click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.clkedit")));

	
	return this;
}

public OpportunityPage clkPerceptionAnalysis() 
{
	executeTheScript("arguments[0].scrollIntoView(true)", locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.clkstage")));

	click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.clkstage")));
	click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.clkperceptionanalysis")));



	return this;
}

public OpportunityPage clkDelete()  
{
	

	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.clkdelete")));
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage","sf.opportunitypage.delete")));

	return this;
}

public OpportunityPage verifyCreateOpportunity() throws InterruptedException  
{
	System.out.println("Welcome to Assert");
	
	assertEquals(getElementText(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("OpportunitiesPage", "sf.opportunitypage.toastmessage"))), "Salesforce Automation By Vishal");
	
	return this;
}

}
