
public class Puppy {
   int puppyAge;     //instance variable
   
   public Puppy(String name){   //constructor with parameter name
	   System.out.println("name is " + name);
	  }
   
   public void setAge(int Age) {
	   puppyAge = Age;
   }
   
   public int getAge() {
	   System.out.println("age is " + puppyAge);
	   return puppyAge;
   }
   
   public static void main(String[] args) {
	   //object creation
	   Puppy mypuppy = new Puppy("tommy");
	   //call class method  to set puppy's age
	   mypuppy.setAge(2);
	   //call class method to get puppy's age
	   mypuppy.getAge();
	   //access instance variable
	   System.out.println("Instance variable is " + mypuppy.puppyAge);
   }
   
}
