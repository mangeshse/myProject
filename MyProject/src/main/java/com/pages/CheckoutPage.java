package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.waits.Wait;

public class CheckoutPage {
	Wait wait = new Wait();

	public CheckoutPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(css = "#billing_first_name")
	WebElement firstname;
	@FindBy(css = "#billing_last_name")
	WebElement lastName;
	@FindBy(css = "#billing_company")
	WebElement companyName;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > article:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(4) > span:nth-child(2) > span:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(2)")
	WebElement country;
	@FindBy(css = "#billing_address_1")
	WebElement streetAdress;
	@FindBy(css = "#billing_city")
	WebElement townCity;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > article:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(8) > span:nth-child(2) > span:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(2) > b:nth-child(1)")
	WebElement stateCity;
	@FindBy(css = "#select2-billing_country-container")
	WebElement india;
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > article:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(8) > span:nth-child(2) > span:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(2)")
	WebElement state;
	@FindBy(css = "#select2-billing_state-container")
	WebElement selectedStateMaharastra;
	@FindBy(css = "#billing_postcode")
	WebElement pinCode;
	@FindBy(css = "#billing_phone")
	WebElement phone;
	@FindBy(css = "#billing_email")
	WebElement emailAddress;
	@FindBy(css = "#place_order")
	WebElement placeOrder;
	@FindBy(css = "label[for='payment_method_cheque']")
	WebElement checkPayments;

	public void billingDetails() {
		firstname.sendKeys("Mamta");
		lastName.sendKeys("Patil");
		companyName.sendKeys("QualityKiosk");
		country.click();
		india.click();
		streetAdress.sendKeys("street");
		townCity.sendKeys("pune");
		state.click();
		selectedStateMaharastra.click();
		pinCode.sendKeys("411061");
		phone.sendKeys("9511812783");
		emailAddress.sendKeys("mamta0106@gmail.com");
		checkPayments.click();
		wait.visibilityOfElement(placeOrder);
		placeOrder.click();

	}

	public void billingInvalidDatails() {

	}

}
