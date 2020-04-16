package decisionStructures;

import java.util.Scanner;

public class cuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the lenght of the front yard in feet?");
		double length = input.nextDouble();
		System.out.println("What is the width of the front yard in feet?");
		double width = input.nextDouble();
		System.out.println("Did you cut the backyard(if yes enter 1, if no enter 0)");
		int back = input.nextInt();
		double money = length * width / 100;
		if (back > 0) {
			System.out.println("What is the radius of the backyard?");
			double radius = input.nextDouble();
			double backArea = radius * radius * Math.PI / 75 * 1.5;
			double tMoney = money + backArea;
			System.out.println("You have made " + tMoney + " dollars.");
		} else {
			System.out.println("You have made " + money + " dollars.");

		}

	}

}
