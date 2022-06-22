package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

	
public class LaptopAndNoteBooksPage extends Base {
	
	
	public LaptopAndNoteBooksPage() {
		PageFactory.initElements(driver, this);
		
			}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[3]")
	private WebElement LaptopAndNoteBooksTab;
	
	public void clickLaptopAndNoteBooksTab() {
		Actions action=new Actions(driver);
		action.moveToElement(LaptopAndNoteBooksTab).perform();
		
	}
	
	@FindBy(xpath="(//a[text()='Show All Laptops & Notebooks'])")
	private WebElement ShowAllLaptopsAndNotebooks;
	
	public void clickShowAllLaptopsAndNotebooks() {
		ShowAllLaptopsAndNotebooks.click();
	}
	
	@FindBy(xpath="(//a[text()='MacBook'])")
	private WebElement MacBookItem;
	
	public void clickMacBookItem() {
		MacBookItem.click();
	}
	
	@FindBy(xpath="(//button[@id='button-cart'])")
	private WebElement MacBookAddToCartButton;
	
	public void clickMacBookAddToCartButton() {
		MacBookAddToCartButton.click();
		
	}
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/text()[1]")
	private WebElement MessageP1MacBookAdd;
	
	public String successMessageMacBookAdd() {
//		String a=MessageP1MacBookAdd.getText();
//		String b=MessageP2MacBookAdd.getText();
//		String c=MessageP3MacBookAdd.getText();
//		String d=MessageP4MacBookAdd.getText();
		String msg=MessageP5MacBookAdd.getText();
		
		return msg;
	}
	
//	public String successMessageMacBookAdd() {
//		String a=MessageP1MacBookAdd.getText();
//		String b=MessageP2MacBookAdd.getText();
//		String c=MessageP3MacBookAdd.getText();
//		String d=MessageP4MacBookAdd.getText();
//		String e=MessageP5MacBookAdd.getText();
//		String msg=a+b+c+d+e;
//		return msg;
//	}
	
	@FindBy(xpath="(//a[text()='MacBook'])[3]")
	private WebElement MessageP2MacBookAdd;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/text()[2]")
	private WebElement MessageP3MacBookAdd;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/a[2]")
	private WebElement MessageP4MacBookAdd;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]/a[2]")
	private WebElement MessageP5MacBookAdd;
	
	@FindBy(xpath="//span[text()=' 1 item(s) - $602.00']")
	private WebElement MacBookPrice1QtyShowedToTheCart;
	
	public String MacBookPrice1QtyShowedToTheCartOption() {
		String actualText=MacBookPrice1QtyShowedToTheCart.getText();
		 
			return actualText;
		
	}
//	public boolean MacBookPrice1QtyShowedToTheCartOption() {
//		if(MacBookPrice1QtyShowedToTheCart.equals(" 1 item(s) - $602.00")) {
//			return true;
//		}
//		else 
//			return false;
//		
//	}
	
	@FindBy(xpath="//span[text()=' 1 item(s) - $602.00']")
	private WebElement MacBookPrice1QtyCartOption;
	
	public void clickMacBookPrice1QtyCartOption() {
		MacBookPrice1QtyCartOption.click();
	}
	
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement MacBookXButtonCart;
	
	public void clickMacBookXButtonfromCart() {
		MacBookXButtonCart.click();
	}
	
	@FindBy(xpath="//span[text()=' 0 item(s) - $0.00']")
	private WebElement MacBookPrice0QtyShowedToTheCart;
	
	public String MacBookPrice0QtyShowedToTheCartOption() {
		String actualtext=MacBookPrice0QtyShowedToTheCart.getText();
		return actualtext;
	}
	
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement MackBookCampare;
	
	public void ClickMackBookCampareButton() {
		MackBookCampare.click();
	}
	
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[3]")
	private WebElement MackBookAirCampare;
	
	public void ClickMackBookAirCampareButton() {
		MackBookAirCampare.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessageMackBookAirCampare;
	
	public boolean SuccessMessageMackBookAirCamparison() {
		
		if(SuccessMessageMackBookAirCampare.isDisplayed()) {
			return true;
		}
		else
		return false;
	}
	
	@FindBy(xpath="//a[text()='product comparison']")
	private WebElement MackBookAirProductCamparisonLink;
	
	public void ClickMackBookAirProductCamparisonLink() {
		MackBookAirProductCamparisonLink.click();
	}
	
	@FindBy(xpath="(//div[@id='content'])/h1")
	private WebElement MackBookAndMackBookAirProductCamparisonChart1;
	
	@FindBy(xpath="//div[@id=\"content\"]/table/tbody[1]/tr[1]/td[2]/a/strong")
	private WebElement MackBookAndMackBookAirProductCamparisonChart2;
	
	@FindBy(xpath="//div[@id=\"content\"]/table/tbody[1]/tr[1]/td[3]/a/strong")
	private WebElement MackBookAndMackBookAirProductCamparisonChart3;
	
	public boolean MackBookAndMackBookAirProductCamparisonChart() {
		
		if(MackBookAndMackBookAirProductCamparisonChart1.isDisplayed()){
			if(MackBookAndMackBookAirProductCamparisonChart2.isDisplayed()) {
				if(MackBookAndMackBookAirProductCamparisonChart3.isDisplayed()) {
					
				}
				
		}
			return true;
		}
		else 
			return false;
	}
	@FindBy(xpath="(//i[@class='fa fa-heart'])[6]")
	private WebElement addSonyVaioLaptopToWishList;
	
	public void ClickaddSonyVaioLaptopToWishList() {
		
		addSonyVaioLaptopToWishList.click();
	}
	
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])")
	private WebElement MustLoginToaddSonyVaioLaptopToWishList;
	
	public boolean MessageMustLoginToaddSonyVaioLaptopToWishList() {
		if (MustLoginToaddSonyVaioLaptopToWishList.isDisplayed()) {
			return true;
		}
		else
			return false;
	}
	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement MackBookProItem;
	
	public void ClickMackBookProItem() {
		MackBookProItem.click();
	}
	
	@FindBy(xpath="//h2[text()='$2,000.00']")
	private WebElement PriceOfMackBookPro;
	
	public String SeePriceOfMackBookPro() {
		String ActualPrice=PriceOfMackBookPro.getText();
		
		return ActualPrice;
	}
}

