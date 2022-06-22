package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;



public class HomePagePageOb extends Base {
	
	

	
	
		public HomePagePageOb() {
		PageFactory.initElements(driver, this);
				}
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencybutton;
	
	public void ClickCurrencyButton() {
		
		currencybutton.click();
	}
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement euro;
	
	public WebElement getEuro() {
		return euro;
	}

	public void selectEuro() {
		euro.click();
	
		
	}
	
	
	
	@FindBy(xpath="//strong[text()='€']")
	private WebElement euroCurrency;
	
	public String changedToEuro() {
		
		String currency=euroCurrency.getText();
		return currency;
		
	}
	
	@FindBy(id="cart-total")
	private WebElement shoppingCart ;
	
	public void clickShoppingCart() {
		shoppingCart.click();
	}
	
	
	@FindBy(xpath="//p[@class='text-center']")
	private WebElement emptyMessage;
	
	public String cartEmptyMessage() {
		String actual=emptyMessage.getText();
		
		return actual;
	}

}
