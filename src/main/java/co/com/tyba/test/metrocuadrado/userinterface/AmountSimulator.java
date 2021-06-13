package co.com.tyba.test.metrocuadrado.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmountSimulator {

  private AmountSimulator() {
    throw new IllegalStateException("Utility class");
  }

  public static final Target TEXT_MONTHLY_SALARY =
      Target.the("text monthly salary").located(By.id("ingresosMensuales"));

  public static final Target SELECT_TERM_IN_YEARS =
      Target.the("select term in years")
          .locatedBy(
              "//h2[contains(text(),'Calcula cuánto te prestan')]/parent::div//option[contains(text(),'{0}')]");

  public static final Target BTN_CALCULATE_CREDIT =
      Target.the("Calculate credit button").locatedBy("//h4[contains(text(),'Calcular Crédito')]");

  public static final Target DATA_TABLE_RESULT =
      Target.the("results table")
          .locatedBy("//dd[@class='ng-binding' or @class='valor ng-binding']");

  public static final Target DATA_TABLE_RESULT_BANK =
      Target.the("results table bank").locatedBy("//td[@class='ng-binding']");
}
