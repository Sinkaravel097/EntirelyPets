package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dogs_Category_POJO extends Base {
	
	public Dogs_Category_POJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Dogs ']")
	private WebElement dogs;

	public WebElement getDogs() {
		return dogs;
	}
	
	// 1 . DOG FOODS
	@FindBy(xpath="//a[text()='Dog Food ']")
	private WebElement dogFood;
	
	@FindBy(xpath="//a[text()='Dry Dog Food']")
	private WebElement dryDogFood;
	
	@FindBy(xpath="//a[text()='Wet Dog Food']")
	private WebElement wetDogFood;
	
	@FindBy(xpath="//a[text()='Veterinary Diets']")
	private WebElement veterinaryDiets;

	public WebElement getDogFood() {
		return dogFood;
	}

	public WebElement getDryDogFood() {
		return dryDogFood;
	}

	public WebElement getWetDogFood() {
		return wetDogFood;
	}

	public WebElement getVeterinaryDiets() {
		return veterinaryDiets;
	}
	

}
