package decisionStructures;

import java.util.Scanner;

public class gradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your average test score?");
		int test = input.nextInt();
		System.out.println("What is your average homework score?");
		int hw = input.nextInt();
		System.out.println("Is the teacher nice(1 for yes, 2 for no)?");
		int teach = input.nextInt();
		if ((teach == 1 && test > hw) || (teach == 0 && hw > test)) {
			System.out.println("Congrats, your grade is " + test + ".");
		} else {
			System.out.println("Congrats, your grade is " + hw + ".");

		}

	}

}
