package variabletest;

public class instancev {
	 String myInstanceVar = "mango";
public static void main(String[] args) {
	
	
	instancev obj = new instancev();
	instancev obj1 = new instancev();
	System.out.println(obj.myInstanceVar);
	System.out.println(obj1.myInstanceVar);
	
	obj1.myInstanceVar = "Changed text";
	
	System.out.println(obj.myInstanceVar);
	System.out.println(obj1.myInstanceVar);
	
	
}
}
