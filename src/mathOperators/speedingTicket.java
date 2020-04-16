package mathOperators;

import java.util.Scanner;

public class speedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int limit = 200;
		int speed = 100;
		System.out.println("What is the speed limit?");
		limit = input.nextInt();
		System.out.println("What is the current speed of the driver");
		speed = input.nextInt();
		int over = speed - limit - 1;
		int overfour = over * 40 + 55;
		System.out.println("the driver ows " + overfour + " dollars");

	}
}
