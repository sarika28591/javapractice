package javabasics;

public class ConstructMethod {
	//Constructor method
		public ConstructMethod() {
		System.out.println("my name is harry");
		}
		
		
		//Constructor method with parameters
			public ConstructMethod(String param) {
			System.out.println("method with parameter" + param);
			}
			
		//Instance method
			public void Instancemethod() {
				System.out.println("Instance method");
	}
		
class Constructormethodexample {
public static void main(String args[]) {
				ConstructMethod method1 = new ConstructMethod();
				method1.Instancemethod();
				}
	}
	}


