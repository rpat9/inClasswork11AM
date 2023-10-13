package LinkedHashMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.io.File;

public class HashMaps {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the name of the file: ");
    String fileName = scan.nextLine();

    boolean success;
    String line;
    String[] parts;
    String name;
    double price;

    LinkedHashMap<String, Double> groceries = new LinkedHashMap<String, Double>();

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

        groceries.put(name, price);
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

    String selection;
    System.out.print("Enter the name of the item or q to quit: ");
    selection = scan.nextLine();

    while (!selection.equals("q")) {
      if (!groceries.containsKey(selection)) {
        System.out.println("That item is out of stock.");
      } else {
        price = groceries.get(selection);
        System.out.printf("The item %s costs %.2f\n", selection, price);
      }
      System.out.print("Enter another selection: ");
      selection = scan.nextLine();
    }

    System.out.println("Thank you for shopping.");

    scan.close();
  }
}
