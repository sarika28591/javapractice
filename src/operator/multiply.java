package operator;
import java.util.Scanner;
public class multiply {
public static void main(String[] args0){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1 = scan.nextInt();
	System.out.println("Enter second number");
	int num2 = scan.nextInt();
	 scan.close();
	int num =num1 * num2;
	System.out.println("num is "  + num);
	
	
}
}
