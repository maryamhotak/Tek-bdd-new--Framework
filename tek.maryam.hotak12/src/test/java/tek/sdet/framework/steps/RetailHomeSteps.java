package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + "ExpectedTitle" + expectedTitle);
	}

	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);

	}

	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("the Product is displayed on home page");
	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().sideBarAllButton);
		logger.info("User clicked on All Departments");
	}

	@Then("User below options are present in Shop by department sidebar")
	public void userBelowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
		List<WebElement> actualSideBar = factory.homePage().departments;
		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + "is equal to " + expectedSideBar.get(0).get(i));
		}
//			Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronic.getText());
//			Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computer.getText());
//			Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHome.getText());
//			Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sport.getText());
//			Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automative.getText());
//			logger.info("The actual value is equal expected ");
	}

	@When("User is on {string}")
	public void userIsOnDepartment(String department) {
		List<WebElement> sideBarOptions = factory.homePage().departments;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + "user was on all department");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().departments;
		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement option : actualDepartmentOptions) {
				if (option.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(option));
					logger.info(option.getText() + " is present");

				}
			}

		}
	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
    selectByVisibleText(factory.homePage().allCatagoryBtn, string);
    logger.info("user changed the catagory to Smart Home");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().searcBar, string);
		logger.info("user added searched for " +string);

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtnHomePage);
		logger.info("user clicked on search button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().KasaOutdoorSmartPlug);
		logger.info("user clicked on item");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByVisibleText(factory.homePage().itemQty, string);
		logger.info("user selected item quantity" + string);

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBtn);
		logger.info("user clicked on add to card button");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		if(!factory.homePage().cartQtyAssertion.getText().equals(string)) {
			
				click(factory.homePage().cartOption);
		        click(factory.homePage().deleteItemFromCart);
		        logger.info("item from the cart got deleted");
		        if(factory.homePage().cartQtyAssertion.getText().equals(string)) {
		        	Assert.assertEquals(string, factory.homePage().cartQtyAssertion.getText());
			}
			   
		}

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().cartOption);
	    logger.info("user clicked on the cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().proceedCheckOutBtn);
	    logger.info("use clicekd on proceed to checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().oderNewAddressLink);
	    logger.info("user clicked on add new address link");
	}
//	@Then("User fill new address form with below information")
//	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
//	    List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
//	    selectByVisibleText(factory.accountPage().addressCountryDropDown, addressInfo.get(0).get("country"));
//	    sendText(factory.accountPage().addressNameInput, addressInfo.get(0).get("fullName"));
//	    sendText(factory.accountPage().addressPhoneNumber, addressInfo.get(0).get("phoneNumber"));
//	    sendText(factory.accountPage().addressStreetInput, addressInfo.get(0).get("streetAddress"));
//	    sendText(factory.accountPage().addressApartmentInput, addressInfo.get(0).get("apt"));
//	    sendText(factory.accountPage().addressCityInput, addressInfo.get(0).get("city"));
//	    selectByVisibleText(factory.accountPage().addressStateInput, addressInfo.get(0).get("state"));
//	    sendText(factory.accountPage().addressZipInput, addressInfo.get(0).get("zipCode"));
//	    logger.info("user filled addres information form");
//	    
//	}
	@Then("User click Add your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().addYourAddressButton);
	    logger.info("user clicked on add your address button");
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.accountPage().orderNewAccountBankLink);
	    logger.info("user clicked on order new account link ");
	}
//	@Then("User fill Debit or Credit card information")
//	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
//	  List<Map<String,String>> bankInfo = dataTable.asMaps(String.class, String.class);
//	  sendText(factory.accountPage().CardNumberInput, bankInfo.get(0).get("cardNumber"));
//	  sendText(factory.accountPage().nameOnCardInput, bankInfo.get(0).get("nameOnCard"));
//	  selectByValue(factory.accountPage().expirationMonth, bankInfo.get(0).get("expirationMonth"));
//	  selectByValue(factory.accountPage().expirationYearInput, bankInfo.get(0).get("expirationYear"));
//	  sendText(factory.accountPage().securityCode, bankInfo.get(0).get("securityCode"));
//	  logger.info("user filled bank information form");
//	}
	@Then("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    click(factory.accountPage().paymentSubmitBtn);
	    logger.info("user clicked on payment submit buttion");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.homePage().placeOrderBtn);
	    logger.info("user clicked on or place your ordr button");
	}
	@Then("Message should be Displayed {string}")
	public void messageShouldBeDisplayed(String string) {
	    Assert.assertEquals(string, factory.homePage().orderPlacedSuccessMessage.getText());
	    logger.info("a message was displayed "+ string);
}
	
	@When("User click on the Item")
	public void userClickOnTheItem() {
	   click(factory.homePage().apexLegends);
	   logger.info("user clicked on the apex Legends item");
	}
	
	  

}
