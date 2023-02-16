public class StudentCaller {

	public static void main(String[] args) {
		
		// Calling Default Constructor
//		StudentDetails ram = new StudentDetails();
		
		StudentDetails ram = new StudentDetails(101, "Ram", 56.77, 45000.00);
		ram.showDetails();
		
		StudentDetails shyam = new StudentDetails(102, "Shyam", 90.77, 45000.00);
		shyam.showDetails();
		
		//ram.marks = 10.55;
		System.out.println("Name is : " + ram.getName());
		
		ram.setMarks(ram.getMarks() + 10);
	}

}
