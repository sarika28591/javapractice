//Static method example
package javabasics;

public class Dog {
 public static void main(String args[]) {
	 //Call static method
	 name_of_dog("abc");
	 eat();
	 
 }
 //Static method that provides name of the dog
public static void name_of_dog(String name) {
	 System.out.println(String.format("Name is : %s" , name));
 }
 
 public static void eat() {
	 System.out.println("He is eating");
 
 }
 
}
