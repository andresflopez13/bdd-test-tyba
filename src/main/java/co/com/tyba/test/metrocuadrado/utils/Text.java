package co.com.tyba.test.metrocuadrado.utils;

public class Text {

  private Text() {
    throw new IllegalStateException("Utility class");
  }

  public static String getNumericValue(String text) {
    return text.replaceAll("\\D", "");
  }
}
