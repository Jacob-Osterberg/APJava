package decisionStructures;

import java.util.Scanner;

public class gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What grade are you in?");
		int grade = input.nextInt();
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		if (grade == 12 && gpa >= 3.5) {
			System.out.println("You will graduate with honors.");
		} else {
			System.out.println("You wont graduate with honors.");

		}

	}

}
