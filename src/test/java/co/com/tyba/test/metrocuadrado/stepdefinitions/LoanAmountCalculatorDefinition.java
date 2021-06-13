package co.com.tyba.test.metrocuadrado.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.tyba.test.metrocuadrado.tasks.GoTo;
import io.cucumber.java.es.Dado;

public class LoanAmountCalculatorDefinition {

  @Dado("se dirige a la calculadora de crédito para saber cuanto le prestan")
  public void goesToTheCreditCalculatorToFindOutHowMuchTheyLoanYou() {
    theActorInTheSpotlight().wasAbleTo(GoTo.howMuchDoTheyLendYouCalculator());
  }
}
