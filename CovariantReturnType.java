class User {
	
}

class PrimeUser extends User {
	
}

class Amazon {
	User show() {
		User user = new User();
		return user;
	}
}

class AmazonPrime extends Amazon {
	@Override
	PrimeUser show() {
		PrimeUser user = new PrimeUser();
		return user;
	}
}


public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
