package oopoutput;

public class Phone {
	private int myNum;
	private int speed;
	private int last;
	private final int emergency = 911;
	private int numCalls;
	private int minutes;

	public int getMyNum() {
		return myNum;
	}

	public void setMyNum(int myNum) {
		this.myNum = myNum;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public int getEmergency() {
		return emergency;
	}

	public int getNumCalls() {
		return numCalls;
	}

	public void setNumCalls(int numCalls) {
		this.numCalls = numCalls;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Phone() {
		myNum = -999;
		speed = -999;
		last = -999;
		numCalls = -999;
		minutes = -999;

	}

	public Phone(int xmyNum, int xspeed, int xlast, int xnumCalls, int xminutes) {
		myNum = xmyNum;
		speed = xspeed;
		last = xlast;
		numCalls = xnumCalls;
		minutes = xminutes;

	}

	public void makeACall(int ynum, int xlength) {
		last = ynum;
		minutes = minutes + xlength;

	}

}
