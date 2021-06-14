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

public class CalculatorForTheValueOfTheQuotaDefinition {

  private Integer amountAux;

  @Dado("se dirige a la calculadora de cuotas para conocer el valor del canon mensual")
  public void goToTheQuotaCalculatorToKnowTheValueOfTheMonthlyQuota() {
    theActorInTheSpotlight().wasAbleTo(GoTo.monthlyQuotaCalculator());
  }

  @Cuando("ingresa el valor del credito que desea {int} y el plazo {int} en años")
  public void enterTheAmountOfTheCreditYouWantAndTheTermInYears(Integer amount, Integer term) {
    amountAux = amount;
    theActorInTheSpotlight()
        .attemptsTo(Change.InformationForTheQuotaSimulatorWith(amount).termInYears(term));
  }

  @Entonces("verifica que debe tener ingresos de {int} con una inicial de {int}")
  public void verifyTheInitialMonthlyPaymentAndTheValueOfTheCredit(
      Integer salary, Integer initial) {
    List<WebElementFacade> listResult = DATA_TABLE_RESULT.resolveAllFor(theActorInTheSpotlight());
    theActorInTheSpotlight()
        .attemptsTo(
            Ensure.that(getNumericValue(listResult.get(4).getText()))
                .asAnInteger()
                .isEqualTo(amountAux),
            Ensure.that(getNumericValue(listResult.get(5).getText()))
                .asAnInteger()
                .isEqualTo(salary),
            Ensure.that(getNumericValue(listResult.get(6).getText()))
                .asAnInteger()
                .isEqualTo(initial),
            Ensure.that(getNumericValue(listResult.get(7).getText()))
                .asAnInteger()
                .isEqualTo(amountAux + initial),
            Ensure.that(
                    getNumericValue(
                        DATA_TABLE_RESULT_BANK
                            .resolveAllFor(theActorInTheSpotlight())
                            .get(0)
                            .getText()))
                .asAnInteger()
                .isEqualTo((salary * 30) / 100));
  }
}
