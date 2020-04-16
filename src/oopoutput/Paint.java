package oopoutput;

import java.util.Scanner;

public class Paint {
	public Paint() {
	}

	public void sayWelcome() {
		System.out.println("Welcome to the Paint class");
	}

	public void paintWall() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall to the nearest foot?");
		int width = input.nextInt();
		System.out.println("What is the length of the wall to the nearest foot?");
		int lenght = input.nextInt();
		System.out.println("How many coats of paint are being used?");
		int coat = input.nextInt();
		int area = width * lenght / 150 * coat;
		System.out.println("You will need " + area + " gallons of paint to fully paiant the wall");

	}

	public void conversion() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number of square yards?");
		int yards = input.nextInt();
		int feet = yards / 9;
		System.out.println("That is equal to " + feet + " square feet.");
	}
}
