package MoreFiles;

import java.util.Scanner;
import java.io.File;

public class MoreFiles {

  /**
   * This function returns the text of the file or null.
   * 
   * @param fileName The function takes in the file name.
   * @return String containing all the contents of the file with spaces.
   */
  public static String readFile(String fileName) {

    try {
      Scanner fsc = new Scanner(new File(fileName));

      String line;
      String alltogether = "";

      while (fsc.hasNextLine()) {
        line = fsc.nextLine();
        alltogether = alltogether + line + " ";
        alltogether = alltogether.trim();
      }

      fsc.close();

      return alltogether;

    } catch (Exception e) {
      return null;
    }
  }

  public static void main(String[] args) {

    String fileName;
    Scanner scan = new Scanner(System.in);

    System.out.print("What file do you want to read? ");
    fileName = scan.nextLine();

    String content = readFile(fileName);

    if (content == null) {
      System.out.println("Could not read the file");
    } else
      System.out.println(content);

    scan.close();

  }
}