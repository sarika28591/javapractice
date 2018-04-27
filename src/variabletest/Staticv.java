package variabletest;

public class Staticv {
	 public static String myClass = "class";
	public static void main(String[] args) {
		Staticv obj = new Staticv();
		Staticv obj2 = new Staticv();
		
		System.out.println(obj.myClass);
		System.out.println(obj2.myClass);

		   obj2.myClass = "Changed Text";

		      //All three will display "Changed Text"
		      System.out.println(obj.myClass);
		      System.out.println(obj2.myClass);
		    
		
	}
}
