package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DryDogFoodPOJO extends Base {
	
	public DryDogFoodPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Purina Pro Plan Focus']")
	private WebElement purinaPro;
	
	@FindBy(xpath="//span[contains(text(),'Dry Food (6 lb)')]")
	private WebElement prod;
	
	@FindBy(xpath="//li[contains(text(),'U.S.A facilities')]")
	private WebElement prodScroll;
	

	public WebElement getProdScroll() {
		return prodScroll;
	}

	public WebElement getPurinaPro() {
		return purinaPro;
	}

	public WebElement getProd() {
		return prod;
	}
	

}
