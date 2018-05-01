package RC;

public class class1 {

	
     //Declare static variables
	static int a  = 10 , b=20;
	
	//Declare non-static variables
	int c =30,d =40;
	

//create static method with returning a value
public static int add() {
int result = a+b;
return result;
}
//create static method without returning a value
public static void  multiply() {
	System.out.println(a*b);
}
//create non-static method with returning a value
public int add1() {
int res = c+d;
return res;
}
//create non-static method without returning a value
public void multiply1() {
System.out.println(c*d);
}

public static void main (String[] args) {
//access static class members using class name
int x=class1.add();
System.out.println(x); //30
class1.multiply();  //200
	
//access non static class memebers by creating object
class1 obj = new class1();
int y = obj.add1(); 
System.out.println(y); //70

obj.multiply1();   //1200
}
}

