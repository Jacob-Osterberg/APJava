package decisionStructures;

import java.util.Scanner;

public class whatAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age < 1) {
			System.out.println("Congrats, your an infant.");
		} else {
			if (age >= 1 && age <= 2) {
				System.out.println("Congrats, your a toddler.");
			} else {
				if (age >= 3 && age < 12) {
					System.out.println("Congrats, your a kid.");
				} else {
					if (age >= 13 && age < 18) {
						System.out.println("Congrats, your a teen.");
					} else {
						System.out.println("Congrats, your an adult.");
					}
				}
			}

		}

	}

}
