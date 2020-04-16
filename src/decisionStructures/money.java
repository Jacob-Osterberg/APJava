package decisionStructures;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		if (age + gpa > 20) {
			System.out.println("Congrats, you get 250 dollars for your birthday.");
		} else {
			System.out.println("Sorry, you get 30 dollars for your birthday.");

		}

	}

}
