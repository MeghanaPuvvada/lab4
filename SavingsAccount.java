package lab4;

public class SavingsAccount extends Account{
	
	final private double minimumBalance = 500;

	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minimumBalance=" + minimumBalance + "]";
	}
	
	@Override
	public void withdraw(double withdrawAmount) {

		double newBalance = -1; // default value
		if(super.getBalance()>minimumBalance)
		{
			newBalance = super.getBalance() - withdrawAmount;
			if(newBalance<minimumBalance)
			{
				System.out.println(" Cannot Withdraw the amount");
			}
			else
			{
				super.setBalance(newBalance);
				System.out.println("New Balance "+newBalance);
			}
		}
		else
		{
			System.out.println(" Cannot Withdraw the amount");
		}
	}
}
