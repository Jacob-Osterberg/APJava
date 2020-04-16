package oopoutput;

import java.util.Scanner;

public class testNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Numbers bob = new Numbers();
		bob.sayHello();
		System.out.println("Give me a number");
		double rent = input.nextDouble();
		bob.sayNumber(rent);
		System.out.println("Give me a number");
		double lid = input.nextDouble();
		bob.sayNumberPlus2(lid);
		System.out.println("Give me a number");
		double length = input.nextDouble();
		System.out.println("Give me a number");
		double width = input.nextDouble();
		bob.saySum(length, width);

	}

}
