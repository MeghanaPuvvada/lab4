package lab4;

public class Account{
	private long accNum;
	private double balance;
	private Person accHolder;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accNum, double balance, Person accHolder) {
		super();
		if(balance>=500) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
		}
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
		System.out.println("Your updated balance for the account number " + getAccNum() + " is " + this.balance);
	}
	
	public void withdraw(double withdrawAmount) {
		this.balance-=withdrawAmount;
	}
	
	
}
