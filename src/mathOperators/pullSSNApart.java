package mathOperators;

import java.util.Scanner;

public class pullSSNApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 200;
		int ssn = 23524525;
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("What is you SSN(no dashes)?");
		ssn = input.nextInt();
		int agetwo = 18 - age;
		int lfd = ssn % 10000;
		System.out.println("You have " + agetwo + " years left before you turn 18");
		System.out.println("Your SSN is " + ssn);
		System.out.println("The last four digets of your SSN are " + lfd);

	}

}
