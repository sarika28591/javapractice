package RC;

public class Method3 {
    public void studentRank(int marks) {
    	if (marks >= 600) {
    		System.out.println("rank A");
    	}
    	else if (marks >= 500) {
    		System.out.println("rank B");
    	} else 
    		System.out.println("rank C");
    }

	public static void main(String[] args) {
		// creating object
     Method3 obj = new Method3();
     obj.studentRank(300);
	}

}
