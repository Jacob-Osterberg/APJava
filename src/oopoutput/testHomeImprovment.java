package oopoutput;

import java.util.Scanner;

public class testHomeImprovment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House bob = new House();
		bob.paintWall();
		System.out.println("What is the lenght of the wall to the closest foot?");
		int length = input.nextInt();
		System.out.println("What is the height of the wall to the nearest foot?");
		int height = input.nextInt();
		bob.paintWallV2(length, height);
		bob.plantGarden();
		System.out.println("What is the lenght of the garden to the closest foot?");
		int lengthg = input.nextInt();
		System.out.println("What is the number of rows in the garden?");
		int rows = input.nextInt();
		bob.plantGardenV2(lengthg, rows);
		System.out.println("What is the radius of the pool to the closest foot?");
		int radius = input.nextInt();
		System.out.println("What is the height of the pool to the closest foot?");
		int heightp = input.nextInt();
		bob.fillPool(radius, heightp);
	}

}
