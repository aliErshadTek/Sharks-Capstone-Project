package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePagePageOb;
import utilities.Util;

public class HomePageStepDef extends Base {

	HomePagePageOb homePagePageOb = new HomePagePageOb();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePagePageOb.ClickCurrencyButton();
		logger.info("User clicked on Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePagePageOb.selectEuro();
		logger.info("User did Chose Euro from dropdown");
		Util.takeScreenShot();
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertEquals(homePagePageOb.changedToEuro(), "€");
		logger.info("currency value  changed to Euro " + homePagePageOb.changedToEuro());

		Util.takeScreenShot();
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	   homePagePageOb.clickShoppingCart();
	   logger.info("User clicked on shopping cart");
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	  
		Assert.assertEquals("Your shopping cart is empty!", homePagePageOb.cartEmptyMessage());
		logger.info("“Your shopping cart is empty!” message should be displayed");
		Util.takeScreenShot();
		
	}

}
