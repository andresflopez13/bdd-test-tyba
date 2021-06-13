package co.com.tyba.test.metrocuadrado.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
  public static final Target BTN_SELECT_TOOLS =
      Target.the("main menu tools button").locatedBy("//a[contains(text(),'Herramientas')]");

  public static final Target BTN_HOUSING_MORTGAGE_CALCULATOR =
      Target.the("home credit calculator button")
          .locatedBy("//a[@href='/calculadora-credito-hipotecario-vivienda/']");
}
