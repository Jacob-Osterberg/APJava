package oopoutput;

public class Cat {
	private int age;
	private int sleep;

	public Cat() {
		age = -999;
		sleep = -999;
	}

	public void Birthday() {
		System.out.println("It's your Birthday!");
		age = age + 1;
	}

	public int getAge() {
		return age;

	}

	public void setAge(int xage) {
		age = xage;
	}

	public int getSleep() {
		return sleep;

	}

	public void setSleep(int xsleep) {
		sleep = xsleep;
	}

	public void sleepMore(int ysleep) {
		sleep = sleep + ysleep;

	}

	public void sleepLess(int wsleep) {
		sleep = sleep - wsleep;

	}

}
