package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPOJO extends Base{
	
	public signInPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@placeholder='You search it, we fetch it!'])[2]")
	private WebElement searchBox;
	
	@FindBy(xpath="(//i[@id='search-btn'])[2]")
	private WebElement searchBtn;
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}


	@FindBy(xpath="(//button[@id='myAccountBtn'])[2]")
	private WebElement myAccount;
	
	@FindBy(xpath="//webpushrpromptbtndeny2[text()='NOT YET']")
	private WebElement notYet;
	
	@FindBy(xpath="(//a[@class='btn'])[2]")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@value='Sign In']")
	private WebElement clickSignIn;
	
	@FindBy(xpath="//div[text()='OR']")
	private WebElement scroll;
	
	@FindBy(id="pdLogin-email")
	private WebElement email;
	
	@FindBy(id="pdLogin-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login;
	
	@FindBy(xpath="(//a[text()='Sign Out'])[2]")
	private WebElement logout;

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getClickSignIn() {
		return clickSignIn;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getNotYet() {
		return notYet;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	

}
