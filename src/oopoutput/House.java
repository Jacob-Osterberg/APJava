package oopoutput;

import java.util.Scanner;

public class House {
	public House() {
	}

	public void paintWall() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall to the nearest foot?");
		int width = input.nextInt();
		System.out.println("What is the length of the wall to the nearest foot?");
		int lenght = input.nextInt();
		int area = width * lenght / 200 * 60;
		System.out.println("It will take aproximatly " + area + " minute(s) to paint the wall");
	}

	public void paintWallV2(int length, int height) {
		int area = length * height / 200 * 60;
		System.out.println("It will take aproximatly " + area + " minute(s) to paint the wall");
	}

	public void plantGarden() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the garden to the nearest foot?");
		int length = input.nextInt();
		System.out.println("What is the number of rows in the garden?");
		int rows = input.nextInt();
		int time = length * rows / 15 * 2;
		System.out.println("It will take aproximatly " + time + " hour(s) to plant the garden");
	}

	public void plantGardenV2(int lengthg, int rows) {
		int time = lengthg * rows / 15 * 2;
		System.out.println("It will take aproximatly " + time + " hour(s) to plant the garden");

	}

	public void fillPool(int radius, int height) {
		double volume = 3.14 * radius * radius * height * 7.48052 / 300;
		System.out.println("It will take aproximatly " + volume + " hour(s) to fill the pool");

	}

	public void fillSandbox() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the sandbox to the nearest foot?");
		int length = input.nextInt();
		System.out.println("What is the width of the sandbox to the nearest foot?");
		int width = input.nextInt();
		System.out.println("What is the depth of the sandbox to the nearest foot?");
		int depth = input.nextInt();
		System.out.println(
				"What is the rate(cubic feet of sand per hour) of sad being added to the sandbox to the nearest cubic foot?");
		int rate = input.nextInt();
		int time = length * width * depth / rate;
		System.out.println("It will take aproximatly " + time + " hour(s) to fill the sandbox.");

	}

	public void fillSandboxV2(int length, int width, int depth, int rate) {
		double time = length * width * depth / rate;
		System.out.println("It will take aproximatly " + time + " hour(s) to fill the sandbox.");

	}
	public double fillSandboxV3(int length, int width, int depth, int rate) {
		double time = length * width * depth / rate;
		return time;

	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
