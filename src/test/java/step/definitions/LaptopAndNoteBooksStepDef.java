package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopAndNoteBooksPage;
import utilities.Util;

public class LaptopAndNoteBooksStepDef extends Base {

	LaptopAndNoteBooksPage laptopAndNoteBooksPage = new LaptopAndNoteBooksPage();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopAndNoteBooksPage.clickLaptopAndNoteBooksTab();
		logger.info("User clicked on Laptop &NoteBook tab");

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopAndNoteBooksPage.clickShowAllLaptopsAndNotebooks();
		logger.info("User clicked on Show all Laptop &NoteBook option");

	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopAndNoteBooksPage.clickMacBookItem();
		logger.info("User clicked on MacBook  item");

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertEquals(laptopAndNoteBooksPage.successMessageMacBookAdd(), "shopping cart");
		logger.info("User Saw a message 'Success: You have added MacBook to your shopping cart!'");
		Util.takeScreenShot();
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {

		Assert.assertEquals(laptopAndNoteBooksPage.MacBookPrice1QtyShowedToTheCartOption(), "1 item(s) - $602.00");
		// Assert.assertTrue(true);
		// Assert.assertTrue(laptopAndNoteBooksPage.MacBookPrice1QtyShowedToTheCartOption());
		logger.info(
				"User saw " + laptopAndNoteBooksPage.MacBookPrice1QtyShowedToTheCartOption() + " showed to the cart ");
		Util.takeScreenShot();
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {

		laptopAndNoteBooksPage.clickMacBookPrice1QtyCartOption();
		logger.info("User clicked on cart option");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopAndNoteBooksPage.clickMacBookXButtonfromCart();
		logger.info("user clicke on red X button to remove the item from cart");
		Util.screenShotName();
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		Assert.assertEquals("0 item(s) - $0.00", laptopAndNoteBooksPage.MacBookPrice0QtyShowedToTheCartOption());
		logger.info("Item  removed and cart  shows '0 item(s)'");
		Util.takeScreenShot();
	}
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    laptopAndNoteBooksPage.ClickMackBookCampareButton();
	    logger.info("User clicked on product comparison icon on 'MacBook'");
	 
	}
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	   laptopAndNoteBooksPage.ClickMackBookAirCampareButton();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		// Assert.assertTrue(true);
		Assert.assertTrue(laptopAndNoteBooksPage.SuccessMessageMackBookAirCamparison());
	    logger.info("User saw the message 'Success: You have added MacBook Air to your product comparison!'");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	   laptopAndNoteBooksPage.ClickMackBookAirProductCamparisonLink();
	    logger.info("User clicked on Product comparison link");
	    Util.takeScreenShot();
	 
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    Assert.assertTrue(laptopAndNoteBooksPage.MackBookAndMackBookAirProductCamparisonChart());
	    logger.info("User saw the Product Comparison Chart");
		Util.takeScreenShot();
	
	}
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    laptopAndNoteBooksPage.ClickaddSonyVaioLaptopToWishList();
	    logger.info("User clicked on heart icon to add 'Sony VaIO' laptop to wish list");
	    Util.takeScreenShot();
	    
	}
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	    Assert.assertTrue(laptopAndNoteBooksPage.MessageMustLoginToaddSonyVaioLaptopToWishList());
	    logger.info("User  got the message 'You must login or create an account to save Sony VAIO to your wish list!'");
	    Util.takeScreenShot();
	}
	
	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
	    laptopAndNoteBooksPage.ClickMackBookProItem();
	    logger.info("User clicked on MacBook Pro item");
	}
	@Then("User should see  ‘${double}’  price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		Assert.assertEquals("$2,000.00", laptopAndNoteBooksPage.SeePriceOfMackBookPro());
		logger.info("User saw that  '$2,000.00' price tag is present on UI");
		Util.takeScreenShot();

	}
	

}
