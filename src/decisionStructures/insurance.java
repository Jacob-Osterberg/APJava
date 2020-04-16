package decisionStructures;

import java.util.Scanner;

public class insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		int base = 200;
		int old = 125;
		int fat = 300;
		int smoker = 50;
		int young = -25;
		int nSmoker = -40;
		if (age > 75) {
			System.out.println("What is your weight to the nearest pound?");
			int weight = input.nextInt();
			System.out.println("Have you ever smoked(if yes enter 1, if no enter 0)?");
			int smoke = input.nextInt();
			if (weight >= 700 && smoke == 1) {
				System.out.println("You will end up paying " + (base + old + fat + smoker) + " dollars.");
			} else {
				if (smoke == 1) {
					System.out.println("You will end up paying " + (base + old + smoker) + " dollars.");
				} else {
					System.out.println("You will end up paying " + (base + old + nSmoker) + " dollars.");
				}
			}
		} else {
			if (age < 30) {
				System.out.println("What is your weight to the nearest pound?");
				int weight = input.nextInt();
				System.out.println("Have you ever smoked(if yes enter 1, if no enter 0)?");
				int smoke = input.nextInt();
				if (weight >= 700 && smoke == 1) {
					System.out.println("You will end up paying " + (base + young + smoker + fat) + " dollars.");
				} else {
					if (smoke == 1) {
						System.out.println("You will end op paying " + (base + young + smoker) + " dollars.");
					} else {
						System.out.println("You will end op paying " + (base + young + nSmoker) + " dollars.");
					}
				}
			} else {
				System.out.println("What is your weight to the nearest pound?");
				int weight = input.nextInt();
				System.out.println("Have you ever smoked(if yes enter 1, if no enter 0)?");
				int smoke = input.nextInt();
				if (weight >= 700 && smoke == 1) {
					System.out.println("You will end op paying " + (base + fat + smoker) + " dollars.");
				} else {
					if (smoke == 1) {
						System.out.println("You will end op paying " + (base + smoker) + " dollars.");
					} else {
						System.out.println("You will end op paying " + (base + nSmoker) + " dollars.");
					}
				}
			}
		}
	}

}
