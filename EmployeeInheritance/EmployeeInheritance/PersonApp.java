package EmployeeInheritance;

import java.util.ArrayList;

public class PersonApp {
	public static void main(String[] args) {
		Employee emp = new Employee("Brody", "Klump", 15, 25.25);
		Customer cus = new Customer("Ray", "Klump", "123 Hollywood Lane", 60000);
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(emp);
		persons.add(cus);
		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
