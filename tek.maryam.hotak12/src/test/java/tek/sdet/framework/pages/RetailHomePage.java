package tek.sdet.framework.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;
public class RetailHomePage extends BaseSetup {
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }

	// syntax for finding UI elements and storing them in POM classes /** *
	// @FindBy(locatorType = "value") * public WebElement nameOfElement */
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
    public WebElement tekSchoolLogo;
    @FindBy(id ="search")
    public WebElement allDepartmentDropDown;
    @FindBy(css = "#searchInput")
    public WebElement searchBar;
    @FindBy(xpath = "//button[@id='searchBtn']")
    public WebElement searchButton; 
    @FindBy(linkText = "Sign in")
    public WebElement signInButton;
    @FindBy(id="cartBtn")
    public WebElement cartButton;
    
    @FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
    public WebElement pokemanProductImage;
    
    @FindBy(css="#accountLink")
    public WebElement accountOption;
    
   
    @FindBy(id = "hamburgerBtn")
    public WebElement sideBarAllButton;
    @FindBy(xpath="//span[contains(text(),'Electronics')]")
    public WebElement electronic;
    @FindBy(xpath="//span[contains(text(),'Computer')]")
    public WebElement computer;
    @FindBy(xpath="//span[contains(text(),'Smart Home')]")
    public WebElement smartHome;
    @FindBy(xpath="//span[contains(text(),'Sports')]")
    public WebElement sport;
    
    @FindBy (id="orderLink")
    public WebElement orderOption;
 	
    @FindBy(xpath="//span[contains(text(),'Automative')]")
    public WebElement automative;
    
    @FindBy(xpath="//div[@class='sidebar__content']//span")
    public List<WebElement> departments;
    
    @FindBy(xpath="//select[@class='search__select']")
    public WebElement allCatagoryBtn;
    
    @FindBy(css="#searchInput")
    public WebElement searcBar;
    
    @FindBy(xpath="//button[@id='searchBtn']")
    public WebElement searchBtnHomePage;
    
    @FindBy(xpath ="//img[@alt='Kasa Outdoor Smart Plug']")
    public WebElement KasaOutdoorSmartPlug;
    
    @FindBy(css="select[class='product__select']")
    public WebElement itemQty;
    
    @FindBy(xpath="//span[text()='Add to Cart']")
    public WebElement addToCartBtn;
    
    @FindBy(css="#cartQuantity")
    public WebElement cartQtyAssertion;
    
    @FindBy(css="#cartBtn")
    public WebElement cartOption;
    
    @FindBy(css="button[id='proceedBtn']")
    public WebElement proceedCheckOutBtn;
    
    @FindBy(css="button[id='addAddressBtn']")
    public WebElement oderNewAddressLink;
    
    @FindBy(css="#placeOrderBtn")
    public WebElement placeOrderBtn;
    
    @FindBy(xpath="//p[text()='Order Placed, Thanks']")
    public WebElement orderPlacedSuccessMessage;
    
    @FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
    public WebElement apexLegends;
    
    @FindBy(xpath="//span[text()='Delete']")
	public WebElement deleteItemFromCart;
    
    @FindBy(xpath="//h1[contains(text(),'Your Shopping Cart is Empty')]")
    public WebElement emptyShoppingCart;
    
    @FindBy(xpath="#orderLink")
	public WebElement oderOption;
    
}
