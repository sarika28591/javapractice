package abstrct;

public abstract class Bike {
    public void Handle() {
    	System.out.println("Bike has a handle");
    	
    }
    
    public abstract void seat(); // defined abstract class , unable to access methods without implementation
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda obj = new Honda();   //can create child class object to access the methods
		obj.seat();
		obj.Handle();
	}

}
