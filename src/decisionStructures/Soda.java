package decisionStructures;

public class Soda {
	private double radius = -99.9;
	private double height = -99.9;
	private final double cost = 2.6;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double xradius) {
		if (xradius < 0 && xradius > 100) {
			xradius = 2;
		}
		this.radius = xradius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double xheight) {
		if (xheight < 0 && xheight > 100) {
			xheight = 4;
		}
		this.height = xheight;
	}

	public double surfaceA(double height, double radius) {
		double sArea = 2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius);
		return sArea;
	}

	public double volume(double height, double radius) {
		double vol = Math.PI * (radius * radius) * height;
		return vol;
	}

	public double cost(double height, double radius) {
		double tCost = (2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius)) * cost;
		return tCost;
	}

}
