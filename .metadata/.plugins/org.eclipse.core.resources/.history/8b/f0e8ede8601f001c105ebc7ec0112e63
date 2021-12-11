package test;

public class Employee extends Person{
	
	public int EmpId;
	public int Salary;
	
	static String department  = "Technology";
	
  
	public Employee() {
		super();
		System.out.println("INSIDE EMPLOYEE");
	}
	
	public Employee(int empid, int sal) {
		
        this(); //this will run the default constructor		
		this.EmpId = empid;
		//this.department = dep;
		this.Salary = sal;
	}
	
	public Employee(String name, int age, String city, int empid, int sal) {
		super(name, age, city);
		
		this.EmpId = empid;
		this.Salary = sal;
		
	}
	
	
	public void display() {
		super.display();
		
		System.out.println("Employee id is:" + " " + EmpId);
		System.out.println("Employee salary is :"  + " " + Salary);
		System.out.println("Employee dep is :" + " " + Employee.department);
		
	}

}
