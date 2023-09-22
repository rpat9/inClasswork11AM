package TempConverter;

import java.util.Scanner;

/**
 * This application converts between temperature scales
 */

public class TemperatureConverterApp2 {

  /**
   * This function converts a fahrenheit temperature to celsius
   * 
   * @param fahr the temperature in fahrenheit
   * @return the temperature in celsius
   */

  public double converToCelsius(double fahr) {
    double celsius = (fahr - 32) * 5 / 9.0;
    return celsius;
  }

  /**
   * This function converts a celsius to fahrenheit
   * 
   * @param C the temperature in celsius
   * @return the temperature in fahrenheit
   */

  public double convertToFahr(double C) {
    double fahr = 9.0 / 5 * C + 32;
    return fahr;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    TemperatureConverterApp2 me = new TemperatureConverterApp2();
    System.out.print("Enter the temperature and the scale: ");

    double temp = scan.nextDouble();
    String scale = scan.next().toUpperCase();

    if (scale.equals("f")) {
      double converted = me.converToCelsius(temp);
      System.out.printf("\nCelsius Temperature: %f", converted);

    } else if (scale.equals("c")) {
      double converted = me.convertToFahr(temp);
      System.out.printf("Fahrenheit Temperature: %f", converted);
    } else {
      System.out.println(0.0);
    }

    scan.close();
  }

}
