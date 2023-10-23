package EmployeeClassExample;

import java.util.ArrayList;

/**
 * This view class presents paycheck data for a list of employees.
 */

public class PaycheckPrinter {

  private double taxRate;

  public double getTaxtRate() {
    return taxRate;
  }

  public void setTaxRate(double taxRate) {
    if (taxRate > 0) {
      this.taxRate = taxRate;
    } else {
      this.taxRate = 0;
    }
  }

  public PaycheckPrinter() {
    taxRate = 0.1;
  }

  public PaycheckPrinter(double taxRate) {
    setTaxRate(taxRate);
  }

  public void printPayCheck(ArrayList<Employee> emps) {

    double gross, net, taxes;

    for (Employee emp : emps) {
      gross = emp.getGrossPay();
      taxes = gross * taxRate;
      net = gross - taxes;

      System.out.printf("Pay employee %s $s the amount of $%.2f\n", emp.getFirstName(), emp.getLastName(), net);
    }

  }

}
