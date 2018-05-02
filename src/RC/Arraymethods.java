package RC;

import java.util.Arrays;

public class Arraymethods {

	public static void main(String[] args) {
	int[] array = {10, 20, 30, 40};
	
	String[] array1 = {"Sarika", "abc","def"};
	
	String str = Arrays.toString(array1);  // to prints an array
	//Arrays : -class , toString = method
	System.out.println(str);
	
	System.out.println();
	boolean a = Arrays.asList(array1).contains("def"); //available in array hence true
	System.out.println(a);
	boolean b = Arrays.asList(array1).contains("hfhhfhfhf");  //not available hence false
	//Arrays : -class , asList  = property , toString = method
	System.out.println(b);
	
	System.out.println();
	System.out.println(array.length);  //length property values 4
	

	}

}
