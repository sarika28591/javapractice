package Asteric;

import java.util.Scanner;

public class table 
{
	public static void main(String[] args)
	{
		 int a;
		 int b;
		 System.out.print("Enter a:");
	    Scanner sc = new Scanner(System.in);
	    a = sc.nextInt();
	    sc.close();
	    for(b= 1; b <= 10 ; b++)
		 {
			 
			 System.out.println(a+" * "+b+" = "+a*b);
	     }
    }
}
