import java.util.Scanner;

public class EmpCaller {

	public static void main(String[] args) {
		
		// it will call default const... 
		//Employee ram = new Employee();
		
		// it will call param const...
		Scanner scanner = new Scanner(System.in);
		
		MessageReader mr = new MessageReader();
		
		//System.out.println("Enter Employee ID : ");
		System.out.println(mr.getValue("welcomeMsg"));
		
		System.out.println(mr.getValue("input.id"));
		int empID = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println(mr.getValue("input.name"));
		//System.out.println("Enter Employee Name : ");
		String name = scanner.nextLine();
		
		System.out.println(mr.getValue("input.salary"));
		//System.out.println("Enter Employee Salary : ");
		double salary = scanner.nextDouble();
		
		Employee ram = new Employee(empID, name, salary);
		//ram.salary = 1000;
		//System.out.println(ram.salary);
		//ram.setSalary(ram.getSalary() + 5000);
		//System.out.println("Salary : " + ram.getSalary());
//		System.out.println("Emp ID : " + ram.getEmpId());
//		System.out.println("Emp Name : " + ram.getName());
//		System.out.println("Emp Dept : " + ram.getDept());
//		System.out.println("Net Salary of Emp : " + ram.netSalary());

		// it prints the HashCode
		// System.out.println(ram);
		// toString - string representation of an object
		// defined inside Object Class
		// Object class is parent class of all Java Classes
		//System.out.println(ram.toString());
		System.out.println(ram);
		
		System.out.println("=====================");
		
//		Employee raman = new Employee(102, "Raman", 80000.00);
//		System.out.println(raman);
		
		scanner.close();

	}

}
