package FunWithFiles;

/*
 * This program illustrates how to read form and write to a text file.
 */

import java.util.Scanner;
import java.io.File;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class FunWithFiles {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String fileName;

    System.out.print("Enter the path to the file you want to read: ");
    fileName = scan.nextLine();

    System.out.print("Enter the path to the output file: ");
    String outFileName = scan.nextLine();

    scan.close();

    String line;

    try {

      Scanner fileScanner = new Scanner(new File(fileName));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outFileName))));

      // Scanner fileScanner = new Scanner(new File(fileName));

      while (fileScanner.hasNextLine()) {
        line = fileScanner.nextLine().toUpperCase();
        System.out.println(line);
        pw.println(line);
      }

      fileScanner.close();
      pw.close();

    } catch (Exception e) {

      System.out.println("There was a problem accessing the file.");
    }

  }
}