package javabasics;

class Student{
	//Name of student
		public void name(String name) {
			 System.out.println(String.format("Name is : %s" , name));
		}
		
	//Grade of the student
		public void grade(double grade) {
			System.out.println(String.format("Student grade is : %.2f" , grade));
		}
	}

public class Instancemethod {
	public static void main(String args[]) {
	// Create student1 object
	Student student1 = new Student();
	student1.name("abc");
	student1.grade(5.23);
	
	// Create student2 object
	Student student2 = new Student();
	student2.name("sarika");
	student2.grade(9.22);
}
}

