package javabasics;

public class AccessorGetterMethod{
public static void main(String[] args) {
Automobile A = new Automobile(model : "taurus", make : "ford");
  System.out.println("car model is" + A.getModel());
  System.out.println("card make is" + A.getMake());
  A.start();
}
}




