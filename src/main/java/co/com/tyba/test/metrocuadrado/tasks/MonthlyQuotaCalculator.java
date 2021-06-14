package co.com.tyba.test.metrocuadrado.tasks;

import static co.com.tyba.test.metrocuadrado.userinterface.QuotaSimulator.TAB_QUOTA_SIMULATOR;

import java.time.Duration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class MonthlyQuotaCalculator implements Task {

  @Override
  @Step("{0} go to the monthly fee calculator")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        GoTo.howMuchDoTheyLendYouCalculator(),
        Click.on(TAB_QUOTA_SIMULATOR.waitingForNoMoreThan(Duration.ofSeconds(2))));
  }
}
