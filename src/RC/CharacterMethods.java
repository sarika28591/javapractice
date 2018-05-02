package RC;

public class CharacterMethods {

	public static void main(String[] args) {
		//The character class wraps a value of primitive data type char is an object
	char a = 'A';
	char b = '1';
	
	System.out.println(Character.isLetter(a));  //true
	System.out.println(Character.isLetter(b));   //false
	System.out.println(Character.isLetter('Z')); //true
	System.out.println(Character.isLetter('1'));   //false
	
	 System.out.println();
	System.out.println(Character.isAlphabetic(a));
	System.out.println(Character.isAlphabetic('A'));
	
	
	System.out.println();
	System.out.println(Character.isDigit(a));   //false
	System.out.println(Character.isDigit(b));   //true
	System.out.println(Character.isDigit('Z')); //false
	System.out.println(Character.isDigit('1')); //true
	
	System.out.println();
	System.out.println(Character.isUpperCase(a)); // True
	System.out.println(Character.isLowerCase(a)); //false
	
	
	
	}

}
