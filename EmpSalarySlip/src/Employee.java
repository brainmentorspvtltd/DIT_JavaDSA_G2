//Good Encapsulation - Make data private and methods public
//- Encapsulation + Data Hiding

// Internally all classes extends Object class
public class Employee extends Object {
	
	// Instance Variables
	private int empId;
	private String name;
	private String dept;
	private double salary;
	private String company;
	
	// Default Constructor
	public Employee() {
		this.company = "Brain Mentors";
	}
	
	public Employee(String dept) {
		this();	// will call default const.
		this.dept = dept;
	}
	
	// Param. Constructor
	public Employee(int empId, String name, double salary) {
		//this();		// will call default const.
		this("IT");		// will call dept const.
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

//	public void setDept(String dept) {
//		this.dept = dept;
//	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

//	public void setCompany(String company) {
//		this.company = company;
//	}
	
	// Earnings
	public double getHRA() {
		// 30% of the salary is HRA
		return this.salary * 0.30;
	}
	public double getTA() {
		// 15% of the salary is TA
		return this.salary * 0.15;
	}
	public double getMA() {
		// 10% of the salary is MA
		return this.salary * 0.10;
	}
	public double getDA() {
		// 25% of the salary is DA
		return this.salary * 0.25;
	}
	
	// Deductions
	public double getPF() {
		// 5% of the salary is PF
		return this.salary * 0.05;
	}
	
	public double getTDS() {
		// 10% of the salary is TDS
		return this.salary * 0.10;
	}
	
	// Net Salary
	public double netSalary() {
		double earnings = this.salary + getHRA() + getTA() + getDA() + getMA();
		double deductions = getTDS() + getPF();
		double payableSalary = earnings - deductions;
		return payableSalary;
	}
	
	@Override
	public String toString() {
		CommonUtils utils = new CommonUtils();
		this.name = utils.formatValue(this.name);
		return "Emp Name : " + this.name + "\n" +
				"Emp Dept : " + this.dept + "\n" + 
				"Emp Salary : " + netSalary(); 
	}
	
	
}
