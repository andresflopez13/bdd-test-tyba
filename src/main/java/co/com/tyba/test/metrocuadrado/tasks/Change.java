package co.com.tyba.test.metrocuadrado.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Change {

  private Change() {}

  public static InformationForTheCreditSimulator informationForTheCreditSimulatorWith(
      Integer salary) {
    return instrumented(InformationForTheCreditSimulator.class, salary);
  }

  public static InformationForTheQuotaSimulator InformationForTheQuotaSimulatorWith(
      Integer amount) {
    return instrumented(InformationForTheQuotaSimulator.class, amount);
  }
}
