package mathOperators;

import java.util.Scanner;

public class averageSomeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testone = 200;
		int testtwo = 100;
		int testthree = 300;
		System.out.println("What is the first test score?");
		testone = input.nextInt();
		System.out.println("What is the second test score?");
		testtwo = input.nextInt();
		System.out.println("What is the third test score?");
		testthree = input.nextInt();
		int average =(testone + testtwo + testthree)/3;
		int remainder = (testone + testtwo + testthree)%3;
		System.out.println("The average of the three test scores is " +average+"."+ remainder );
		
		
		
	}

}
