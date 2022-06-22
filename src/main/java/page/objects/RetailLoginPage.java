package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailLoginPage extends Base {

	public RetailLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	public void ClickOnmyAccount() {
		myAccount.click();
	}

	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement Login;

	public void clickOnLogin() {
		Login.click();
	}

	@FindBy(xpath = "(//input[@id='input-email'])")
	private WebElement emailId;

	public void inputEmailId(String email) {
		emailId.sendKeys(email);
	}

	@FindBy(xpath = "(//input[@id='input-password'])")
	private WebElement Password;

	public void inputPassword(String pass) {
		Password.sendKeys(pass);
	}

	@FindBy(xpath = "(//input[@class='btn btn-primary'])")
	private WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "(//h2[text()='My Account'])")
	private WebElement myAccountDashBoard;

	public String myAccountDashBoardPresent() {
		String txt = myAccountDashBoard.getText();
		return txt;
	}

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiliateAccountLink;

	public void clikAffiliateAccountLink() {
		 affiliateAccountLink.click();;
	}

	@FindBy(id = "input-company")
	private WebElement companyName;

	public void inputCompanyName(String company) {
		companyName.sendKeys(company);
	}

	@FindBy(id = "input-website")
	private WebElement webSiteName;

	public void inputeWebSiteName(String WebSite) {
		webSiteName.sendKeys(WebSite);
	}

	@FindBy(id = "input-tax")
	private WebElement taxID;

	public void inputTaxID(String Tax) {
		taxID.sendKeys(Tax);
	}

	@FindBy(xpath = "(//input[@name='payment'])[1]")
	private WebElement SelectCheque;

	@FindBy(xpath = "(//input[@name='payment'])[2]")
	private WebElement SelectPayPal;

	@FindBy(xpath = "(//input[@name='payment'])[3]")
	private WebElement SelectBankTransfer;

	public void SelectPaymentMethod(String type) {

		if (type.equalsIgnoreCase("Cheque") && !SelectCheque.isSelected()) {
			SelectCheque.click();
		} else if (type.equalsIgnoreCase("PayPal") && !SelectPayPal.isSelected()) {
			SelectPayPal.click();
		} else if (type.equalsIgnoreCase("BankTransfer") && !SelectBankTransfer.isSelected()) {
			SelectBankTransfer.click();
		}
	}

	@FindBy(xpath = "(//input[@name='cheque'])[1]")
	private WebElement ChequePayeeName;

	public void inputChequePayeeName(String Name) {
		ChequePayeeName.sendKeys(Name);
	}

	@FindBy(xpath = "(//input[@name='agree'])")
	private WebElement checkonAboutuscheckbox;

	public void ClickCheckonAboutuscheckbox() {
		checkonAboutuscheckbox.click();
	}

	@FindBy(xpath = "(//input[@class='btn btn-primary'])")
	private WebElement ContinueButton;

	public void ClickContinueButton() {
		ContinueButton.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageAffiliateAccount;

	public boolean SuccessMessageAffiliateAccount() {
		if (messageAffiliateAccount.isDisplayed()) {
			return true;
		} else
			return false;
	}

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditAffiliateInformatio;

	public void clickEditAffiliateInformatio() {
		EditAffiliateInformatio.click();
	}

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;

	public void inputBankName(String BName) {
		bankName.clear();
		bankName.sendKeys(BName);
	}

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumber;

	public void inputAbaNumber(String AbaNo) {
		abaNumber.clear();
		abaNumber.sendKeys(AbaNo);
	}

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	
	private WebElement SWIFTCode;

	public void inputSWIFTCode(String swiftCod) {
		SWIFTCode.clear();
		SWIFTCode.sendKeys(swiftCod);
	}

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;

	public void inputAccountName(String AccName) {
		accountName.clear();
		accountName.sendKeys(AccName);
	}

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;

	public void inputAccountNumber(String AccNo) {
		accountNumber.clear();
		accountNumber.sendKeys(AccNo);
	}

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement editContinueButton;

	public void clickEditContinueButton() {
		
		editContinueButton.click();
	}

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement SuccessMessageEdit;

	public boolean successMessageEdit() {
		if (SuccessMessageEdit.isDisplayed()) {
			return true;
		} else
			return false;
	}
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editYourAccount;
	
	public void clickEditYourAccount() {
		editYourAccount.click();
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstname;
	
	public void inputFirstname(String fName) {
		firstname.clear();
		firstname.sendKeys(fName);
				
	}
	
	@FindBy(id="input-lastname")
	private WebElement lastname;
	
	public void inputLastname(String lName) {
		lastname.clear();
		lastname.sendKeys(lName);
	}
	
	@FindBy(id="input-email")
	private WebElement email;
	
	public void inputEmail(String eMail) {
		email.clear();
		email.sendKeys(eMail);
	}
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	public void inputTelephone(String phone) {
		telephone.clear();
		telephone.sendKeys(phone);
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continueButtonFromEditYourAccount;
	
	public void clickContinueButtonFromEditYourAccount() {
		continueButtonFromEditYourAccount.click();
	}
	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement messageFromEditYourAccount;
	
	public String successMessageFromEditYourAccount() {
		String actual=messageFromEditYourAccount.getText();
		return actual;
	}
}