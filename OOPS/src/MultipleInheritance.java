interface H1 {
	int x = 100;
}

interface H2 {
	int x = 200;
}

interface H3 extends H1, H2 {
	int x = 300;
}

//class MyClass implements H1, H2, H3 {
//	int total = H1.x + H2.x + H3.x;
//}

class MyClass implements H3 {
	//int total = x;
	int total = x + H1.x + H2.x;
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
