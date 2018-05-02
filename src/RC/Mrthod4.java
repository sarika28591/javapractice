package RC;

public class Mrthod4 {
    //method w/o returning any value and without object
	
	public static void studentRank(int marks) {
    	if (marks >= 600) {
    		System.out.println("rank A");
    	}
    	else if (marks >= 500) {
    		System.out.println("rank B");
    	} else 
    		System.out.println("rank C");
    }
	
	
	public static void main(String[] args) {
		// without object creation call needs static non modifier
		studentRank(900);
	}

}
