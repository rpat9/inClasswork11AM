package GradesAndSplit;

import java.io.*;
import java.util.Scanner;

public class Grades {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String inputFile, outputFile;

    System.out.print("Enter the name of input file: ");
    inputFile = scan.nextLine();

    System.out.print("Enter the name of the output file: ");
    outputFile = scan.nextLine();

    String line;

    String[] parts;
    String name;
    double grade1, grade2, grade3, total, average;

    try {
      Scanner fsc = new Scanner(new File(inputFile));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outputFile))));

      while (fsc.hasNextLine()) {
        line = fsc.nextLine().trim();

        if (line.length() > 0) {
          parts = line.split("\t");
          name = parts[0];
          grade1 = Double.parseDouble(parts[1]);
          grade2 = Double.parseDouble(parts[2]);
          grade3 = Double.parseDouble(parts[3]);

          total = grade1 + grade2 + grade3;
          average = total / 3;
          pw.println(("Here is the average of the test grades: " + average));
        }
      }

      fsc.close();
      pw.close();

    } catch (Exception e) {
      // e.printStackTrace();
      System.out.println("File could not be read.");
    }

    scan.close();
  }

}
