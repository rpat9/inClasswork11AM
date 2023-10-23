package EmployeeClassExample;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
  public static void main(String[] args) {
    /**
     * 
     * Employee emp1 = new Employee();
     * emp1.setFirstName("Ray");
     * emp1.setPayRate(17.35);
     * Employee emp2 = new Employee("Lauren", "Jones", 17.35, 15.25);
     * ArrayList<Employee> employees = new ArrayList<Employee>();
     * employees.add(emp1);
     * employees.add(emp2);
     * EmployeeWriter.writeToScreen(employees);
     * if (EmployeeWriter.writeToFile(employees,
     * "C:\\Users\\10024\\Desktop\\Patel_InClasswork\\EmployeeClassExample") ==
     * true) {
     * System.out.println("Success");
     * } else {
     * System.out.println("You are unlucky today.");
     * }
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name of file that has employee data: ");
    String fileName = sc.nextLine();

    ArrayList<Employee> emps = EmployeeReader.readFromFile(fileName);

    if (emps == null) {
      System.out.println("The file of employees could not be read. ");
    } else {
      EmployeeWriter.writeToScreen(emps);
    }

    sc.close();

  }

}
