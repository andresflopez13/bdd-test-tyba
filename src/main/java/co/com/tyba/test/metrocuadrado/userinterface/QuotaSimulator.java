package co.com.tyba.test.metrocuadrado.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class QuotaSimulator {

  private QuotaSimulator() {
    throw new IllegalStateException("Utility class");
  }

  public static final Target TAB_QUOTA_SIMULATOR =
      Target.the("").locatedBy("//a[contains(text(),'Calcula el valor de las')]");

  public static final Target TEXT_LOAN_AMOUNT =
      Target.the("text loan amount")
          .locatedBy("//h2[contains(text(),'Calcula el valor de las cuotas')]/parent::div//input");

  public static final Target SELECT_TERM_IN_YEARS =
      Target.the("select term in years")
          .locatedBy(
              "//h2[contains(text(),'Calcula el valor de las cuotas')]/parent::div//option[contains(text(),'{0}')]");

  public static final Target BTN_CALCULATE_QUOTA =
      Target.the("Calculate quota button").locatedBy("//button[contains(@class, 'cuotas')]");
}
