package decisionStructures;

import java.util.Scanner;

public class youWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money did you get for your fifth birthday?");
		double money = input.nextDouble();
		if (money == 9.18) {
			System.out.println("You won a box of good air.");
		} else {
			System.out.println("You won a box of spicy air.");

		}

	}

}
