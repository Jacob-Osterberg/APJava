package oopoutput;

public class BankAccount {
	private double balance;
	private int accountNum;
	private double interest;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double xbalance) {
		balance = xbalance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int xaccountNum) {
		accountNum = xaccountNum;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double xinterest) {
		interest = xinterest;
	}

	public BankAccount() {
		balance = -99.9;
		accountNum = -999;
		interest = -99.9;

	}

	public BankAccount(double xbalance, int xaccountNum, double xinterest) {
		balance = xbalance;
		accountNum = xaccountNum;
		interest = xinterest;

	}

	public double deposit(double xdeposit) {
		balance = balance + xdeposit;
		return balance;

	}

	public double withdraw(double xwithdraw) {
		balance = balance - xwithdraw;
		return balance;

	}

	public double financeCharge(double xfinance) {
		balance = balance - xfinance;
		return balance;

	}

	public double interest(double xtime) {
		balance = balance * (1 + interest * xtime);
		return balance;

	}

}
