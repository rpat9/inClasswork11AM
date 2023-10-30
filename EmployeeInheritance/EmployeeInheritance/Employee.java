package EmployeeInheritance;

import java.util.ArrayList;

public class Employee extends Person {
    // I already have private firstName and lastName that I inherited + get, set,
    // constructors, toString
    // I cannot directly access firstName and lastName b/c private to Person
    private double hoursWorked;
    private double payRate;
    private ArrayList<String> responsibilities;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            this.hoursWorked = 0;
        } else {
            this.hoursWorked = hoursWorked;
        }
    }

    public double getPayRate() {
        return payRate;
    }

    public Employee() {
        this("", "", 0, 0);
    }

    public Employee(String firstName, String lastName, double hours, double rate) {
        super(firstName, lastName);
        setHoursWorked(hours);
        setPayRate(rate);
        responsibilities = new ArrayList<String>();
    }

    public void setPayRate(double payRate) {
        if (payRate < 0) {
            this.payRate = 0;
        } else {
            this.payRate = payRate;
        }
    }

    public void addResponsibility(String responsibility) {
        responsibilities.add(responsibility);
    }

    public String getResponsibilitiesAsString() {
        String result = "";
        for (String resp : responsibilities) {
            result = result + resp + "; ";
        }
        return result;
    }

    public double calculateGrossPay() {
        return hoursWorked * payRate;
    }

    @Override
    public String toString() {
        return String.format("%s\t%.2f\t%.2f\t%s", super.toString(), hoursWorked, payRate,
                getResponsibilitiesAsString());
    }
}
