package javabasics;

public class ORconditionalexpression {
	public static void main(String args[]) {
		double account_balance = 20000.45;
		int age = 55;
		
		if(account_balance >= 1000 || age >= 65) {
			System.out.println("You can retire now");
	} else {
		System.out.println("You still need to save money for retirement");
	}
	}
}
