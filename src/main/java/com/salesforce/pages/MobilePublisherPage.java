package com.salesforce.pages;

import java.util.Set;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MobilePublisherPage extends ProjectSpecificMethods{
	
	public MobilePublisherPage clickLearnMoreLink(){
		click(locateElement(Locators.XPATH,getPropertiesData("locators", "LearnMore.XPath")));
		
		return new MobilePublisherPage();
	}
	
	public Resource clickResourcePage() {
		Set<String> windowhandles = getDriver().getWindowHandles();
		int size =windowhandles.size();
		switchToWindow(size-1);
		reportStep("Mobile Publisher page","pass");
		
		return new Resource();
	}

}
