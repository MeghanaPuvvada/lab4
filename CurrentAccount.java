package lab4;

public class CurrentAccount extends Account{
	
	private double overdraftLimit;


	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}


	public CurrentAccount(double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}


	public double getOverdraftLimit() {
		return overdraftLimit;
	}


	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}


	@Override
	public String toString() {
		return "CurrentAccount [overdraftLimit=" + overdraftLimit + "]";
	}
	
	@Override
	public void withdraw(double withdrawAmount) {

		double newBalance = -1;
		if((super.getBalance()- withdrawAmount) >= overdraftLimit) {
			newBalance = super.getBalance() - withdrawAmount;
			super.setBalance(newBalance);
			System.out.println("New Balance "+newBalance);
		}
		else {
			System.out.println("The overdraft limit has reached.");
		}
		System.out.println();
	}

}
