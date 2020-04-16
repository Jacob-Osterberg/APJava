package decisionStructures;

import java.util.Scanner;

public class postIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		int length = input.nextInt();
		System.out.println("What is the width of the rectangle?");
		int width = input.nextInt();
		System.out.println("are the lengths above in feet of inches(1 for feet, 0 for inches)?");
		int unit = input.nextInt();

		if (unit == 1) {
			System.out.println(
					"You will need " + ((length * 12) / 3) * ((width * 12) / 3) + " post its to fill the rectangle.");
		} else {
			System.out.println("You will need " + ((length / 3) * (width / 3) + " post its to cover the rectangle."));

		}

	}

}
