package operator;

class Main {
	void show() {
		System.out.println("main class");
	}
	protected void not() {
		System.out.println("protected class");
	}
}
class Child extends Main{
	void show() {
		
		System.out.println("child class");
	}

}
class override {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Main obj1 = new Main();
obj1.show();
obj1.not();
Child obj = new Child();
obj.show();
	}

}
