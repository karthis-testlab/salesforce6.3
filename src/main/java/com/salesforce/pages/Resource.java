package com.salesforce.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class Resource extends ProjectSpecificMethods{
	
	public Resource clickonResource() {
		 WebElement ele = (WebElement) getDriver().executeScript("return document.querySelector('hgf-globalnavigation').shadowRoot.querySelector('li[data-tracking-id=\"resources\"] > button > span')");
	        Actions action = new Actions(getDriver());
	        action.moveToElement(ele).perform();
	      WebElement salesforceCertification = (WebElement) getDriver().executeScript("return document.querySelector('hgf-globalnavigation').shadowRoot.querySelector('div[data-drawer-title=\"Resources\"] > div[class=\"menu-container section\"] > div > div.menu-section:nth-of-type(2) ').querySelector('div.sub-nav > ul > li:nth-of-type(3) > a > span')");
	      action.moveToElement(salesforceCertification);
	      salesforceCertification.click();
	      reportStep("Clicked on Salesforce Certifications", "pass");
	      Set<String> windows = getDriver().getWindowHandles();
	      int size = windows.size();
	      switchToWindow(size-1);
	        return this;
	}

}
