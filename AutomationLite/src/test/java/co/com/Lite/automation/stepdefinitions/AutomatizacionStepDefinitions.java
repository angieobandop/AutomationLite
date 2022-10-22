
package co.com.Lite.automation.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class AutomatizacionStepDefinitions {


    private PageAutomationPractice pageAutomationPractice;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	


        @Given("^(.*) enter to page of shopping to buy$")
        public void somethingEnterToPageOfShoppingToBuy(String Actor) throws Throwable {
            theActorCalled("angie").wasAbleTo(OpenTheBrowser.on(pageAutomationPractice));
        }

        @When("^she select a product and add to cart$")
        public void sheSelectAProductAndAddToCart() throws Throwable {
            theActorInTheSpotlight().attemptsTo(Select.product(PRODUCT));
        }

        @Then("^validate that adding a product was successful$")
        public void validateThatAddingAProductWasSuccessful() throws Throwable {
            theActorInTheSpotlight().should(seeThat(MessageValidation.of(VALIDATION_ADD_CART),equalTo("Producto agregado correctamente a su carrito de compras")));

        }

        @When("^she searche dresses in the page$")
        public void sheSearcheDressesInThePage() throws Throwable {
            theActorInTheSpotlight().attemptsTo(Search.the(SEARCH_BAR));
        }

        @Then("^validate seeking was successful$")
        public void validateSeekingWasSuccessful() throws Throwable {
            theActorInTheSpotlight().should(seeThat(MessageValidation.of(TXT_VALIDATION),equalTo("SEARCH  \"DRESSES\"")));

        }
        @Then("^validate the search is unsuccessful$")
        public void validateTheSearchIsUnsuccessful() throws Throwable {
            theActorInTheSpotlight().should(seeThat(MessageValidation.of(TXT_VALIDATION),equalTo("Please enter a search keyword")));

        }

    }