import java.util.ArrayList;

//SAM - Single Abstract Method
//Functional Interface
@FunctionalInterface
interface Calc {
	int add(int x, int y);
}

//first way to implement interface 
//class MyCalc implements Calc {
//
//	@Override
//	public int add() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

public class InterfaceUseWays {

	public static void main(String[] args) {
		// Anonymous Class
//		Calc obj = new Calc() {
//			@Override
//			public int add() {
//				int x = 12, y = 20;
//				return x+y;
//			}
//		};
//		System.out.println(obj.add());
		
		// Lambda Expressions
		// (a,b) - arguments
		// a + b - return statement
		Calc c = (a,b) -> a + b;
		System.out.println(c.add(12, 20));
		
		Calc c1 = (a,b) -> {
			int z = a + b;
			System.out.println("Performing Addition");
			return z;
		};
		System.out.println(c1.add(12, 20));
		
//		String names[] = {"Max","Sam","John"};
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Shawn");
		names.add("Max");
		names.forEach(name -> {
			System.out.println(name);
		});

	}

}
