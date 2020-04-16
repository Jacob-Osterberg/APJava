package oopoutput;

import java.util.Scanner;

public class Room {
	public Room() {
	}

	public void sayArea() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall to the nearest foot");
		int width = input.nextInt();
		System.out.println("What is the length of the wall to the nearest foot");
		int lenght = input.nextInt();
		int area = width * lenght;
		System.out.println("The area of the wall is " + area);

	}

	public void sayAreaWithDoor() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall to the nearest foot");
		int widtht = input.nextInt();
		System.out.println("What is the length of the wall to the nearest foot");
		int lenghtt = input.nextInt();
		System.out.println("What is the width of the door to the nearest foot");
		int widthd = input.nextInt();
		System.out.println("What is the length of the door to the nearest foot");
		int lengthd = input.nextInt();
		int door = lengthd * widthd;
		int areat = widtht * lenghtt - door;
		System.out.println("The area of the wall is " + areat);
	}
}
