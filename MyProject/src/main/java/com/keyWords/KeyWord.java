package com.keyWords;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class KeyWord {

	public void launchUrl(String url) {
		BaseClass.driver.get(url);
	}

	public void enterText(WebElement e, String textToEnter) {
		e.sendKeys(textToEnter);
	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return BaseClass.driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return BaseClass.driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return BaseClass.driver.findElement(By.cssSelector(locatorValue));
		} else
			return null;
	}

	public List<WebElement> getWebElements(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return BaseClass.driver.findElements(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return BaseClass.driver.findElements(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return BaseClass.driver.findElements(By.cssSelector(locatorValue));
		} else
			return null;
	}

	public void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();

	}

	public String getText(String locatorType, String locatorValue) {
		return getWebElement(locatorType, locatorValue).getText();
	}

	public List<String> getTexts(String locatorType, String locatorValue) {
		List<WebElement> data = getWebElements(locatorType, locatorValue);

		List<String> stringData = new ArrayList<String>();
		for (WebElement element : data) {
			stringData.add(element.getText());
		}
		return stringData;

	}
	

}
