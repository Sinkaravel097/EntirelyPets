package org.datadriven;

import java.io.IOException;

import org.base.Base;
import org.pojo.AddCartPojo;
import org.pojo.CheckoutPOJO;
import org.pojo.Dogs_Category_POJO;
import org.pojo.DryDogFoodPOJO;
import org.pojo.signInPOJO;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EntirelyPets extends Base {


	@BeforeClass
	private void launchBrowser() {
		chrome();
	}

	// LOGIN FUNCTIONS
	@Test
	private void tc1() throws InterruptedException, IOException {
		
		launchUrl("https://www.entirelypets.com/");
		maxWindow();
		signInPOJO h = new signInPOJO();
		moveToEle(h.getMyAccount());
		clickAny(h.getMyAccount());
		clickAny(h.getSignIn());
		clickAny(h.getClickSignIn());
		scrollUpAndDown(h.getScroll());
		sendText(h.getEmail(), readExcel(2, 0));
		sendText(h.getPassword(), readExcel(2, 1));
		clickAny(h.getLogin());
		
	}
	
	// DOGS   --->   DOG FOODS   --->   DRY DOG FOOD
	@Test
	private void tc2() throws IOException {
		
		implicitWait();
		Dogs_Category_POJO dogs = new Dogs_Category_POJO();
		moveToEle(dogs.getDogs());
		clickAny(dogs.getDryDogFood());
		
		DryDogFoodPOJO dry = new DryDogFoodPOJO();
		javaClick(dry.getPurinaPro());
		scrollUpAndDown(dry.getProdScroll());
		clickAny(dry.getProd());
		
		AddCartPojo add = new AddCartPojo();
		scrollUpAndDown(add.getScrollQuantity());
		javaClick(add.getAddToCart());
		clickAny(add.getViewCart());
		screenShot("prod.png");
	}
	
	// CHECKOUT FUNCIONS
	@Test
	private void tc3() throws IOException {
		
		implicitWait();
		CheckoutPOJO c = new CheckoutPOJO();
		clickAny(c.getCheckout());
		sendText(c.getFirstName(), readExcel(2, 2));
		sendText(c.getLastName(), readExcel(2, 3));
		sendText(c.getAddress(), readExcel(2, 4));
		sendText(c.getAppartment(), readExcel(2, 5));
		sendText(c.getCity(), readExcel(2, 6));
		selectVisibleText(c.getState(), readExcel(2, 7));
		sendText(c.getZip(), readExcel(2, 8));
		sendText(c.getPhone(), readExcel(2, 9));
		selectVisibleText(c.getCountry(), readExcel(2, 10));
		scrollUpAndDown(c.getScrollToPay());
		sendText(c.getCardNum(), readExcel(2, 11));
		selectVisibleText(c.getExpMonth(), readExcel(2, 12));
		selectVisibleText(c.getExpYear(), readExcel(2, 13));
		sendText(c.getCvv(), readExcel(2, 14));
		scrollUpAndDown(c.getCont());
		clickAny(c.getCont());
	}



}
