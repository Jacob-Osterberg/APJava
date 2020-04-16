package decisionStructures;

import java.util.Scanner;

public class rescue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people need to be saved?");
		int people = input.nextInt();
		int total = people % 10;
		if (total > 0) {
			System.out.println("You will need " + (people / 10) + " helis.");
			System.out.println((total % 10) + " will die.");
		} else {
			System.out.println("Everyone lives.");

		}

	}

}
