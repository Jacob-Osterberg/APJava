package decisionStructures;

import java.util.Scanner;

public class luckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("What is your height to the nearest foot?");
			int height = input.nextInt();
			System.out.println("Your lucky number is " + (height * 5) + ".");
		} else {
			System.out.println("What is your weight to the nearest pound?");
			int weight = input.nextInt();
			System.out.println("Your lucky number is " + (weight / 2) + ".");

		}

	}

}
