package RC;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50 , b = 40 , c =30, d =10;
		int w = 50, x = 60, y =40, z=30;
		
		if(a>b) {
			if(a<d) { // false all if conditions checked , if any fails came out and check for the else part of the statement
			if(a>c) {
				System.out.println("A is a big number");
			}else {
				System.out.println("A is not a big number");
			}
		}else {
			System.out.println("2nd condition fails");
		}
		
		}
		
		
		
	if(w>y) {
		if(x>y) {
			if(y>z) {
				System.out.println("x is a big number"); //all conditions true
			}
		}else {
			System.out.println("x is not a big number");
		}
	}
	
	}

}
