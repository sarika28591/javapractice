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
	age = empAge;
	}
	
	public void empDestination(String empDestination) {
		destination = empDestination;
	}
	
	public void empSalary(double empSalary) {
	salary = empSalary;
}
	public void printEmployee() {
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("destination is " + destination);
		System.out.println("salary is " + salary);
	}
	
	
}
