package co.com.tyba.test.metrocuadrado.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class Wait implements Interaction {

  private int time;

  public Wait(int time) {
    this.time = time;
  }

  @Override
  @Step("{0} wait for #time time in seconds or milliseconds")
  public <T extends Actor> void performAs(T actor) {
    new InternalSystemClock().pauseFor(time);
  }

  public static Wait forA(int time) {
    return new Wait(time);
  }

  public Wait seconds() {
    this.time = time * 1000;
    return this;
  }
}
