package mathOperators;

import java.util.Scanner;

public class postIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length = 200;
		int width = 300;
		System.out.println("what is the length, in inches, of the surface?");
		length = input.nextInt();
		System.out.println("what is the width, in inches, of the surface?");
		width = input.nextInt();
int lpostits = length / 3;
int wpostits = width / 3;
int totalps = lpostits * wpostits; 
System.out.println("you will need " + totalps + " postits to cover the entire surface");
	}

}
