package PayrollUsingLoops;

import java.util.Scanner;

/*
 * This demonstrates using for loops
 */

public class PayrollDoLoops {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double gross, pay, hours;
    String choice;

    do {
      System.out.print("Enter hours and rate: ");
      hours = scan.nextDouble();
      pay = scan.nextDouble();
      gross = hours * pay;

      System.out.printf("Your gross pay is %.2f.\n", gross);

      System.out.print("Do you have other employees to process (y or n): ");
      choice = scan.next().trim().toUpperCase();

    } while (choice.equals("Y"));

    System.out.println("Thank you for using this app!");

    scan.close();
  }
}