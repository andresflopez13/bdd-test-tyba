package co.com.tyba.test.metrocuadrado.tasks;

import static co.com.tyba.test.metrocuadrado.userinterface.AmountSimulator.BTN_CALCULATE_CREDIT;
import static co.com.tyba.test.metrocuadrado.userinterface.AmountSimulator.SELECT_TERM_IN_YEARS;
import static co.com.tyba.test.metrocuadrado.userinterface.AmountSimulator.TEXT_MONTHLY_SALARY;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class InformationForTheCreditSimulator implements Task {

  private Integer salary;
  private Integer term;

  public InformationForTheCreditSimulator(Integer salary) {
    this.salary = salary;
  }

  @Override
  @Step("{0} change the information for the credit simulator")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(salary.toString()).into(TEXT_MONTHLY_SALARY),
        Click.on(SELECT_TERM_IN_YEARS.of(term.toString())),
        Click.on(BTN_CALCULATE_CREDIT));
  }

  public InformationForTheCreditSimulator termInYears(Integer term) {
    this.term = term;
    return this;
  }
}
