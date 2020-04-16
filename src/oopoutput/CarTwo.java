package oopoutput;

public class CarTwo {
	private int mpg;
	private int tank;
	private int fuel;
	private int odometer;

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	public int getTank() {
		return tank;
	}

	public void setTank(int tank) {
		this.tank = tank;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public CarTwo() {
		mpg = 20;
		tank = 20;
		fuel = 20;
		odometer = 0;
	}

	public CarTwo(int xmpg, int xtank, int xfuel, int xodometer) {
		mpg = xmpg;
		tank = xtank;
		fuel = xfuel;
		odometer = xodometer;

	}

	public void fill(int gallons) {
		tank = tank + gallons;

	}

	public void drive(int miles) {
		odometer = odometer + miles;
		tank = tank - miles / mpg;

	}

}
