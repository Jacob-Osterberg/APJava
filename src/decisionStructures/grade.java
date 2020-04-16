package decisionStructures;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your score on the first test?");
		int testo = input.nextInt();
		System.out.println("What is your score on the second test?");
		int testw = input.nextInt();
		System.out.println("What is your score on the third test?");
		int testh = input.nextInt();
		System.out.println("Did you do the extra credit, if yes state the point value, if no then enter 0.");
		int extra = input.nextInt();
		if (extra > 0) {
			System.out.println("Congrats, your grade in the class is " + ((testo + testw + testh) / 3 + extra));
		} else {
			System.out.println("Congrats, your grade in the class is " + ((testo + testw + testh) / 3));

		}

	}

}
