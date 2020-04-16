package oopoutput;

public class shapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle(4.5, 3.5);
		Circle tim = new Circle(6.0);
		RightTriangle sam = new RightTriangle(2.5, 3.5);
		IsocelesTrapazoid ric = new IsocelesTrapazoid(4.5, 5.6, 6.7, 7.8);
		System.out.println(bob.getlength() + " and " + bob.getWidth());
		System.out.println(tim.getRadius());
		System.out.println(sam.getBase() + " and " + sam.getHeight());
		System.out.println(ric.getBase() + " and " + ric.getXbase() + " and " + ric.getHeight() + " and " + ric.getLeg());

		
		
		
		
		
		
		
		
		
		
		
	}

}
