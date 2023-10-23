package EmployeeClassExample;

import java.util.ArrayList;
import java.io.*;

public class EmployeeWriter {
  public static void writeToScreen(ArrayList<Employee> emps) {
    for (Employee emp : emps) {
      System.out.println(emp);
    }
  }

  public static boolean writeToFile(ArrayList<Employee> emps, String fname) {
    try {
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
      for (Employee emp : emps) {
        pw.println(emp);
      }
      pw.close();
      return true;
    } catch (Exception ex) {
      return false;
    }
  }
}
