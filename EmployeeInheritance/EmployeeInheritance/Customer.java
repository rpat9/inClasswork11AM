package EmployeeInheritance;

public class Customer extends Person {
	private String address;
	private double earnings;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		if (earnings < 0) {
			this.earnings = 0;
		} else {
			this.earnings = earnings;
		}
	}

	public Customer() {
		this("", "", "", 0);
	}

	public Customer(String firstName, String lastName, String address, double earnings) {
		super(firstName, lastName);
		setAddress(address);
		setEarnings(earnings);
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%.2f", super.toString(), address, earnings);
	}

}
