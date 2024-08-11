package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import static com.framework.utils.PropertyHandler.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TC002_CreateOpportunity extends ProjectSpecificMethods {
	
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
		type(locateElement(Locators.XPATH, "//label[text()='Opportunity Name']/following-sibling::div/input"), "TestLeaf - Selenium Bootcamp");
	}
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		System.out.println(LocalDate.now().plusDays(1).format(formatter));
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
	}

}