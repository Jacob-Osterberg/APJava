package mathOperators;

import java.util.Scanner;

public class bussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = 200;
		System.out.println("How many people are going to travel?");
		total = input.nextInt();
		int busses = total /35;
		int vans = total %35;
		System.out.println("You will need " + busses + " busses and need vans for " + vans + " people.");
	}

}
