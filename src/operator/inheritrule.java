package operator;

class Main {
	void show() {System.out.println("main method");
}
}
class Sub extends Main{
	void show()
	{
		super.show();   //displays main class show method
		System.out.println("sub method"); //override show method of main class
	}
}



class inheritrule {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Main obj = new Sub();
obj.show(); //calls to sub class and its methods
	}

}
