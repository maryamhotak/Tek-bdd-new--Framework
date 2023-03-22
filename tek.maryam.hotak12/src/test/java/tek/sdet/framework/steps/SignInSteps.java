package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class SignInSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	
	@When("User click on the Sign in option")
	public void userClickOnTheSignInOption() {
	  click(factory.homePage().signInButton);
	  logger.info("user click on the Sign in option");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
	  sendText(factory.signInPage().emailFieldSignIn, emailValue);
	  sendText(factory.signInPage().passwordFieldSignIn, passwordValue);
	  logger.info("user entered email "+ emailValue +" and password "+ passwordValue);
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().lognInBtn);
	    logger.info("user clicked on login button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption)); 
	
	}
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
	 click(factory.signInPage().createNewAccountButton);
	 logger.info("User click on Create New Account button");
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	   List<Map<String, String>> singUpInformation = dataTable.asMaps(String.class, String.class);
	   sendText(factory.signInPage().nameInput, singUpInformation.get(0).get("name"));
	   sendText(factory.signInPage().emailInput,singUpInformation.get(0).get("email"));
	   sendText(factory.signInPage().passwordInput,singUpInformation.get(0).get("password"));
	   sendText(factory.signInPage().confirmPassword,singUpInformation.get(0).get("confirmpassword"));
	   logger.info("User filled the signUp information form ");
	}
	@When("User click on signUp button")
	public void userClickOnSignUpButton() {
	   click(factory.signInPage().signUpBtn);
	   logger.info("user clicked on signUp button");
	}
	@Then("user should be logged in into Account")
	public void userShouldBeLoggedInIntoaccount() {
	    Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
	    logger.info("account option should be displayed");
	}
	  


}
