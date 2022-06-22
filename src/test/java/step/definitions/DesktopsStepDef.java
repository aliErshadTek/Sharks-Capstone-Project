package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.DesktopPage;
import utilities.Util;

public class DesktopsStepDef extends Base {
	DesktopPage deskTopPage=new DesktopPage();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    Assert.assertTrue(deskTopPage.isDisplayedPageLogo());
	    logger.info("User is on Retail website");
	    
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		deskTopPage.clickDesktopTab();
		logger.info("Clicked on Desktops tab");

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	   deskTopPage.clickShowAllDesktops();
	   logger.info("Click on Show all desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> allItems=deskTopPage.PresentAllItems();
		for(WebElement e:allItems) { 
	    Assert.assertTrue(e.isDisplayed());
	    logger.info(e.getAttribute("alt")+ "  item is present on Desktop page");
	    
		}
	    
	    
	    Util.takeScreenShot();
}
	
	@When("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    deskTopPage.AddToCardOptionHPLP3065();
	    logger.info("Clicked ADD TO CART option on ‘HP LP3065’ item");
	    
	}
	@When("User select quantity 1")
	public void user_select_quantity() {
		deskTopPage.qtyHPLP3065();
		logger.info("Selected quantity ");
	    
	}
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    deskTopPage.AddToCardOptButtonHPLP3065();
	    logger.info("Clicked add to Cart button");
	}
	@Then("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
	   Assert.assertTrue(deskTopPage.successMessageHPLP3065());
	   logger.info(deskTopPage.getMessageHPLP3065().getText());
	   Util.takeScreenShot();
	}
	
	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		deskTopPage.ClicAddCanonEOS5DOption();
		logger.info("User clicked ADD TO CART option on ‘Canon EOS 5D’ item");
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	    deskTopPage.SelectCanonEOS5DColor();
	    logger.info("User selected color from dropdown ‘Red’");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		Util.takeScreenShot();	
		}
	}
//	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
//	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
//		logger.info(deskTopPage.SuccessCanonEOS5DMessage());
//		Assert.assertEquals("Success: You have added Canon EOS 5D Camera to your shopping cart!", deskTopPage.SuccessCanonEOS5DMessage());
//		logger.info("Success message displayed for Canon purchase");
//		//logger.info(deskTopPage.SuccessCanonEOS5DMessage());
//		
//		Util.takeScreenShot();
//	}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		//logger.info(deskTopPage.SuccessCanonEOS5DMessage());
		Assert.assertTrue(deskTopPage.isSuccessMessageDisplayedCanon());
		logger.info("Success message displayed for Canon purchase");
		//logger.info(deskTopPage.SuccessCanonEOS5DMessage());
		
		Util.takeScreenShot();
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	   deskTopPage.ClickCanonEOS5DItem();
	   logger.info("User clicked on Canon EOS 5D item");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	 deskTopPage.ClickWriteAReviewLink();
	 logger.info("User clicked on write a review link");
	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	 
		List<Map<String, String>> CanonEOS5ReviewInfo= dataTable.asMaps(String.class,String.class);
		deskTopPage.EnterNameForWriteAReview(CanonEOS5ReviewInfo.get(0).get("yourname"));
		deskTopPage.EnterNameForYourReview(CanonEOS5ReviewInfo.get(0).get("yourReview"));
		deskTopPage.RateCanonEOS5D(CanonEOS5ReviewInfo.get(0).get("Rating"));
		 logger.info("user filled the review information with below information");
		 
		 Util.takeScreenShot();
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	   deskTopPage.ClickCanonEOS5DReviewContinueButton();
	   logger.info("User clicked on Continue Button");
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	    Assert.assertEquals(deskTopPage.ThankYouMessageOfCanonEOS5DReview(),"Thank you for your review. It has been submitted to the webmaster for approval.");
	    //logger.info(deskTopPage.ThankYouMessageOfCanonEOS5DReview());
	    
	    logger.info("User saw the message ‘Thank you for your review. It has been submitted to the webmaster for approval.");
	    Util.takeScreenShot();
	}
}