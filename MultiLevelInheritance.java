class GrandParent {
	int x = 10;
}

class Parent extends GrandParent {
	int x = 20;
}

class Child extends Parent {
	int x = 50;
	public Child(int x) {
		int total = x + this.x + super.x + ((GrandParent)this).x;
		System.out.println("Total : " + total);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Child obj = new Child(100);

	}

}
