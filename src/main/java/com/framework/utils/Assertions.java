package com.framework.utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertions {
	
	public static void assertTrue(boolean value, WebElement element, String message) {
		if (value == true) {
			Assert.assertTrue(value, message + element);
		}
	}

	public static void assertTrue(boolean value, String message) {
		if (value == true) {
			Assert.assertTrue(value, message);
		}
	}

	public static void assertEquals(boolean actual, boolean expected) {
		Assert.assertEquals(actual, expected);
	}

	public static void assertFail(boolean value, Exception e, String message) {
		if (value == false) {
			Assert.fail(message + e);
		}
	}

	public static void assertFail(String message) {

		Assert.fail(message);
	}

	public static void assertSuccessMessage(boolean value, String Message) {
		if (value == true) {
			Assert.assertTrue(value, Message);
		}

	}

	public static void assertTimeOutError(String ElementName) {
		Assert.fail(ElementName + "is failed due to Timeout");
	}

}
