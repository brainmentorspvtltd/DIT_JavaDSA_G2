class Account {
	int acc_no;
	String name;
	double balance;
	void withdraw() {
		System.out.println("Withdraw Limit is 50K");
	}
	void deposit() {
		System.out.println("Deposit Limit is 1Lac");
	}
}

class SavingAccount extends Account {
	void roi() {
		System.out.println("On Saving Accounts ROI is 7%");
	}
	
	//@Override - it's a annotation
	@Override
	void deposit() {
		System.out.println("For Saving Account Deposit Limit is 3 Lac");
	}
}

class CurrentAccount extends Account {
	void odLimit() {
		System.out.println("OD Limit is 50K");
	}
	
	@Override
	void withdraw() {
		System.out.println("For Current Account Withdraw Limit is 1Lac");
	}
}

public class IsADemo {
	
//	Polymorphic Call
	void caller(Account acc) {
		acc.deposit();
		acc.withdraw();
//		Downcasting
		if(acc instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount)acc;
			sa.roi();
		}
		else if(acc instanceof CurrentAccount) {
			CurrentAccount ca =(CurrentAccount)acc;
			ca.odLimit();
		}
	}

	public static void main(String[] args) {
		
//		SavingAccount sa = new SavingAccount();
//		sa.withdraw();		// Account Class
//		sa.deposit();		// SavingAccount Class
//		sa.roi();			// SavingAccount Class
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withdraw();		// Current Class
//		ca.deposit();		// Account Class
//		ca.odLimit();		// Current Class
		
		// Upcasting - when we have object of child class
		// but type of object is parent class
//		Account acc = new SavingAccount();
//		acc.withdraw();
//		acc.deposit();
		//acc.roi();
		
//		acc = new CurrentAccount();
//		acc.withdraw();
//		acc.deposit();
		//acc.odLimit();
		
		IsADemo obj = new IsADemo();
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());

	}

}
