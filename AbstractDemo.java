abstract class Loan {
	void applyForLoan() {
		System.out.println("Apply for loan...");
	}
	// abstract methods are defined only inside abstract classes
	abstract void roi();
	abstract void emi();
}

class CarLoan extends Loan {

	@Override
	void roi() {
		
	}

	@Override
	void emi() {
		
	}
	
}

class HomeLoan extends Loan {
	@Override
	void roi() {
		
	}
	@Override
	void emi() {
		
	}
}

class PersonalLoan extends Loan {

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		

	}

}
