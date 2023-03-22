package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility {
  
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
   click(factory.homePage().accountOption);
   logger.info("User clicked on account option");
   
	}
	@When("User update Name {string} and phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
     clearText(factory.accountPage().updateName);
     sendText(factory.accountPage().updateName, name);
     clearText(factory.accountPage().phoneNumber);
     sendText(factory.accountPage().phoneNumber, phone);
     logger.info("user update name and phone number");
     
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	    click(factory.accountPage().updateButton);
	    logger.info("user clicked on update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	    //Assert.assertTrue(isElementDisplayed(factory.accountPage().successMessageUpdate));
		logger.info("user logged in");
	   
	}
	

	@When("User click on add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("use clicked on add paymet method link");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> updatePaymentInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().CardNumberInput, updatePaymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, updatePaymentInfo.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonth, updatePaymentInfo.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput, updatePaymentInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, updatePaymentInfo.get(0).get("securityCode"));
		logger.info("user filled debit or credit card information");
	}

	@When("User click on add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user clicked on payment submit button");
	}

	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String successMessage) {
		waitTillPresence(factory.accountPage().paymentMethodSuccessMessage);
		Assert.assertEquals(successMessage, factory.accountPage().paymentMethodSuccessMessage.getText());
		logger.info("message was displayed " + successMessage);
	}

	@When("User click on bank card")
	public void userClickOnBankCard() {
		click(factory.accountPage().bankCard);
		logger.info("user clicked on bank card");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editCard);
		logger.info("user click on edit card");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> updateCardInfo = dataTable.asMaps(String.class, String.class);
		clearText(factory.accountPage().CardNumberInput);
		sendText(factory.accountPage().CardNumberInput, updateCardInfo.get(0).get("cardNumber"));
		clearText(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, updateCardInfo.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonth, updateCardInfo.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput, updateCardInfo.get(0).get("expirationYear"));
		clearText(factory.accountPage().securityCode);
		sendText(factory.accountPage().securityCode, updateCardInfo.get(0).get("securityCode"));
		logger.info("user filled update bank account card form");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourBankCard);
		logger.info("user clicked update button");
	}

	@Then("a message should be Displayed {string}")
	public void aMessageShouldBeDisplayedToUpddateBankCard(String string) {
		String string1 =factory.accountPage().paymentMethodUpdateMessage.getText();
		waitTillPresence(factory.accountPage().paymentMethodUpdateMessage);
		Assert.assertEquals(string,factory.accountPage().paymentMethodUpdateMessage.getText());
		logger.info("a message was displayed "+ string);
		logger.info("Expected: " + string + " Actual: "+ string1);
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removeBankCard);
		logger.info("user clicked on remove button");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().bankCard));
		logger.info("bank card removed" + isElementDisplayed(factory.accountPage().bankCard));
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().AddressOption);
		logger.info("user clicked on address option");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addressCountryDropDown, addressInfo.get(0).get("country"));
		sendText(factory.accountPage().addressNameInput, addressInfo.get(0).get("fullName"));
		sendText(factory.accountPage().addressPhoneNumber, addressInfo.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addressStreetInput, addressInfo.get(0).get("streetAddress"));
		sendText(factory.accountPage().addressApartmentInput, addressInfo.get(0).get("apt"));
		sendText(factory.accountPage().addressCityInput, addressInfo.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInput, addressInfo.get(0).get("state"));
		sendText(factory.accountPage().addressZipInput, addressInfo.get(0).get("zipCode"));
		logger.info("user filled address form");
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked on add your address button");
	}

	@Then("address update message should be displayed 'Address Added Successfully'")
	public void addressUpdateMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().addressUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdateSuccessMessage));
		logger.info("Address Added Successfully, this message was diplayed ");
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditButton);
		logger.info("user clicked on address edit button");
	}

	@When("User edit address form with below information")
	public void userEditAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> editAddresForm = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addressCountryDropDown, editAddresForm.get(0).get("country"));
		clearText(factory.accountPage().addressNameInput);
		sendText(factory.accountPage().addressNameInput, editAddresForm.get(0).get("fullName"));
		clearText(factory.accountPage().addressPhoneNumber);
		sendText(factory.accountPage().addressPhoneNumber, editAddresForm.get(0).get("phoneNumber"));
		clearText(factory.accountPage().addressStreetInput);
		sendText(factory.accountPage().addressStreetInput, editAddresForm.get(0).get("streetAddress"));
		clearText(factory.accountPage().addressApartmentInput);
		sendText(factory.accountPage().addressApartmentInput, editAddresForm.get(0).get("apt"));
		clearText(factory.accountPage().addressCityInput);
		sendText(factory.accountPage().addressCityInput, editAddresForm.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInput, editAddresForm.get(0).get("state"));
		clearTextUsingSendKesys(factory.accountPage().addressZipInput);
		sendText(factory.accountPage().addressZipInput, editAddresForm.get(0).get("zipCode"));
		logger.info("user updated address form with new information");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().addresUpdateBtn);
		logger.info("user clicked on address edit button");

	}

	@Then("A Message should be displayed {string}")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully(String updateMessage) {
		waitTillPresence(factory.accountPage().addressUpdateMassageAfterEdit);
		Assert.assertEquals(updateMessage, factory.accountPage().addressUpdateMassageAfterEdit.getText());
		logger.info("a message was displayed " + updateMessage);
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().addressRemoveButton);
		logger.info("user clicked on address remove button");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressValidationButton));
		logger.info(isElementDisplayed(factory.accountPage().addressValidationButton));
	}
	
	
	@Then("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
	    List<Map<String, String>> passwordInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountPage().previousPasswordInput, passwordInfo.get(0).get("previousPassword"));
	    sendText(factory.accountPage().newPasswordInput, passwordInfo.get(0).get("newPassword"));
	    sendText(factory.accountPage().confirmPasswordInput, passwordInfo.get(0).get("confirmPassword"));
	    logger.info("user filled password update form");
	}
	@Then("User click on Change password button")
	public void userClickOnChangePasswordButton() {
	    click(factory.accountPage().passwordUpdateBtn);
	    logger.info("user clicked on update pasword button");

	    
	}
	@Then("a Message should be displayed {string}")
	public void amessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().passwordUpdateSuccessMessage);
		Assert.assertEquals(string, factory.accountPage().passwordUpdateSuccessMessage.getText());
		logger.info("a message was displayed "+ string);
	   
	}
}
	
