package decisionStructures;

import java.util.Scanner;

public class pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many pets do you have?");
		int pet = input.nextInt();
		System.out.println("How many cars can fit in your garage?");
		int car = input.nextInt();
		if (pet >= 5 || car > 3) {
			System.out.println("Congrats, you have at least 5 pets or more than 3 cars.");
		} else {
			System.out.println("Sorry, you dont have at least 5 pets or more than 3 cars.");

		}

	}

}
