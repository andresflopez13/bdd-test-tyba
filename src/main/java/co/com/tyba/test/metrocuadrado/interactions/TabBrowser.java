package co.com.tyba.test.metrocuadrado.interactions;

import co.com.tyba.test.metrocuadrado.drivers.LocalBrowser;
import java.util.Set;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class TabBrowser implements Interaction {

  @Override
  @Step("{0} changes to the new tab")
  public <T extends Actor> void performAs(T actor) {
    WebDriver driver = LocalBrowser.getDriver();
    Set<String> setWindows = driver.getWindowHandles();
    setWindows.remove(driver.getWindowHandle());
    driver.switchTo().window(setWindows.iterator().next());
  }

  public static TabBrowser change() {
    return Tasks.instrumented(TabBrowser.class);
  }
}
