package decisionStructures;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number?");
		int into = input.nextInt();
		System.out.println("What is the second number?");
		int intw = input.nextInt();
		System.out.println("What is the third number?");
		int inth = input.nextInt();
		if (into > intw) {
			if (into < inth) {
				System.out.println(inth + " is the largest number");
			} else {
				System.out.println(into + " is the largets number");
			}
		} else {
			if (intw > inth) {
				System.out.println(intw + " is the largest number");

			} else {
				System.out.println(inth + " is the largest number");

			}
		}
	}
}
