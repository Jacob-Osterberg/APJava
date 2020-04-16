package decisionStructures;

import java.util.Scanner;

public class shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height to the closest inch?");
		int height = input.nextInt();
		System.out.println("What is your shoe size?");
		int size = input.nextInt();
		if (size > 9 && height < 62) {
			System.out.println("Congrats, your shoe size plus your height is greater than or equal to 26.");
		} else {
			System.out.println("Sorry, your shoe size plus your height isn't greater than or equal to 26.");

		}

	}

}
