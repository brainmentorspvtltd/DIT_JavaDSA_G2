//S.O.L.I.D
//D - DRY - Donot Repeat Yourself
//S - SRP - Single Responsibility Principle


class Student {
	// Instance Variables
	// Data Members
	int id;
	String name;
	double marks;
	double fees;
	
	void takeInput(int id, String name, double marks, double fees) {
		//InstanceVariable = LocalVariable
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fees = fees;
	}
	
	// Member functions
	void showDetails() {
		//this -> refers to the current object
		//ram.showDetails() -> this = ram
		//shyam.showDetails() -> this = shyam
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + this.marks);
		System.out.println("Fees  : " + this.fees);
	}
}

public class ClassObjectDemo {

	public static void main(String[] args) {
		// Local variables
		int x = 12;
		
		// Creating object of class
		// Student - data type
		// ram - reference variable, refers to object
		// new - reserved keyword, used to allocate new memory to object
		// Student() - calling Student class default constructor
		Student ram = new Student();
//		ram.id = 101;
//		ram.name = "Ram";
//		ram.marks = 50.00;
//		ram.fees = 45000.00;
		ram.takeInput(101, "Ram", 80.45, 50000.00);
		ram.showDetails();
		
//		System.out.println("ID : " + ram.id);
//		System.out.println("Name : " + ram.name);
//		System.out.println("Marks : " + ram.marks);
//		System.out.println("Fees  : " + ram.fees);
		
		Student shyam = new Student();
//		shyam.id = 102;
//		shyam.name = "Shyam";
//		shyam.marks = 70.00;
//		shyam.fees = 45000.00;
		shyam.takeInput(102, "Shyam", 67.44, 45000.00);
		shyam.showDetails();
		
//		System.out.println("ID : " + shyam.id);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Marks : " + shyam.marks);
//		System.out.println("Fees  : " + shyam.fees);
	}

}
