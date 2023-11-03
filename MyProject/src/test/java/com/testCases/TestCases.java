package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.config.Configuration;
import com.keyWords.KeyWord;
import com.listeners.MyListener;
import com.pages.CartPage;
import com.pages.CheckoutPage;
import com.pages.HomePage;

@Listeners(MyListener.class)
public class TestCases {
	HomePage page = new HomePage();
	KeyWord key = new KeyWord();
	Configuration con = new Configuration();
	CartPage cart = new CartPage();
	CheckoutPage check = new CheckoutPage();

	@Test
	public void searchProduct() {
		key.launchUrl(con.getUrl("qa"));
		page.searchProduct("Falcon");
		page.getFalcon9Tittle();

	}

	@Test
	public void searchInvalidProduct() {
		key.launchUrl(con.getUrl("qa"));
		page.searchProduct("fdfnhkjh");
		String expected = key.getText("css", ".woocommerce-info");
		String actual = "No products were found matching your selection.";
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void addToCardButton() {
		key.launchUrl(con.getUrl("qa"));
		page.searchProduct("Falcon 9");
		page.addToCartButton();

	}

	@Test
	public void sortingProductByLowToHighPrice() {
		key.launchUrl(con.getUrl("qa"));
		page.productLowToHigh();

	}

	@Test
	public void sortingProductByHighToLowPrice() {
		key.launchUrl(con.getUrl("qa"));
		page.productHighToLow();

	}

	@Test
	public void orderProducts() {
		key.launchUrl(con.getUrl("qa"));
		page.searchProduct("Falcon 9");
		cart.orderCartsProducts();

	}

	@Test
	public void placeOrder() {
		key.launchUrl(con.getUrl("qa"));
		cart.orderCartsProducts();
		check.billingDetails();
	}

}
