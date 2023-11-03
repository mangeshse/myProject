package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import com.config.Configuration;
import com.keyWords.KeyWord;

public class BaseClass {
	private static final Logger LOG = Logger.getLogger(BaseClass.class);
	public static RemoteWebDriver driver;

	public static RemoteWebDriver getDriver() {
		driver = new ChromeDriver();
		return driver;
	}

	@BeforeMethod
	public RemoteWebDriver setUp(@Optional String driverName) {
		if (driverName == null) {
			driverName = "firefox";
		}
		if (driverName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (driverName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			LOG.info("Default Browser Open" + driverName + "firefox");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
