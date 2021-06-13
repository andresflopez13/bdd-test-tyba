package co.com.tyba.test.metrocuadrado.drivers;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalBrowser {

  @Managed private static WebDriver driver;

  public static LocalBrowser getConnection() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("start-maximized");
    options.addArguments("--disable-popup-blocking");
    options.addArguments("--disable-default-apps");
    options.addArguments("disable-web-security");
    options.addArguments("--allow-running-insecure-content");
    options.addArguments("webdriver.load.strategy", "none");
    options.addArguments("--lang=es");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    return new LocalBrowser();
  }

  public WebDriver onUrl(String url) {
    driver.get(url);
    return driver;
  }

  public static WebDriver getDriver() {
    return driver;
  }
}
