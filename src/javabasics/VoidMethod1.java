package javabasics;

public class VoidMethod1 {
	public static void main (String args[]) {
		greet(name: "abc");
		greet(name: "xyz");
	}
	
	//Method that returns empty value
	public static void greet(String name) {
		System.out.println("Hello," + name);
	}

}

