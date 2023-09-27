package FunWithNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program asks the user for two numbers and then offers a menu of options
 * concerning what arithmetic to do with them.
 */

public class FunWithNumbers {

  public static void printWelcome() {
    System.out.print("*".repeat(60));
    System.out.println();
    System.out.println(" ".repeat(22) + "Fun with Numbers");
    System.out.print("*".repeat(60));
    System.out.println();

  }

  public static void printMenu() {
    System.out.println("\nHere are your choices");
    System.out.println("1: add the numbers");
    System.out.println("2: subtract the numbers");
    System.out.println("3: multiply the numbers");
    System.out.println("4: divide the numbers");
    System.out.println("5: quit");
    System.out.print("Enter the number of your choice: ");
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    printWelcome();

    double num1 = 0, num2 = 0;
    double sum, diff, prod, quo;

    int choice;
    boolean proceed;

    do {

      try {
        proceed = true;
        System.out.print("Enter the two numbers: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
      } catch (InputMismatchException e) { // I wanted to be more specific with the type of exception.
        proceed = false;
        scan.nextLine(); // Cleans out garbage in the input stream.
        System.out.println("\nYou needed to enter two numbers...");
        // return; use this if you want to exit out of the program.
      }

    } while (proceed == false);

    do {

      printMenu();
      choice = scan.nextInt();

      if (choice == 1) {
        sum = num1 + num2;
        System.out.printf("%.2f + %.2f is %.2f\n", num1, num2, sum);

      } else if (choice == 2) {
        diff = num1 - num2;
        System.out.printf("%.2f - %.2f is %.2f\n", num1, num2, diff);

      } else if (choice == 3) {
        prod = num1 * num2;
        System.out.printf("%.2f x %.2f is %.2f\n", num1, num2, prod);

      } else if (choice == 4) {

        if (num1 == 0 || num2 == 0) {
          System.out.println("You cannot divide by 0.\n");

        } else {
          quo = num1 / num2;
          System.out.printf("%.2f / %.2f is %.2f\n", num1, num2, quo);

        }

      } else {
        break;
      }

    } while (choice != 5);

    scan.close();
  }
}
