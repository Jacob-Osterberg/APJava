package decisionStructures;

import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you weigh?");
		int weight = input.nextInt();
		System.out.println("what planet are you on?");
		System.out.println("Mercury(1)");
		System.out.println("Venus(2)");
		System.out.println("Mars(3)");
		System.out.println("Jupiter(4)");
		System.out.println("Saturn(5)");
		int planet = input.nextInt();
		switch (planet) {
		case 1:
			System.out.println("You weigh " + (weight * .37) + " pounds.");
			break;
		case 2:
			System.out.println("You weigh " + (weight * .88) + " pounds.");
			break;
		case 3:
			System.out.println("You weigh " + (weight * .38) + " pounds.");
			break;
		case 4:
			System.out.println("You weigh " + (weight * 264) + " pounds.");
			break;
		case 5:
			System.out.println("You weigh " + (weight * 115) + " pounds.");
			break;
		default:
			System.out.println("You weigh " + weight + " pounds.");
			break;
		}

	}

}
