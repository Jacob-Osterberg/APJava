package mathOperators;

import java.util.Scanner;

public class makeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int change = 200;
		int cents = 3;
		System.out.println("How many dollars do you need back?");
		change = input.nextInt();
		System.out.println("How many cents do you need back?");
		cents = input.nextInt();
		int Nquarters = cents / 25;
		int centstwo = cents - (Nquarters*25);
		int Ndimes = centstwo / 10;
		int centsthree = centstwo - (Ndimes*10);
		int Nnickels = centsthree / 5;
		int centsfour = centsthree - (Nnickels*5);
		System.out.println("To get " + " dollars back, you will need " + change + " dollar bills, " + Nquarters + " quarters, " + Ndimes + " dimes, " + Nnickels + " nickels and " + centsfour + " pennies.");		
		
	}

}
