package RC;

public class Variabletypes {
	static int a = 10;    //a variable that declared as static not local , class level variable
	
	public int Salary() {
		int mysalary = 10+20; // mysalary is a local variable within the method
		mysalary =mysalary + a; //static variable can access in the method but not the instance
		return mysalary;
	}
   
	public static void main(String[] args) { // predefined
		// TODO Auto-generated method stub
		int b = 200;    //instance variable b outside of method or block
		System.out.println(a);   //static  = 10
		System.out.println(b);   //instance = 200
		
		Variabletypes obj = new Variabletypes();  //local variable by creating its object
		System.out.println(obj.Salary());  //40
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			System.out.println(a);   //10 
			System.out.println(b);    //200  for loop 4 times
			
		}
	}

}
