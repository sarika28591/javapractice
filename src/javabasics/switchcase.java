package javabasics;

public class switchcase {
      public static void main(String args[]) {
    	  String grade = "B-";
    	  switch(grade) {
    	  case "A+" :
    		  System.out.println("Great stuent");
    		  break;
    	  case "A-" :
    		  System.out.println("Great stuent"); 
    		  break;
    	  case "A" :
    		  System.out.println("Great stuent");
    		  break;
    	  case "B+": case "B-":
    	  case "B":
    		  System.out.println("Good stuent");
    		  break;
    	  case "C+": case "C-":
    	  case "C":
    		  System.out.println("Poor stuent");
    		  break;
    		  default:
    			  System.out.println("You failed the clss"); 
    	  }
      }
}
