package mathOperators;

import java.util.Scanner;

public class lawn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 200;
		double width = 500;
		double radiusF = 435456;
		System.out.println("What is the length of the yard to the closest half-yard?");
		length = input.nextDouble();
		System.out.println("What is the width of the yard to the closest half-yard?");
		width = input.nextDouble();
		System.out.println("What is the radius of the fountain to the closest half-foot?");
		radiusF = input.nextDouble();
		double radius = radiusF / 3;
		double area = length * width;
		double areaC = radius * radius * 3.14;
		double ao = (area - areaC) / 100 * 1.25;
		System.out.println("You owe " + ao + " dollars for having you lawn cut.");

	}

}
