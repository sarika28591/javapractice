package Asteric;

public class star {
	
		 public static void main(String[] args) {
		 for (int i=0; i<6; i++)
		   {
		   for (int j=0; j<i; j++)
		   {
		   System.out.print("*");
		   }
		   System.out.println("");
		   }
		
		 
		 for (int i=1; i<10; i += 2)
		  {
		      for (int k=0; k < (4 - i / 2); k++)
		      {
		          System.out.print(" ");
		      }
		      for (int j=0; j<i; j++)
		      {
		          System.out.print("*");
		      }
		      System.out.println("");
		  }
		 
		 
		 
		 for (int i=1; i<=4; i++)
		  {
			 for (int j=4; j>=i ; j--) {
				 System.out.print(" ");
		  }
			 for (int k=1;k<=i;k++) {
				 System.out.print(" *");
		 }
			 
			 System.out.println("");
		  }
		 
		 
		 for (int i=1; i<=4; i++)
		  {
			 
			 for (int k=4;k>=i;k--) {
				 System.out.print("*");
		 }
			 for (int j=1; j>=i ; j++) {
				 System.out.print(" ");
		  }
			 
			 System.out.println("");
		  }
		 }
		 
		 
		 
		 
}