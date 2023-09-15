package BurgersExample;

import java.util.Scanner;

public class BurgersExample {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("*** Welcome to BurgerZone ***\n");
    double burgerPrice = 2.99;
    double bacon = 0.5;
    double cheese = 1.0;
    double pickles = 0.25;
    double drink = 1.50;
    double fries = 1.00;
    double superSizeSurCharge = 1.5;

    System.out.print("How many burger meals would you like to buy? ");

    int count = scan.nextInt();

    System.out.print("Do you want to add bacon? ");
    String addBacon = scan.next().trim().toLowerCase(); // removes blank space before and after

    System.out.print("Do you want cheese? ");
    String addCheese = scan.next().trim().toLowerCase();

    System.out.print("Do you want pickles? ");
    String addPickles = scan.next().trim().toLowerCase();

    System.out.print("Do you want to add fries? ");
    String addFries = scan.next().trim().toLowerCase();

    System.out.print("Do you want to add a drink? ");
    String addDrink = scan.next().trim().toLowerCase();

    String supersize;
    if (addFries.equals("y") || addDrink.equals("y")) {
      System.out.print("Do you want to supersize? ");
      supersize = scan.next().trim().toLowerCase();
    } else {
      supersize = "n";
    }

    double totalPerMeal = burgerPrice;

    if (addBacon.equals("y")) {
      totalPerMeal += bacon;
    }
    if (addCheese.equals("y")) {
      totalPerMeal += cheese;
    }
    if (addPickles.equals("y")) {
      totalPerMeal += pickles;
    }

    double friesAndDrink = 0;
    if (addFries.equals("y")) {
      friesAndDrink += fries;
    }
    if (addDrink.equals("y")) {
      friesAndDrink += drink;
    }
    if (supersize.equals("y")) {
      friesAndDrink *= superSizeSurCharge;
    }

    totalPerMeal += friesAndDrink;

    double totalPerOrder = count * totalPerMeal;
    System.out.printf("Your cost for %d meals is $%.2f.\n", count, totalPerOrder);

    scan.close();

  }
}