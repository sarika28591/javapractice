package multipleinheritance;

public class ClassC {
	protected int a=4,b =3;

	protected void add() {
	System.out.println(a+b);
	}

	public static void main(String[] args) {
	ClassC objC = new ClassC();
	objC.add();
	}
		

}
