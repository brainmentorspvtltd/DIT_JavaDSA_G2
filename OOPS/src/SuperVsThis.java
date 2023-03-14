class P1 {
	int x;
	P1() {
		x = 10;
		System.out.println("P1 class default const...");
	}
}

class C1 extends P1 {
	int x;
	C1() {
		super();	// internally java uses super() to call parent's const.
		System.out.println("C1 class default const...");
		x = 20;
	}
	C1(int x) {
		//super();
		this();	// it will call default constructor of current class
		// local variable + instance variable + parent class variable
		int total = x + this.x + super.x;
		System.out.println("Total is : " + total);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		//C1 obj = new C1();
		C1 obj = new C1(40);

	}

}
