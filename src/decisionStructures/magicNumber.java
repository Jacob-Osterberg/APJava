package decisionStructures;

import java.util.Scanner;

public class magicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the magic number?");
		int magic = input.nextInt();
		if (magic == 18) {
			System.out.println("Congrats, you won the prize.");
			System.out.println("Now you get a free air.");
		} else {
			System.out.println("Sorry, you guessed wrong.");
		}
	}

}
