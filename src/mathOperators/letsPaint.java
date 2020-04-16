package mathOperators;

import java.util.Scanner;

public class letsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width = 20.0;
		double length = 30.0;
		System.out.println("What is the width of the room in feet?(put in 0.0 form)");
		width = input.nextDouble();
		System.out.println("What is the length of the room in feet?(put in 0.0 form)");
		length = input.nextDouble();
		double gallons = (width * 8 * 2 + length * 8 * 2) / 150;
		System.out.println("You will need " + gallons + " gallons of paint to fully paint the walls of the room.");

	}

}
