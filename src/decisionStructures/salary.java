package decisionStructures;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you make in a year?");
		int money = input.nextInt();
		if (money < 20000) {
			System.out.println("Congrats, your a worker.");
		} else {
			if (money >= 20000 && money < 40000) {
				System.out.println("Congrats, your managment.");
			} else {
				if (money >= 40000 && money < 100000) {
					System.out.println("Congrats, your the CEO.");
				} else {
					System.out.println("Congrats, your the owner.");
				}
			}

		}

	}

}
