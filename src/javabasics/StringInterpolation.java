package javabasics;

public class StringInterpolation {
	public static void main(String args[]) {
		String custName = "abc";
		String streetName = "b2-494 laxmi road";
		int age = 34;
		String city = "Pune";
		String state = "Maharashtra";
		String zipCode = "545554";
		String country = "India";
		
		System.out.println(String.format("Student Details: name: %s, address: %s , age: %d , city: %s, state: %s , zipcode : %s , country: %s" ,
				          custName ,streetName, age ,city , state, zipCode, country));
		
				
	}
}
