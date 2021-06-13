package co.com.tyba.test.metrocuadrado.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.tyba.test.metrocuadrado.drivers.LocalBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GeneralStepDefinition {

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) ingresa al portal web de metro cuadrado$")
  public void enterTheMetroCuadradoWebPortal(String name) {
    theActorCalled(name)
        .can(
            BrowseTheWeb.with(
                LocalBrowser.getConnection().onUrl("https://www.metrocuadrado.com/")));
  }
}
