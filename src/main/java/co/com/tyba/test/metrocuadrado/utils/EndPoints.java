package co.com.tyba.test.metrocuadrado.utils;

public enum EndPoints {
  URL_BASE("https://www.metrocuadrado.com/");

  private String value;

  EndPoints(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
