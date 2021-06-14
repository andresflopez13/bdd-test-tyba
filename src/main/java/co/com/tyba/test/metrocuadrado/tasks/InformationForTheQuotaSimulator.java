package co.com.tyba.test.metrocuadrado.tasks;

import static co.com.tyba.test.metrocuadrado.userinterface.QuotaSimulator.BTN_CALCULATE_QUOTA;
import static co.com.tyba.test.metrocuadrado.userinterface.QuotaSimulator.SELECT_TERM_IN_YEARS;
import static co.com.tyba.test.metrocuadrado.userinterface.QuotaSimulator.TEXT_LOAN_AMOUNT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class InformationForTheQuotaSimulator implements Task {

  private Integer amount;
  private Integer term;

  public InformationForTheQuotaSimulator(Integer amount) {
    this.amount = amount;
  }

  @Override
  @Step("{0} change the information for the quota simulator")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(amount.toString()).into(TEXT_LOAN_AMOUNT),
        Click.on(SELECT_TERM_IN_YEARS.of(term.toString())),
        Click.on(BTN_CALCULATE_QUOTA));
  }

  public InformationForTheQuotaSimulator termInYears(Integer term) {
    this.term = term;
    return this;
  }
}
