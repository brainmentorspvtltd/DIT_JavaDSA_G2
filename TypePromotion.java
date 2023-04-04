public class TypePromotion {
	
	void show(byte x) {
		System.out.println("Byte Call...");
	}
	void show(short x) {
		System.out.println("Short Call...");
	}
//	void show(int x) {
//		System.out.println("Int Call...");
//	}
//	void show(float x) {
//		System.out.println("Float Call...");
//	}
//	void show(long x) {
//		System.out.println("Long Call...");
//	}
//	void show(Integer x) {
//		System.out.println("Integer Wrapper Call...");
//	}
//	void show(Float x) {
//		System.out.println("Float Wrapper Call...");
//	}
//	void show(int ...x) {
//		System.out.println("Variable Length Args Call...");
//	}

	public static void main(String[] args) {
		
		TypePromotion obj = new TypePromotion();
		// obj.show(2);
		// obj.show(2,3,4,5);
		// first of all it will execute int
		// if int is not available then it will search for data type long
		// if long is not available then it will go for float
		// if float is not available then it will go for double
		// now if double is not avaiable then it will go for wrapper classes
		
		obj.show((byte)23);
		obj.show((short)20);

	}

}
