package decisionStructures;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age <= 17) {
			System.out.println("Congrats, you have an A in the class.");
			System.out.println("Have a nice day.");
		} else {
			System.out.println("Sorry, you dont have an A in the class.");
			System.out.println("Have a nice day.");
		}

	}

}
