package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CartPage {
	@FindBy(css = "a[aria-label='Add “Falcon 9” to your cart']")
	WebElement addToCartButton;
	@FindBy(css="a[title='View cart']")
	WebElement viewCart;
	@FindBy(css=".checkout-button.button.alt.wc-forward")
	WebElement proceedToCheckOut;

	public CartPage() {
		PageFactory.initElements(BaseClass.driver, this);

	}

	public void orderCartsProducts() {
		addToCartButton.click();
		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		viewCart.click();
		proceedToCheckOut.click();
		

	}
	
}
