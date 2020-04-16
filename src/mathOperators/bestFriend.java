package mathOperators;

import java.util.Scanner;

public class bestFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 234.3;
		double width = 234.3;
		double radius = 234.3;
		System.out.println("What is the length of the magical tear box to the nearest half yard?");
		length = input.nextDouble();
		System.out.println("What is the width of the magical tear box to the nearest half yard?");
		width = input.nextDouble();
		System.out.println("What is the radius of the magical crystal ball to the nearest half yard?");
		radius = input.nextDouble();
		double ssa = 4 * 3.14 * (radius * radius) / 36;
		double csa = length * width * 6 / (36*36); 
		double tsa = ssa + csa;
		System.out.println("You will need " + ssa + " square inches of wraping paper to wrap the magic crystal ball.");
		System.out.println("You will need " + csa + " square inches of wraping paper to wrap the magic tear box.");
		System.out.println("You will need " + tsa + " square inches of wraping paper to wrap both the magic crystal ball and the magical tear box.");
	}

}
