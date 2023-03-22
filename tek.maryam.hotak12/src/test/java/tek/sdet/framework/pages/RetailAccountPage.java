package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage () {
		PageFactory.initElements(getDriver(), this);
		
	}
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement imageInput;
	@FindBy(css="#nameInput")
	 public WebElement updateName;
	 
	 @FindBy(css="#personalPhoneInput")
	 public WebElement phoneNumber;
	 
	 @FindBy(id="emailInput")
	 public WebElement updateEmail;
	 
	 @FindBy(xpath="//button[text()='Update']")
	 public WebElement updateButton;
	 
	 @FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessageUpdate;
	 @FindBy(css="#countryDropdown")
	 public WebElement addressCountryDropDown;

	 @FindBy(css=" #fullNameInput")
	 public WebElement addressNameInput;

	 @FindBy(css="#phoneNumberInput")
	 public WebElement addressPhoneNumber;


	 @FindBy(xpath="//input[@id='streetInput']")
	 public WebElement addressStreetInput;

	 @FindBy(xpath="//input[@id='apartmentInput']")
	 public WebElement addressApartmentInput;

	 @FindBy(xpath="//input[@id='cityInput']")
	 public WebElement addressCityInput;

	 @FindBy(xpath="//select[@name='state']")
	 public WebElement addressStateInput;

	 @FindBy(xpath="//input[@id='zipCodeInput']")
	 public WebElement addressZipInput;

	 @FindBy(xpath="//button[@id='addressBtn']")
	 public WebElement addYourAddressButton;

	 @FindBy(xpath="//div[contains(text(),'Address Added Successfully')]")
	 public WebElement addressUpdateSuccessMessage;

	 @FindBy(xpath="//img[@alt='master card']")
	 public WebElement orderNewAccountBankLink;
	 
	 @FindBy(css="#cardNumberInput")
	 public WebElement CardNumberInput;
	 
	 @FindBy(css="#nameOnCardInput")
	 public WebElement nameOnCardInput;
	 
	 @FindBy(css="select[name=expirationMonth]")
	 public WebElement expirationMonth;
	 
	 @FindBy(css="select[id=expirationYearInput]")
	 public WebElement expirationYearInput;
	 
	@FindBy(css="input[name=securityCode]")
	public WebElement securityCode; 

	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmitBtn;

	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodSuccessMessage; 
	
	 @FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	 public WebElement addPaymentMethodLink;
	 
	 @FindBy(xpath="//p[contains(text(),'American Express')]")
	 public WebElement bankCard;
	 
	 @FindBy(xpath="(//button[text()='Edit'])[1]")
	 public WebElement editCard;
	 
	 @FindBy(xpath="//button[text()='Update Your Card']")
	 public WebElement updateYourBankCard;
	 
	 @FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	 public WebElement paymentMethodUpdateMessage;
	 
	 @FindBy(xpath="//button[text()='remove']")
	 public WebElement removeBankCard;
	 
	 @FindBy(xpath="//div[@class='account__address-new-wrapper']")
	 public WebElement AddressOption;
	 
	 @FindBy(xpath="//button[text()='Edit']")
	 public WebElement addressEditButton;
	 
	 @FindBy(xpath="//button[@id='addressBtn']")
	 public WebElement addresUpdateBtn;
	 @FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
	 public WebElement addressUpdateMassageAfterEdit;
	 
	 @FindBy(xpath="//button[@class='account__address-btn'][2]")
	 public WebElement addressRemoveButton;
	 
	 @FindBy(xpath="//div[@class='account__address-new']")
	 public WebElement addressValidationButton;
	 
	 @FindBy(css="#previousPasswordInput")
	 public WebElement previousPasswordInput;
	 
	 @FindBy(css="#newPasswordInput")
	 public WebElement newPasswordInput;
	 
	 @FindBy(css="#confirmPasswordInput")
	 public WebElement confirmPasswordInput;
	 
	 @FindBy(xpath="//button[@id='credentialsSubmitBtn']")
	 public WebElement passwordUpdateBtn;
	 
	@FindBy(xpath="//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdateSuccessMessage;
	 

}
