package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	@FindBy(xpath="(//p[text()='Show Details'])[4]")
	public WebElement firstOder;
	
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement orderCancelBtn;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement orderCancelReason;
	
	@FindBy(css="#orderSubmitBtn")
	public WebElement orderCancelSubmitBtn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelMessage;

	@FindBy(xpath="//div[@class='orders__container']")
	public List<WebElement> allOdrders;
	

	@FindBy(xpath="//button[@id='returnBtn']")
	public WebElement orderReturnItemsBtn;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement orderSelectReturnReason;
	
	@FindBy(xpath="//select[@name='dropOff']")
	public WebElement orderWhereToDrop;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement orderReturnSubmitBtn;
	
	@FindBy(xpath="//p[contains(text(),'Return was successfull')]")
	public WebElement orderReturnSuccessMessage;
	
	@FindBy(xpath="//button[text()='Review']")
	public WebElement orderReviewBtn;
	
	@FindBy(css="input[name='headline']")
	public WebElement orderReviewHeadLine;
	
	@FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement orderReviewDescriptionInput;
	
	@FindBy(css="#reviewSubmitBtn")
	public WebElement orderReviewSubmtBtn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement orderReviewSuccessMessage;
	
	@FindBy(css="#placeOrderBtn")
	public WebElement placeYourOrderBtnAgain;
	
	@FindBy(xpath="//button[text()='Buy again']")
	public WebElement buyAgainButton;
	
	@FindBy(xpath="(//p[text()='Show Details'])[5]")
	public WebElement secondOrder;
	
}
