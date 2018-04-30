package operator;

import java.util.Scanner;

public class arearectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*int width = 40;
     int height = 50;
     double area;
     
     area = width * height;
     System.out.println(area);
     */
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the length:");
     double l= sc.nextDouble();
    System.out.println("Enter the breadth:");
     double b= sc.nextDouble();
    
      
      double  area=l*b;
  System.out.println("Area of Rectangle is: " + area);      
}

	}


