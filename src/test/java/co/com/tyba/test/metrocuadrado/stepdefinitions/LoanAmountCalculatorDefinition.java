package co.com.tyba.test.metrocuadrado.stepdefinitions;

import static co.com.tyba.test.metrocuadrado.userinterface.AmountSimulator.DATA_TABLE_RESULT;
import static co.com.tyba.test.metrocuadrado.userinterface.AmountSimulator.DATA_TABLE_RESULT_BANK;
import static co.com.tyba.test.metrocuadrado.utils.Text.getNumericValue;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.tyba.test.metrocuadrado.tasks.Change;
import co.com.tyba.test.metrocuadrado.tasks.GoTo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoanAmountCalculatorDefinition {

  @Dado("se dirige a la calculadora de crédito para saber cuanto le prestan")
  public void goesToTheCreditCalculatorToFindOutHowMuchTheyLoanYou() {
    theActorInTheSpotlight().wasAbleTo(GoTo.howMuchDoTheyLendYouCalculator());
  }

  @Cuando("ingresa el valor de su salario {int} mensual y el plazo {int} en años")
  public void enterTheValueOfYourMonthlySalaryAndTheTermInYears(Integer salary, Integer term) {
    theActorInTheSpotlight()
        .attemptsTo(Change.informationForTheCreditSimulatorWith(salary).termInYears(term));
  }

  @Entonces(
      "verifica que debe tener una inicial de {int} para poder prestar al banco {int} con un salario de {int}")
  public void verifyThatYouMustHaveAnInitialToBeAbleToLendToTheBank(
      Integer initial, Integer amount, Integer salary) {
    List<WebElementFacade> listResult = DATA_TABLE_RESULT.resolveAllFor(theActorInTheSpotlight());
    List<WebElementFacade> listResultTable =
        DATA_TABLE_RESULT_BANK.resolveAllFor(theActorInTheSpotlight());
    theActorInTheSpotlight()
        .attemptsTo(
            Ensure.that(getNumericValue(listResult.get(0).getText()))
                .asAnInteger()
                .isEqualTo(salary),
            Ensure.that(getNumericValue(listResult.get(1).getText()))
                .asAnInteger()
                .isEqualTo(amount),
            Ensure.that(getNumericValue(listResult.get(2).getText()))
                .asAnInteger()
                .isEqualTo(initial),
            Ensure.that(getNumericValue(listResult.get(3).getText()))
                .asAnInteger()
                .isEqualTo(amount + initial - 1),
            Ensure.that(getNumericValue(listResultTable.get(0).getText()))
                .asAnInteger()
                .isEqualTo(amount),
            Ensure.that(getNumericValue(listResultTable.get(1).getText()))
                .asAnInteger()
                .isEqualTo((salary * 30) / 100));
  }
}
