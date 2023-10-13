package ParallelLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class ParallelLists {

  public static void printGroceriesAndPrices(ArrayList<String> names, ArrayList<Double> prices) {

    for (int i = 0; i < names.size(); i++) {
      System.out.printf("%-15s%10.2f", names.get(i), prices.get(i));
    }
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the name of the file: ");
    String fileName = scan.nextLine();

    boolean success;
    String line;
    String[] parts;
    String name;
    double price;

    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Double> prices = new ArrayList<Double>();

    try {
      Scanner fsc = new Scanner(new File(fileName));

      while (fsc.hasNextLine()) {

        line = fsc.nextLine().trim();

        if (line.length() == 0) {
          continue;
        }

        parts = line.split("\t");
        name = parts[0];
        price = Double.parseDouble(parts[1]);

        names.add(name);
        prices.add(price);

      }

      fsc.close();
      success = true;

    } catch (Exception e) {
      System.out.println("The file of grocery items could not be read.");
      success = false;
    }

    if (!success) {
      System.out.println("Could not continue.");
      scan.close();
      return; // System.exit(0)=success or System.exit(1)=faliure
    }

    System.out.println("Here is the list of grocerics and their prices: ");

    printGroceriesAndPrices(names, prices);

    scan.close();
  }
}