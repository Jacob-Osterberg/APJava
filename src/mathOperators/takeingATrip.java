package mathOperators;

import java.util.Scanner;

public class takeingATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int distance = 200;
		int mpg = 300;
		int as = 300;
		System.out.println("What is the total distance of the trip(round to the closest mile)?");
		distance = input.nextInt();
		System.out.println("What is the MPG of your car(round to the closest mile)?");
		mpg = input.nextInt();
		System.out.println("What is the total amount spent on gas during the trip(round to the nearest dollar)?");
		as = input.nextInt();
		double tgu = distance / mpg;
		int cpg = as / mpg;
		System.out.println("You traveled " + distance + " miles, used " + tgu + " gallons of gas, spent " + as
				+ " dollars on that gas, at " + cpg + " dollars per gallon.");
	}

}
