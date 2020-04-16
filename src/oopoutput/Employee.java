package oopoutput;

public class Employee {

	private double wage;
	private int experience;

	public Employee() {
		wage = -999;
	}

	public double getWage() {
		return wage;

	}

	public void setWage(double xwage) {
		wage = xwage;
	}

	public int getExperience() {
		return experience;

	}

	public void setExperience(int xexperience) {
		experience = xexperience;
	}

	public void giveRaise() {
		wage = wage * 1.1;

	}
}
