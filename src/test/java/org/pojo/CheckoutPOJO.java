package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPOJO extends Base {
	
	public CheckoutPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='ys_proceedContainer']")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@id='shipping-first-name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='shipping-last-name']")
	private WebElement lastName;
	
	@FindBy(id="billing-email")
	private WebElement email;
	
	@FindBy(id="shipping-address1")
	private WebElement address;
	
	@FindBy(id="shipping-address2")
	private WebElement appartment;
	
	@FindBy(id="shipping-city")
	private WebElement city;
	
	@FindBy(xpath="(//select[@class='usstates form-control req'])[1]")
	private WebElement state;
	
	@FindBy(id="shipping-zip")
	private WebElement zip;
	
	@FindBy(id="shipping-phone")
	private WebElement phone;
	
	@FindBy(id="shipping-country")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='card-number']")
	private WebElement cardNum;
	
	@FindBy(id="card-exp-month")
	private WebElement expMonth;
	
	@FindBy(id="card-exp-year")
	private WebElement expYear;
	
	@FindBy(id="card-cvv")
	private WebElement cvv;
	
	@FindBy(xpath="//h3[text()='Your Payment Information']")
	private WebElement scrollToPay;
	
	@FindBy(xpath="(//input[@value='Continue'])[2]")
	private WebElement cont;

	public WebElement getCont() {
		return cont;
	}

	public WebElement getScrollToPay() {
		return scrollToPay;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAppartment() {
		return appartment;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
