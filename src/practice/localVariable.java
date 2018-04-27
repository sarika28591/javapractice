package practice;

public class localVariable {
	String instanceVar = "Instannce variable";
		public void myMethod() {
			String localVar = "Local var";
			System.out.println(localVar);
			
}

		public static void main(String[] args) {
       localVariable obj = new localVariable();
       obj.myMethod();
     System.out.println(obj.instanceVar);  
	}

}
