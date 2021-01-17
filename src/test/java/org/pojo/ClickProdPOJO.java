package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickProdPOJO extends Base{
	
	public ClickProdPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='ng-binding'])[1]")
	private WebElement dogFood;
	
	@FindBy(xpath="//a[text()='Bergan Turbo Scratcher Cat Toy (Assorted)']")
	private WebElement catFood;
	
	@FindBy(xpath="//a[text()='Aqueon Betta Food (0.95 oz)']")
	private WebElement fishFood;

	public WebElement getDogFood() {
		return dogFood;
	}

	public WebElement getCatFood() {
		return catFood;
	}

	public WebElement getFishFood() {
		return fishFood;
	}

}
