package co.com.certification.bancolombia.stepdefinitions;

import co.com.certification.bancolombia.questions.ValidateMessage;
import co.com.certification.bancolombia.tasks.*;
import co.com.certification.bancolombia.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PruebaStepDefinition {

    @Before
    public void init(){
        setTheStage(new Cast());
    }

    @Given("^the user enters the main page$")
    public void theUserEntersTheMainPage() {
        theActorCalled("Daniel").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://tasks.evalartapp.com/automatization/")));
    }

    @When("^the user enters the (.*) and (.*)$")
    public void theUserEntersTheAnd(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.login(user, password));
    }

    @When("^the user complete the first cycle whit the info (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheFirstCycleWhitTheInfo(String multiples, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFirstCycle.firstCycle(multiples, operation, letter, count));
    }


    @When("^the user complete the second cycle whit the info (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheSecondCycleWhitTheInfo(String multiples, String multiples2, String multiples3, String multiples4, String multiples5, String multiples6, String multiples7, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteSecondCycle.completeSecondCycle(multiples, multiples2, multiples3, multiples4, multiples5, multiples6, multiples7, operation, letter, count));
    }


    @When("^the user complete the third cycle whit the info (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheThirdCycleWhitTheInfo(String multiples, String multiples2, String multiples3, String multiples4, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteThirdCycle.completeThirdCycle(multiples, multiples2, multiples3, multiples4, operation, letter, count));
    }

    @When("^the user complete the fourth cycle whit the info (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheFourthCycleWhitTheInfo(String multiples, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFourthCycle.completeFourthCycle(multiples, operation, letter, count));
    }

    @When("^the user complete the fifth cycle whit the info (.*) (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheFifthCycleWhitTheInfo(String multiples, String multiples2, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFifthCycle.completeFifthCycle(multiples, multiples2, operation, letter, count));
    }

    @When("^the user complete the sixth cycle whit the info (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheSixthCycleWhitTheInfo(String multiples, String multiples2, String multiples3, String multiples4, String multiples5, String multiples6, String multiples7, String multiples8, String multiples9, String multiples10, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteSixthCycle.completeSixthCycle(multiples, multiples2, multiples3, multiples4, multiples5, multiples6, multiples7, multiples8, multiples9, multiples10, operation, letter, count));
    }

    @When("^the user complete the seventh cycle whit the info (.*) (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheSeventhCycleWhitTheInfo(String multiples, String multiples2, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteSeventhCycle.completeSeventhCycle(multiples, multiples2, operation, letter, count));
    }

    @When("^the user complete the eighth cycle whit the info (.*) (.*) (.*)$")
    public void theUserCompleteTheEighthCycleWhitTheInfo(String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteEighthCycle.completeEighthCycle(operation, letter, count));
    }

    @When("^the user complete the ninth cycle whit the info (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheNinthCycleWhitTheInfo(String multiples, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteNinthCycle.completeNinthCycle(multiples, operation, letter, count));
    }

    @When("^the user complete the tenth cycle (.*) (.*) (.*) (.*) (.*)$")
    public void theUserCompleteTheTenthCycle(String multiples, String multiples2, String operation, String letter, String count) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteTenthCycle.completeTenthCycle(multiples, multiples2, operation, letter, count));
    }

    @Then("^the user should see the token$")
    public void theUserShouldSeeTheToken() {
        GivenWhenThen.seeThat(ValidateMessage.validateMessage(), Matchers.is(equals("Felicidades, has terminado la prueba exitosamente")));
    }
}
