package co.com.tyba.test.metrocuadrado.tasks;

import static co.com.tyba.test.metrocuadrado.userinterface.Home.BTN_HOUSING_MORTGAGE_CALCULATOR;
import static co.com.tyba.test.metrocuadrado.userinterface.Home.BTN_SELECT_TOOLS;

import co.com.tyba.test.metrocuadrado.interactions.TabBrowser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class HowMuchDoTheyLendYou implements Task {

  @Override
  @Step("{0} go to the how much do they lend you calculator")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_SELECT_TOOLS), Click.on(BTN_HOUSING_MORTGAGE_CALCULATOR), TabBrowser.change());
  }
}
