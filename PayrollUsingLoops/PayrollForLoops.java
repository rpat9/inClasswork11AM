package PayrollUsingLoops;

import java.util.Scanner;

/*
 * This demonstrates using for loops
 */

public class PayrollForLoops {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("How many employees do you have? ");
    int count = scan.nextInt();

    double hours, rate, gross;

    for (int i = 0; i < count; i++) {
      System.out.print("Enter hours and rate: ");
      hours = scan.nextDouble();
      rate = scan.nextDouble();
      gross = hours * rate;
      System.out.printf("Your gross pay is %.2f.\n", gross);
    }

    System.out.println("Thank you for using this app!");

    scan.close();
  }
}