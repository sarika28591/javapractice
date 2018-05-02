package RC;

public class Method2 {

		//methods with returning a value without object creation
	    
		public static int multiply(int c,int d) {
				int res = c * d;
				return res;
					
		}
		public static void main(String[] args) {

			//without creating any object , call methods static 
			 int x = multiply(5,6);
			 System.out.println(x);
			
			//or
			
			System.out.println(multiply(5,6));
			
			
		}
	
}
