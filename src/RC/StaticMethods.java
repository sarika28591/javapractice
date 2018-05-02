package RC;

public class StaticMethods {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 ="selenium";
		 String str2 ="SELENIUM";
		 String str3 ="selenium";   
		 String str4 ="Test";   
		 String str5 ="    Sel1     ";
		 String str6 = "WELCOME TO SELENIUM TESTING";
		 
		 
		    System.out.println(str1.compareTo(str2)); //positive value s>S
		    System.out.println(str1.compareTo(str3)); //zero
		    System.out.println(str2.compareTo(str3)); //negative value
		    
		    System.out.println(str1.equals(str3)); //true
		    System.out.println(str1.equals(str2)); //false
  
		    System.out.println(str1.concat(str4));  
		     
		    System.out.println(str1.charAt(1));  // output will be index 1 position of str1
		    
		    System.out.println(str1.equalsIgnoreCase(str2)); //true name same only cases ignored
		    System.out.println(str1.equalsIgnoreCase(str4)); //false totally diff name.
		    
		    System.out.println(str1.toUpperCase()); //converts str1 all lower letters to the capital
		    System.out.println(str4.toUpperCase());
		    
		    System.out.println(str2.toLowerCase()); //converts str2 all capital letters to the low
		    
		    System.out.println(str5.trim());
		    
		    
		    System.out.println(str6.substring(11)); //string displays from the mentioned index number
		    System.out.println(str6.substring(11,19)); 
		    System.out.println(str6.substring(8,10)); 
		    
		    
		    System.out.println(str6.endsWith("SELENIUM TESTING"));//true
		    System.out.println(str6.endsWith("selenium testing")); //false
		    System.out.println(str6.endsWith("welcome"));//false
		    
		    System.out.println(str6.length());  //including spaces
		    System.out.println(str1.length());
		    
	}
	

}
