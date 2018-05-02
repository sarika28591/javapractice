package RC;

public class NumberMethods {

	public static void main(String[] args) {
		
     int x = 6;
     Integer a = x;
     
     double b = 12.722;
     double c = -10.784;
     System.out.println(Math.abs(b));
     System.out.println(Math.abs(c)); //absolute method the value changed negative to positive
     
     System.out.println();
     System.out.println(Math.round(b)); //returns round figure
     System.out.println(Math.round(c));  //-ve value but round figure
     
     System.out.println();
     System.out.println(Math.min(b,c));  //output is min value
     System.out.println(Math.max(b,c));  //output is max value
     System.out.println(Math.max(6,7));  //can add direct values
     
     System.out.println();
     System.out.println(Math.random());
     
     System.out.println();
     System.out.println(a.compareTo(6));   // 6 = 6 hence 0
     System.out.println(a.compareTo(8));    // 6<8 hence -1
     System.out.println(a.compareTo(2));   //6>2 hence 1
     
     System.out.println();
     System.out.println(a.equals(6)); //true
     System.out.println(a.equals(4));  //false
     
     
   
     
     
	}
}
