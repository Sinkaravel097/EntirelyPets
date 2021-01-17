package org.executable;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.interactions.Actions;
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

	@Test
	private void tc1() throws InterruptedException {
		
		launchUrl("https://www.entirelypets.com/");
		maxWindow();
		signInPOJO h = new signInPOJO();
		moveToEle(h.getMyAccount());
		clickAny(h.getMyAccount());
		clickAny(h.getSignIn());
		clickAny(h.getClickSignIn());
		scrollUpAndDown(h.getScroll());
		sendText(h.getEmail(), "vishal30071997@gmail.com");
		sendText(h.getPassword(), "Vishal labrador");
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
	
	@Test
	private void tc3() {
		
		implicitWait();
		CheckoutPOJO c = new CheckoutPOJO();
		clickAny(c.getCheckout());
		sendText(c.getFirstName(), "Vishal");
		sendText(c.getLastName(), "S");
		sendText(c.getAddress(), "Grandview");
		sendText(c.getAppartment(), "Sigaran's Home");
		sendText(c.getCity(), "Columbus");
		selectVisibleText(c.getState(), "Ohio");
		sendText(c.getZip(), "43212");
		sendText(c.getPhone(), "+1 92738922918");
		selectVisibleText(c.getCountry(), "United States");
		scrollUpAndDown(c.getScrollToPay());
		sendText(c.getCardNum(), "0000000000000000");
		selectVisibleText(c.getExpMonth(), "Jul (7)");
		selectVisibleText(c.getExpYear(), "2024");
		sendText(c.getCvv(), "000");
		scrollUpAndDown(c.getCont());
		clickAny(c.getCont());
	}

}
