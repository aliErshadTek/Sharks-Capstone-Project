package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.main.Option;

import core.Base;


public class DesktopPage extends Base {

	public DesktopPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsiteLogo;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	@FindBy(xpath = "(//BUTTON[@type='button'])[15]")
	private WebElement AddToCardOptHPLP3065;

	public void AddToCardOptionHPLP3065() {
		AddToCardOptHPLP3065.click();
	}

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement qtyHPLP3065;

	public void qtyHPLP3065() {
		qtyHPLP3065.sendKeys("1");
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCardOptButtHPLP3065;

	public void AddToCardOptButtonHPLP3065() {
		AddToCardOptButtHPLP3065.click();
	}

	public WebElement getMessageHPLP3065() {
		return messageHPLP3065;
	}

	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement messageHPLP3065;

	public boolean successMessageHPLP3065() {
		if (messageHPLP3065.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public boolean isDisplayedPageLogo() {
		if (retailWebsiteLogo.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void clickDesktopTab() {
		desktopTab.click();
	}

	public void clickShowAllDesktops() {
		showAllDesktops.click();
	}

	public List<WebElement> PresentAllItems() {
		List<WebElement> alldestop = items;
		return alldestop;

	}

	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement AddCanonEOS5DOption;

	public void ClicAddCanonEOS5DOption() {
		AddCanonEOS5DOption.click();
	}

	@FindBy(xpath = "(//Select[@id='input-option226'])")
	private WebElement CanonEOS5DColor;

	public void SelectCanonEOS5DColor() {

		Select dropdown = new Select(CanonEOS5DColor);
		dropdown.selectByValue("15");

	}

	@FindBy(xpath = "(//input[@id='input-quantity'])")
	private WebElement CanonEOS5DQty;

	public void EnterCanonEOS5DQty() {
		CanonEOS5DQty.sendKeys("1");
	}

	@FindBy(xpath = "(//button[@id='button-cart'])")
	private WebElement AddCanonEOS5DButton;

	public void ClickAddCanonEOS5DButton() {
		AddCanonEOS5DButton.click();

	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement CanonEOS5DMessage;

	public String SuccessCanonEOS5DMessage() {
	
		String actualCanonEOS5DMessage= CanonEOS5DMessage.getText();
		return actualCanonEOS5DMessage;
	
	
	}
	public boolean isSuccessMessageDisplayedCanon() {
		//js.executeScript("arguments[0].scrollIntoView();", scrollToSuccessMessageThroughCanonLink);

		if (CanonEOS5DMessage.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonEOS5DItem;

	public void ClickCanonEOS5DItem() {
		CanonEOS5DItem.click();
	}

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement WriteAReviewLink;

	public void ClickWriteAReviewLink() {
		WriteAReviewLink.click();
	}

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement NameWriteAReview;

	public void EnterNameForWriteAReview(String Name) {

		NameWriteAReview.sendKeys(Name);
	}

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement Review;

	public void EnterNameForYourReview(String EnterReview) {

		Review.sendKeys(EnterReview);
	}

	@FindBy(xpath = "//input[@value='4']")
	private WebElement GoodRatingCanonEOS5D;
	@FindBy(xpath = "//input[@value='2']")
	private WebElement BadRatingCanonEOS5D;

	public void RateCanonEOS5D(String option) {
		if(option.equals("Good")) { 
			GoodRatingCanonEOS5D.click();
		}
		else 
			BadRatingCanonEOS5D.click();
	
	}

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement ReviewContinueButton;
	public void ClickCanonEOS5DReviewContinueButton() {

		ReviewContinueButton.click();

	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement ThankYouMessageOfCanonEOS5D;

	public String ThankYouMessageOfCanonEOS5DReview() {

		String ActualThankYouMessage=ThankYouMessageOfCanonEOS5D.getText();
		return ActualThankYouMessage;
	}
	
}
