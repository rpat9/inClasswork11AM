package EmployeeClassExample;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeReader {

  public static ArrayList<Employee> readFromFile(String fname) {

    ArrayList<Employee> emps = new ArrayList<Employee>();

    try {
      Scanner fsc = new Scanner(new File(fname));

      String line;
      String[] parts;
      String first, last;
      double hours, rate;
      Employee emp;

      while (fsc.hasNextLine()) {
        line = fsc.nextLine();
        if (line.length() == 0) {
          continue;
        }
        parts = line.split("\t");
        first = parts[0];
        last = parts[1];
        hours = Double.parseDouble(parts[2]);
        rate = Double.parseDouble(parts[3]);

        emp = new Employee(first, last, hours, rate);
        emps.add(emp);
      }
      return emps;

    } catch (Exception e) {
      return null;
    }

  }

}