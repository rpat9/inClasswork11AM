package FunWithArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * This application takes in 10 different integers and performs calculations
 * like mean and median.
 */
public class FunWithArrays {

  public static void printWelcome() {
    System.out.println("************************************");
    System.out.println("          Fun with arrays!");
    System.out.println("************************************");
  }

  public static void printMenu() {
    System.out.println("\nHere are your choices: ");
    System.out.println("1: Find mean");
    System.out.println("2: Find max ");
    System.out.println("3. Find min ");
    System.out.println("3: Print numbers ");
    System.out.println("5: Quit");
    System.out.print("Enter the number of your choice: ");
  }

  public static void print(int[] nums) {
    for (int i : nums) {
      System.out.println(i);
    }
  }

  public static int findMin(int[] nums) {
    int theMin = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < theMin) {
        theMin = nums[i];
      }
    }

    return theMin;
  }

  public static int findMax(int[] nums) {
    int theMax = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > theMax) {
        theMax = nums[i];
      }
    }

    return theMax;
  }

  public static double findMean(int[] nums) {
    double total = 0;

    for (int i : nums) {
      total += nums[i];
    }

    return total / nums.length;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    printWelcome();

    int choice;

    int[] numbers = new int[10];

    double mean, max, median;

    do {
      printMenu();

      Random randy = new Random();

      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = randy.nextInt(100);
      }

      choice = scan.nextInt();

      if (choice > 5) {
        System.out.println("You messed up! Choices are 1-5");
      } else if (choice == 1) {
        mean = findMean(numbers);
        System.out.printf("The mean is %f.", mean);
      } else if (choice == 2) {
        max = findMax(numbers);
        System.out.printf("The max is $f.", max);
      } else if (choice == 3) {
        median = findMin(numbers);
        System.out.printf("The median is %f.", median);
      } else if (choice == 4) {
        print(numbers);
      }

    } while (choice != 5);

    scan.close();
  }
}
