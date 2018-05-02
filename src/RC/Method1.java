package RC;

public class Method1 {
	//methods with returning a value with object creation
	public int add(int a,int b) {
		int result = a+b;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Method1 abc = new Method1();
     int y = abc.add(5,5);
     System.out.println(y);
	
     //or
	System.out.println(abc.add(5,6));
	
	}
}