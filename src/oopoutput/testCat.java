package oopoutput;

public class testCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat bob = new Cat();
		System.out.println(bob.getAge());
		System.out.println(bob.getSleep());
		bob.Birthday();
		System.out.println(bob.getAge());
		bob.sleepMore(4);
		System.out.println(bob.getSleep());
		bob.sleepLess(4);
		System.out.println(bob.getSleep());
		bob.setAge(5);
		bob.setSleep(15);
		System.out.println(bob.getAge());
		System.out.println(bob.getSleep());
		bob.Birthday();
		System.out.println(bob.getAge());
		bob.sleepMore(4);
		System.out.println(bob.getSleep());
		bob.sleepLess(4);
		System.out.println(bob.getSleep());

	}

}
