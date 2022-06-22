package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailLoginPage;
import utilities.Util;

public class RetailLoginStepDef extends Base {

	RetailLoginPage retailLoginPage = new RetailLoginPage();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		retailLoginPage.ClickOnmyAccount();
		logger.info("User clicked  on MyAccount");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailLoginPage.clickOnLogin();
		logger.info("User clicked on Login");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retailLoginPage.inputEmailId(string);
		logger.info("User entered username " + string);
		retailLoginPage.inputPassword(string2);
		logger.info("User entered password " + string2);
		Util.takeScreenShot();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailLoginPage.clickLoginButton();
		logger.info("User clicked on Login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertEquals(retailLoginPage.myAccountDashBoardPresent(), "My Account");
		logger.info("User logged into MyAccount dashboard");
		Util.takeScreenShot();
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {

		retailLoginPage.clikAffiliateAccountLink();
		logger.info("User clicked on ‘Register for an Affiliate Account’ link");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {

		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		List<Map<String, String>> affiliateform = dataTable.asMaps(String.class, String.class);
		retailLoginPage.inputCompanyName(affiliateform.get(0).get("company"));
		retailLoginPage.inputeWebSiteName(affiliateform.get(0).get("website"));
		retailLoginPage.inputTaxID(affiliateform.get(0).get("taxID"));
		retailLoginPage.SelectPaymentMethod(affiliateform.get(0).get("paymentMethod"));
		retailLoginPage.inputChequePayeeName(affiliateform.get(0).get("ChequePayeeName"));
		logger.info("User did fill out affiliate form with below information ");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailLoginPage.ClickCheckonAboutuscheckbox();
		logger.info("User checked on About us check box");
		Util.takeScreenShot();

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailLoginPage.ClickContinueButton();
		logger.info("User clicked on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retailLoginPage.SuccessMessageAffiliateAccount());
		logger.info("User did see a success message");
		Util.takeScreenShot();
	}
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailLoginPage.clickEditAffiliateInformatio();
		logger.info("User clicked on ‘Edit your affiliate informationlink");
	}

//	@When("user click on Bank Transfer radio button")
//	public void user_click_on_bank_transfer_radio_button() {
//		
//	   
//	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> editAffiliateInformation = dataTable.asMaps(String.class, String.class);
		retailLoginPage.SelectPaymentMethod(editAffiliateInformation.get(0).get("paymentMethod"));
		retailLoginPage.inputBankName(editAffiliateInformation.get(0).get("bankName"));
		retailLoginPage.inputAbaNumber(editAffiliateInformation.get(0).get("abaNumber"));
		retailLoginPage.inputSWIFTCode(editAffiliateInformation.get(0).get("swiftCode"));
		retailLoginPage.inputAccountName(editAffiliateInformation.get(0).get("accountName"));
		retailLoginPage.inputAccountNumber(editAffiliateInformation.get(0).get("accountNumber"));
		logger.info("User did fill Bank information with below information");
		Util.takeScreenShot();
	}

	@When("User click on Continue button after adding bank info")
	public void user_click_on_continue_button_after_adding_bank_info() {
		retailLoginPage.clickEditContinueButton();
		logger.info("User clicked on Continue button after adding bank info");
	}

	@Then("User should see a success message after click on Continue button")
	public void user_should_see_a_success_message_after_click_on_continue_button() {
		Assert.assertTrue(retailLoginPage.successMessageEdit());
		logger.info("User saw a success message after click on Continue button");
		Util.takeScreenShot();
	}

	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailLoginPage.clickEditYourAccount();
		logger.info("User clicked on 'Edit your account information' link");

	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> modifyInfo = dataTable.asMaps(String.class, String.class);
		// |firstname|lastName|email|telephone|
		retailLoginPage.inputFirstname(modifyInfo.get(0).get("firstname"));
		retailLoginPage.inputLastname(modifyInfo.get(0).get("lastName"));
		retailLoginPage.inputEmail(modifyInfo.get(0).get("email"));
		retailLoginPage.inputTelephone(modifyInfo.get(0).get("telephone"));
		logger.info("User modify below information" + " " + modifyInfo.get(0).get("firstname") + ",  "
				+ modifyInfo.get(0).get("lastName") + ",  " + modifyInfo.get(0).get("email") + ",  "
				+ modifyInfo.get(0).get("telephone"));
		Util.takeScreenShot();
	}

	@When("User click on continue button")
	public void User_click_on_continue_button() {
		retailLoginPage.clickContinueButtonFromEditYourAccount();
		logger.info("User clicked on continue button");
	}

	@Then("User should see this message {string}")
	public void user_should_see_this_message(String string) {
		Assert.assertEquals(string, retailLoginPage.successMessageFromEditYourAccount());
		logger.info("User did see this message " + string);

		Util.takeScreenShot();
	}

}
