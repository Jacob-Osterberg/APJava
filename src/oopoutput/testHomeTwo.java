package oopoutput;

import java.util.Scanner;

public class testHomeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House bob = new House();
		bob.fillSandbox();
		System.out.println("What is the lenght of the sandbox to the closest foot?");
		int length = input.nextInt();
		System.out.println("What is the width of the sandbox to the nearest foot?");
		int width = input.nextInt();
		System.out.println("What is the depth of the sandbox to the nearest foot?");
		int depth = input.nextInt();
		System.out.println(
				"What is the rate(cubic feet of sand per hour) of sad being added to the sandbox to the nearest cubic foot?");
		int rate = input.nextInt();
		bob.fillSandboxV2(length, width, depth, rate);

		double fred = bob.fillSandboxV3(length, width, depth, rate);
		System.out.println("It will take aproximatly " + fred + " hour(s) to fill the sandbox.");
	}

}
