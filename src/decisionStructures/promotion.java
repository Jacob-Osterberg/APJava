package decisionStructures;

import java.util.Scanner;

public class promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you work in sales or delivery(enter 1 for sales and 0 for delivery)?");
		int job = input.nextInt();
		System.out.println("How many years have you been working?");
		int exp = input.nextInt();
		if ((job == 1 && exp >= 3) || (job == 0 && exp >= 5)) {
			System.out.println("Congrats, you get a promotion.");
		} else {
			System.out.println("Sorry, you dont get a promotion.");

		}

	}

}
