package multipleinheritance;

public class ClassD {

	
		int a=3,b =3;

		public void add() {
		System.out.println(a*b); // method overrideconcept used the same method as earlier class and added changes
		                           //changed + to * but merhod name same and it worked
				} 
	//checked parent class to execute methods otherwise execute home or current class

		public static void main(String[] args) {
		ClassC objD = new ClassC();   // objects of parent class without inheritance when protected used for class members
		objD.add();                                    //package to package inheritance can be possible for protected method
		
		ClassD obj2 = new ClassD();
		obj2.add();     //child object
		
}
}


