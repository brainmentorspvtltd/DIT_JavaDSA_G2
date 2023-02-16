//Encapsulation 
//-wraps variables and methods into one single unit known as class
//Data Hiding
//Good Encapsulation = Encapsulation + Data Hiding


public class StudentDetails {
	// by default variables are in a default scope
	private int id;
	private String name;
	private double marks;
	private double fees;
	private String college;
	
	// to initialize variables we use constructor
	// this is a default constructor
	// constructor has same name as of class
	// there is no return type of constructor
	public StudentDetails() {
		this.college = "DU";
		System.out.println("Default Const...");
	}
	
	// parameterized constructor
	public StudentDetails(int id, String name, double marks, double fees) {
		// Constructor Chaining - calling one constructor from another
		this();		// it will call default constructor
		System.out.println("Param. Const...");
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fees = fees;
//		this();
	}
	
//	void takeInput(int id, String name, double marks, double fees) {
//		this.id = id;
//		this.name = name;
//		this.marks = marks;
//		this.fees = fees;
//	}
	
	void showDetails() {
		System.out.println("College is : " + this.college);
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + this.marks);
		System.out.println("Fees  : " + this.fees);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
