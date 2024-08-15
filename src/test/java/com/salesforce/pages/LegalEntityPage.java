package com.salesforce.pages;

import static org.testng.Assert.assertEquals;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;


public class LegalEntityPage extends ProjectSpecificMethods 
{
	public LegalEntityPage appLauncherLegalEntity() 
	{
		click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalenity.viewall")));
		
		
		return this;
	}	
	
	
	
	
public LegalEntityPage searchLegalEntity(String data) 
{
	///type(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.search.type.legalentity")),"legal entities");

append(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.search.type.legalentity")), data);

	
	return this;
}

public LegalEntityPage clksearchedLegalEntity() throws InterruptedException 
{
	
//	click(locateElement("xpath", ObjectRepositoriesController.getDomValue("LegalEntity", "sf.legalEntity.clklegalEntity")));
	executeTheScript("arguments[0].click();", locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.clklegalEntity")));
	return this;
}

public LegalEntityPage clkNewLegalEntity() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.clknewlegalEntity")));

	
	return this;
}

public LegalEntityPage enterLegalEntityName() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.enterlegalEntityname")));
	append(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.enterlegalEntityname")), "Vishal");
	return this;
}


public LegalEntityPage clkSave() 
{
	
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.clksave")));

	return this;
}

public LegalEntityPage actualTextLegalEntity() 
{
	
	assertEquals(getElementText(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.actualtextlegalentity"))), "Vishal");

	return this;
}

public LegalEntityPage search_legalentity() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.search.legalEntity.byname")));

	return this;
}

public LegalEntityPage editsearch_legalentity() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.clk.search.legalEntity.byname")));

	return this;
}

public LegalEntityPage editslegalEntity_clkdropdown() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.clkdropdown")));

	return this;
}

public LegalEntityPage edits_legalEntity_clkedit() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.clkedit")));

	return this;
}

public LegalEntityPage edits_companyname() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.enter.companyname.testleaf")));
    append(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.enter.companyname.testleaf")), "Testleaf");
	return this;
}


public LegalEntityPage desc() 
{
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.enter.description.salesforce")));
    append(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.enter.description.salesforce")), "Testleaf");
	return this;
}

public LegalEntityPage edit_StatusActive() 
{
	executeTheScript("arguments[0].scrollIntoView(true)", locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.select.status")));
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.select.status")));
	click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("LegalEntity", "sf.legalEntity.select.status.active")));

	return this;
}
}
