package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import static com.framework.utils.PropertyHandler.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TC002_CreateOpportunity extends ProjectSpecificMethods {
	
	private String opportunity_name = "TestLeaf - Selenium Bootcamp";
	
	@BeforeTest
	public void beforeTest() {	
		testcaseName = "VerifyCreateOpportunity";
		testDescription = "Verify Create Opportunity with positive data";
		authors = "Karthikeyan";
		category = "Smoke";
	}
	
	@Test
	public void valiadeUserShouldAbleToCreateOpportunity() {
		type(locateElement(readObjectProperty("LoginPage", "saleforce.username.textbox.id")), readConfigProperty("username"));
		type(locateElement(readObjectProperty("LoginPage", "salesforce.password.textbox.id")), readConfigProperty("password"));
		click(locateElement(readObjectProperty("LoginPage", "salesforce.login.button.id")));
		click(Locators.XPATH, readObjectProperty("LandingPage", "saleforce.applauncher.menu.xpath"));
		click(Locators.XPATH, readObjectProperty("LandingPage", "salesforce.applauncher.viewall.button.xpath"));
		type(locateElement(Locators.XPATH, readObjectProperty("LandingPage", "saleforce.applauncher.search.text.xpath")), "Sales");
		click(Locators.XPATH, readObjectProperty("LandingPage", "salesforce.applauncher.sales.linktext.xpath"));
		click(Locators.XPATH, "//one-app-nav-bar-item-root[@data-id='Opportunity']");
		click(Locators.XPATH, "//div[@title='New']");
		type(locateElement(Locators.XPATH, "//label[text()='Opportunity Name']/following-sibling::div/input"), opportunity_name);
		type(locateElement(Locators.XPATH, "//label[text()='Close Date']/following-sibling::div/input"), tomorrowDate());
		executeTheScript(readConfigProperty("js.scroll.to.view"), locateElement(Locators.XPATH, "//label[text()='Stage']"));
		click(Locators.XPATH, "//label[text()='Stage']/following-sibling::div/lightning-base-combobox");
		click(Locators.XPATH, "//lightning-base-combobox-item[@data-value='Prospecting']");
		click(Locators.XPATH, "//lightning-button//button[@name='SaveEdit']");
		Assert.assertEquals(getElementText(locateElement(Locators.CSS, "span[class^='toastMessage']")), "Opportunity \""+opportunity_name+"\" was created.");
	}
	
	public static String tomorrowDate() {		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		return LocalDate.now().plusDays(1).format(formatter);
	}

}