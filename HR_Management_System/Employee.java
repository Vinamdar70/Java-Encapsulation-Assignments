package HR_Management_System;
import java.util.*;

public class Employee {

	private int employeeId;
	private String Name;
	private double salary;
	private String designation;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
		this.salary = salary;
		}else {
			System.out.println("Error:Doesnt accept Negative Salary");
		}
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		if(designation.equals("Tester") || designation.equals("Developer") || designation.equals("Manager")) {
		this.designation = designation;
		}else {
			System.out.println("Error: Only can access Authorised Person");
		}
	}
	
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee Designation: "+designation);
		System.out.println("==============================");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[3];
		for(int i=0;i<e.length;i++) {
			e[i] = new Employee(); 
			System.out.println("Employee Details "+i);
			
			System.out.println("Enter Employee ID: ");
			e[i].setEmployeeId(sc.nextInt());
			
			System.out.println("Enter Employee Name: ");
			e[i].setName(sc.next());
			
			System.out.println("Enter Employee salary: ");
			e[i].setSalary(sc.nextDouble());
			
			System.out.println("Enter Employee designation: ");
			e[i].setDesignation(sc.next());
			
		}
		
		System.out.println("=========All Employee Details========");
		for(int i=0;i<e.length;i++) {
			e[i].displayEmployeeDetails();
		}
	}
}
