package org.executable;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.pojo.ClickProdPOJO;
import org.pojo.signInPOJO;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept extends Base{

	
	private static final boolean String = false;

	@DataProvider(name="products")
	private Object[][] datas() {
		return new Object[][] {
			{"Dog Wet Food"},
			{"Cat Balls"},
			{"Fish Food"}
		};
	}
	
//	@DataProvider(name="prods")
//	private Object[][] datas1() {
//		return new Object[][] {
//			{},
//			{},
//			{}
//		};
//
//	}
	
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
//	@Test
//	private void tc1() throws InterruptedException {
//		
//		
//		signInPOJO h = new signInPOJO();
//		moveToEle(h.getMyAccount());
//		clickAny(h.getMyAccount());
//		clickAny(h.getSignIn());
//		clickAny(h.getClickSignIn());
//		scrollUpAndDown(h.getScroll());
//		sendText(h.getEmail(), "vishal30071997@gmail.com");
//		sendText(h.getPassword(), "Vishal labrador");
//		clickAny(h.getLogin());
//		
//	}
	
	@Test(dataProvider="products")
	private void tc2(String searchText) throws InterruptedException {
		launchUrl("https://www.entirelypets.com/");
		maxWindow();
		implicitWait();
		signInPOJO s = new signInPOJO();
		sendText(s.getSearchBox(), searchText);
		clickAny(s.getSearchBtn());
		
		ClickProdPOJO c = new ClickProdPOJO();
		String dog = textGet(c.getDogFood());
		if (dog=="Esbilac Goat's Milk Powder (12 oz)") {
			clickAny(c.getDogFood());
		} 
		Thread.sleep(5000);
	}
}
