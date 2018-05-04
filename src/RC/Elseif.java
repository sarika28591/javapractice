package RC;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50 , b = 40 , c =30;
		
		if ((a>b) && (a<c)) {                                       //false
	    	System.out.println("A is a big number");
	}  else if ((a>b) || (a<c)) {                                  //true
		System.out.println("A is a big number");
	}
	else {
		System.out.println("B is a big number");
	}
	}
}
		
		
	