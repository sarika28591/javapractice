package multipleinheritance;

public class overload {
    public void add(int a,int b) {
    	System.out.println(a+b);}


public void add(int a, int b,int c) { //method overload add attribute or type no inheritance required and same class is needed
	System.out.println(a+b+c);
	}


public void add(double a, double b) {
	System.out.println(a+b);
	}
 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    overload obj = new overload();
    obj.add(3,5);
    obj.add(3,5,2);
    obj.add(3.30,5.30);
	}

}
