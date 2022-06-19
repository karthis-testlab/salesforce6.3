package com.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class LandingPage extends ProjectSpecificMethods {
	
	public LandingPage verifypagetitle(String data) {
		
		pause(5000);
		verifyTitle(data);
		return this;
		
	}
	
	

}
