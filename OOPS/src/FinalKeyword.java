// Final Keyword
/*
 * we can use final keyword in 3 ways
 * 1. with class - we cannot inherit final class
 * 2. with method - we cannot override final method
 * 3. with variable - we cannot change variable
 */

//final class A {
//	void show() {
//		
//	}
//}

class A {
	final void show() {
		
	}
}

class B extends A {
//	@Override
//	void show() {
//		
//	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		//PI = 3.66;

	}

}
