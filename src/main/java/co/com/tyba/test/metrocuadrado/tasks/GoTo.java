package co.com.tyba.test.metrocuadrado.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo {

  private GoTo() {}

  public static HowMuchDoTheyLendYou howMuchDoTheyLendYouCalculator() {
    return instrumented(HowMuchDoTheyLendYou.class);
  }

  public static MonthlyQuotaCalculator monthlyQuotaCalculator() {
    return instrumented(MonthlyQuotaCalculator.class);
  }
}
