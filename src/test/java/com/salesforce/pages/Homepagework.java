package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.PropertyHandler;

public class Homepagework extends ProjectSpecificMethods {

	public Homepagework togglebutton() {
		click(locateElement(Locators.XPATH,
				PropertyHandler.readObjectProperty("Homepagework", "sf.landingpage.toggle.button")));

		return this;
	}

	public Homepagework viewAll() {
		click(locateElement(Locators.XPATH,
				PropertyHandler.readObjectProperty("Homepagework", "sf.landingpage.viewall")));

		return this;
	}

	public Homepagework appLauncher() {

		click(locateElement(Locators.XPATH,
				PropertyHandler.readObjectProperty("Homepagework", "sf.landingpage.applauncher.search")));

		return this;
	}

	public Contentpagework clkworktype() throws Exception {

		executeTheScript("arguments[0].click();", locateElement(Locators.XPATH,
				PropertyHandler.readObjectProperty("Homepagework", "sf.landingpage.homepage.opportunities")));
		Thread.sleep(3000);
		return new Contentpagework();

	}

	public Contentpagework legaltogglebutton() { 
		click(locateElement(Locators.XPATH,PropertyHandler.readObjectProperty("Homepagework","sf.landingpage.toggle.button"))); 
		return new Contentpagework();
		}
}
