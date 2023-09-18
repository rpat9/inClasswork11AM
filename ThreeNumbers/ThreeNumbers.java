package ThreeNumbers;

/*
 * Purpose is to demonstrate how functions work
 */

import java.util.Scanner;

public class ThreeNumbers {

  public static int computeSum(int a, int b, int c) {
    return a + b + c;
  }

  public static int computeProd(int a, int b, int c) {
    return a * b * c;
  }

  public static void printWelcome() {
    System.out.println("*".repeat(60));
    System.out.println("                   Welcome to addProd!");
    System.out.println("*".repeat(60));
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    printWelcome();
    System.out.print("Enter 3 integers: \n");

    int num1, num2, num3;

    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();

    int sum, prod;

    sum = computeSum(num1, num2, num3);
    prod = computeProd(num1, num2, num3);

    System.out.printf("Sum is %d, and product is %d.", sum, prod);

    scan.close();
  }
}