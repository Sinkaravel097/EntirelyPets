package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPojo extends Base {
	
	public AddCartPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='vwd-add-to-cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//font[text()='GET 15% OFF SITEWIDE']")
	private WebElement scrollQuantity;
	
	@FindBy(xpath="(//img[@class='caViewCart'])[1]")
	private WebElement viewCart;
	

	public WebElement getViewCart() {
		return viewCart;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getScrollQuantity() {
		return scrollQuantity;
	}

}
