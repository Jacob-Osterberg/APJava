package oopoutput;

public class Rabbits {
	private double population;

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public Rabbits() {
		population = -999;

	}

	public Rabbits(int xpopulation) {
		population = xpopulation;

	}

	public void matingSeason() {
		population = population * 3;

	}

	public void huntingSeason() {
		population = population - (population * .43);

	}

}
