package javabasics;

public class array {
	public static void main(String args[]) {
		String[] studentNames = new String[] {"john" , "sarika" , "harry" , "nick"};
		int[] studentAge = new int[] {20 , 26 , 45 , 66};
		
		//other option
		String studentSubject[] = new String[3];
		studentSubject[0] = "English";
		studentSubject[1] = "Marathi";
	    studentSubject[2] = "Hindi";
		
		System.out.println(studentNames[1]);
		System.out.println(studentAge[1]);
		System.out.println(studentSubject[2]);
	}

}
