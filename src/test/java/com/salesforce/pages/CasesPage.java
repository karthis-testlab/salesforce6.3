package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class CasesPage extends ProjectSpecificMethods
{
	public CasesPage clkNew() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage", "sf.casespage.new.button")));
		
		return  this;
	}
	
	public CasesPage clkStatus() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.status.dropdown")));
	
		return this;
		
	}
	
	public CasesPage clkEscalated() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.status.dropdown.escalated")));
	
		return this;
		
	}
	
	public CasesPage clkCaseOrigin() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.dropdown")));
	
		return this;
		
	}
	
	public CasesPage clkEmail() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.dropdown.email")));
	
		return this;
		
	}
	
	public CasesPage clickAndSelectContactNames() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.contactname")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.contactname.firstListOption")));

		return this;
		
	}
	
	public CasesPage typeSubject() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);",locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("CasesPage","sf.casespage.subject")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.subject")));
		type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.subject")), "Testing");

		return this;
		
	}
	
	public CasesPage typeDescription() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.description")));
	type(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.description")), "Dummy");
		return this;
		
	}
	
	public CasesPage clkSave() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.save")));
	
		return this;
		
	}
	
	public CasesPage clkDelete() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.clkdropdown")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.clkdelete")));
	
		return this;
		
	}
	
	public CasesPage verifyNewCaseCreatedMessage() 
	{
		
		
		return this;
	}
	
	public CasesPage clkEdit() 
	{
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.clkdropdown")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.clkedit")));

		
		return this;
	}
	
	public CasesPage statusWorking() 
	{
		
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.status.dropdown.escalated")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.status.dropdown.working")));

		return this;
	}
	
	public CasesPage setPriority() 
	{
		
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.priority")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.priority.low")));

		return this;
	}
	
	public CasesPage caseOriginPhone() 
	{
		
		executeTheScript("arguments[0].scrollIntoView(true);",locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.dropdown.email")));

		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.dropdown.email")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.dropdown.phone")));

		return this;
	}
	
	public CasesPage slaViolation() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);",locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.slaviolation")) );
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.slaviolation")));
		click(locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("CasesPage","sf.casespage.caseorigin.slaviolation.no")));

		return this;
	}
	
	
	
	
	
}
