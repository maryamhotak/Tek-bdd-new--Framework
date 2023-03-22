package tek.sdet.framework.steps;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Order section")
	public void userClickOnOrderSection() {
		click(factory.homePage().orderOption);
		logger.info("user clicked on order option");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		waitTillClickable(factory.orderPage().firstOder);
		click(factory.orderPage().firstOder);

		logger.info("user clicked on the first order");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		
				click(factory.orderPage().orderCancelBtn);
				logger.info("user clicked on cancel the order button");		
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		selectByVisibleText(factory.orderPage().orderCancelReason, string);
		logger.info("user selected the cancellation reason");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().orderCancelSubmitBtn);
		logger.info("user clicked on the cancel order submit button");
	}

	@Then("A cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
		Assert.assertEquals(string, factory.orderPage().orderCancelMessage.getText());
		logger.info("order cancelation message was diplayed " + string);

	}
	
	@When("User click on Return items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().orderReturnItemsBtn);
		logger.info("user clicked on return items button");
	    
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
	  selectByVisibleText(factory.orderPage().orderSelectReturnReason, string);
	  logger.info("user selected order return reason");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().orderWhereToDrop, string);
		logger.info("user selected the drop off service");
	
	}
	@When("User click on return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().orderReturnSubmitBtn);
		logger.info("user clicked on return order button");
	   
	}
	@Then("A cancelation messages should be displayed {string}")
	public void aCancelationMessagesShouldBeDisplayed(String string) {
		Assert.assertEquals(string, factory.orderPage().orderReturnSuccessMessage.getText());
		logger.info("the message was displayed "+string);
	    
}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	click(factory.orderPage().orderReviewBtn);
	logger.info("user clicked on order review button");
	}
	@When("User write Review headline")
	public void userWriteReviewHeadline(DataTable dataTable) {
	   List<Map<String, String>> reviewinfo = dataTable.asMaps(String.class, String.class);
	   sendText(factory.orderPage().orderReviewHeadLine, reviewinfo.get(0).get("headline"));
	   sendText(factory.orderPage().orderReviewDescriptionInput, reviewinfo.get(0).get("descripton"));
	   logger.info("user filled review form");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().orderReviewSubmtBtn);
		logger.info("user clicked on order review button");
	   
	}
	@Then("A review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.orderPage().orderReviewSuccessMessage);
		Assert.assertEquals(string, factory.orderPage().orderReviewSuccessMessage.getText());
		logger.info("a message was displayed "+ string);
		   
}
	
	@When("User click on buy again button")
	public void userClickOnBuyAgainButton() {
	    click(factory.orderPage().buyAgainButton);
	}
	   @Then ("User click on Place Your order")
	   public void userClickOnPlaceYourOrder() {
		   waitTillClickable(factory.orderPage().placeYourOrderBtnAgain);
		   click(factory.orderPage().placeYourOrderBtnAgain);
	   }
	   
	   @When("User click on second order in list")
	   public void userClickOnSecondOrderInList() {
	     click(factory.orderPage().secondOrder);
	     logger.info("user clicked on second order");
	   }
}
