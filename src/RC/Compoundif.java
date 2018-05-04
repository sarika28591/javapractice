package RC;

public class Compoundif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 50 , b = 40 , c =30;
    
    if ((a>b) || (a<c)) {
    	System.out.println("A is a big number");
    	
    }
    
    if ((a>b) && (a<c)) {    //compound if else false result for if statement
    	System.out.println("A is a big number");
	}
    else {
    	System.out.println("B is a big number");
    }
	}
}

