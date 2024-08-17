package com.framework.selenium.api.base;

import java.io.File;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInstance  {
	
	protected static String downloadDir= null;
	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>();
	public static String ProjectRoot = null;

	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(30)));
	}

	public WebDriverWait getWait() {
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) throws URISyntaxException {		
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			ProjectRoot = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("profile.default_content_settings.popups", 0);
			downloadDir= ProjectRoot + "\\src\\test\\resources\\download";
			File downloadFolder = new File(downloadDir);
			if(!downloadFolder.exists()) {
				downloadFolder.mkdir();
			}
		    map.put("download.default_directory", downloadDir);
			if(headless) { options.addArguments("--headless=new"); }
			options.addArguments("--start-maximized"); 
			options.addArguments("--disable-notifications"); 
			options.addArguments("--incognito");
			remoteWebdriver.set(new ChromeDriver(options));
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "edge":
			remoteWebdriver.set(new EdgeDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
	
}
