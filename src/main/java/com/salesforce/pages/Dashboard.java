package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard {

	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		driver.get("https://www.salesforce.com/products/platform/products/mysalesforce/");

		/*WebElement element =  driver.findElement(By.tagName("hgf-globalnavigation"));

		WebElement ele = (WebElement)js.executeScript("return arguments[0].shadowRoot", element);
		WebElement resources = ele.findElement(By.xpath("//li[@data-tracking-id='resources']/button"));
		resources.click();*/
		
		 WebElement ele = (WebElement) driver.executeScript("return document.querySelector('hgf-globalnavigation').shadowRoot.querySelector('li[data-tracking-id=\"resources\"] > button > span')");
	        Actions action = new Actions(driver);
	        action.moveToElement(ele).perform();
	        ele.click();


	}
}
