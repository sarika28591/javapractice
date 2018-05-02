package abstrct;

public class Honda extends Bike{

	@Override
	public void seat() {
	System.out.println("bike has seat");   // implemented object class
		
	}
	
	public static void main(String[] args) {
		Honda obj = new Honda();    //new honda object
		obj.seat();
		obj.Handle();
	}

}
