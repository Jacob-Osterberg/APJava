package oopoutput;

public class IsocelesTrapazoid {
	private double base;
	private double xbase;
	private double height;
	private double leg;

	public IsocelesTrapazoid() {
		base = -99.9;
		xbase = -99.9;
		height = -99.9;
		leg = -99.9;

	}

	public IsocelesTrapazoid(double xbase, double ybase, double xheight, double xleg) {
		base = xbase;
		xbase = ybase;
		height = xheight;
		leg = xleg;
	}

	public double getBase() {
		return base;

	}

	public void setBase(double wbase) {
		base = wbase;
	}

	public double getXbase() {
		return xbase;

	}

	public void setXbase(double zbase) {
		xbase = zbase;
	}

	public double getHeight() {
		return height;

	}

	public void setHeight(double yheight) {
		height = yheight;
	}

	public double getLeg() {
		return leg;

	}

	public void setLeg(double yleg) {
		leg = yleg;
	}

	public double perimeter() {
		double perm = xbase + base + leg + leg;
		return perm;

	}

	public double area() {
		double area = (base + xbase) / 2 * height;
		return area;

	}

}
