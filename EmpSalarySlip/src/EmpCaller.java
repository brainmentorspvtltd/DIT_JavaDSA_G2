public class EmpCaller {

	public static void main(String[] args) {
		
		// it will call default const... 
		//Employee ram = new Employee();
		
		// it will call param const...
		Employee ram = new Employee(101, "Ram", 50000.00);
		//ram.salary = 1000;
		//System.out.println(ram.salary);
		//ram.setSalary(ram.getSalary() + 5000);
		//System.out.println("Salary : " + ram.getSalary());
		System.out.println("Emp ID : " + ram.getEmpId());
		System.out.println("Emp Name : " + ram.getName());
		System.out.println("Emp Dept : " + ram.getDept());
		System.out.println("Net Salary of Emp : " + ram.netSalary());

	}

}
