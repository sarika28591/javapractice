package variableexamples;

public class Employee {
   String name;
   double salary;
   
   public Employee(String name) {
	   System.out.println("name is " + name);
	   
   }  
	public void setSalary(double empSal) {
		salary = empSal;
   }
	
	public double getSalary() {
		System.out.println("salary is " + salary);
		return salary;

	}
	public static void main(String[] args) {
		Employee obj = new Employee("Sarika");
		obj.setSalary(1000.33);
		obj.getSalary();
		
	}
	
   }

