package com.pages;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.base.BaseClass;

import io.qameta.allure.internal.shadowed.jackson.databind.deser.Deserializers.Base;

public class HomePage {

	private static final Logger LOG = Logger.getLogger(HomePage.class);

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(css = "#woocommerce-product-search-field-0")
	WebElement searchProduct;
	@FindBy(css = "li.product:nth-child(1) > a:nth-child(2)")
	WebElement addToCart;
	@FindBy(css = ".woocommerce-info")
	WebElement invalidSearchmsg;
	@FindBy(css = "h2.woocommerce-loop-product__title")
	WebElement listOfFalcon;
	@FindBy(css = "h2.woocommerce-loop-product__title")
	WebElement addToCartButton;
	@FindBy(css = "a[title='View cart']")
	WebElement viewCart;
	@FindBy(css = "ul[class='nav-menu'] li[class='current_page_item'] a")
	WebElement home;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > div:nth-child(2) > form:nth-child(2) > select:nth-child(1)")
	WebElement defaultSortingDropdown;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > div:nth-child(2) > form:nth-child(2) > select:nth-child(1) > option:nth-child(5)")
	WebElement lowToHighPrice;
	@FindBy(css = "span.price")
	WebElement productPriceList;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > div:nth-child(2) > form:nth-child(2) > select:nth-child(1) > option:nth-child(6)")
	WebElement highToLowPrice;

	public void searchProduct(String Productname) {
		searchProduct.click();
		searchProduct.sendKeys(Productname);
		searchProduct.sendKeys(Keys.ENTER);
		
		LOG.info("Hit ENTER key");
	}

	public String getFalcon9Tittle() {
		String title = listOfFalcon.getText();
		System.out.println(title);
		return title;
	}

	public void addToCartButton() {
		addToCartButton.click();
		viewCart.click();
		LOG.info(BaseClass.driver.getTitle());

	}

	public void productLowToHigh() {
		home.click();
		defaultSortingDropdown.click();
		lowToHighPrice.click();
		List<WebElement> list = BaseClass.driver.findElements(By.cssSelector("span.price"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			// LOG.info(webElement.getText());

		}

		// String list = productPriceList.getText();
//		LOG.info(list);
		// return list;

	}

	public void productHighToLow() {
		home.click();
		defaultSortingDropdown.click();
		highToLowPrice.click();
		List<WebElement> list = BaseClass.driver.findElements(By.cssSelector("span.price"));

		for (WebElement webElement : list) {
			System.out.println(webElement.getText());

		}

	}

}
