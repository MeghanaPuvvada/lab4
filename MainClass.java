package lab4;

public class MainClass {
	
	public static void main(String args[]) {
		Person p1 = new Person("Smith", 0);
		SavingsAccount sa1 = new SavingsAccount(101001, 2000, p1);
		System.out.println(sa1);
		sa1.deposit(2000);
		double bal = sa1.getBalance();
		System.out.println("The final balance is " + bal);


		Person p2 = new Person("Kathy", 0);
		CurrentAccount ca1 = new CurrentAccount(101002,3000,p2);
		System.out.println(ca1);
		ca1.withdraw(2000);
		double bal2 = ca1.getBalance();
		System.out.println("The final balance is " + bal2);
	}

}
