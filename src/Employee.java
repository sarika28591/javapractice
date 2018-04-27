//import java.io.*;

public class Employee {
	String name;
	int age;
	String destination;
	double salary;
	
	public Employee(String name) {
		this.name = name; //name parameter and this.name = instance field
	}
	
	public void empAge(int empAge) {
	empAge = age;	
	}
	
	public void empDestination(String empDestination) {
		empDestination = destination;
	}
	
	public void empSalary(double empSalary) {
	empSalary = salary;
}
	public void printEmployee() {
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("destination is " + destination);
		System.out.println("salary is " + salary);
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee one = new Employee("sarika");
     
     one.empAge(25);
     one.empDestination("pune");
     one.empSalary(1000);
     one.printEmployee();
     
	}
	*/
}
