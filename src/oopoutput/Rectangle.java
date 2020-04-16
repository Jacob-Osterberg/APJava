package oopoutput;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {

		length = -999;
		width = -999;
	}

	public Rectangle(double ylength, double ywidth) {
		length = ylength;
		width = ywidth;
	}

	double getlength() {
		return length;

	}

	public void setlength(double xlength) {
		length = xlength;
	}

	public double getWidth() {
		return width;

	}

	public void setWidth(double xwidth) {
		width = xwidth;
	}

	public double perimeter() {

		double perm = 2 * length + 2 * width;
		return perm;

	}

	public double area() {

		double newarea = length * width;
		return newarea;

	}

}
