package javabasics;

public class ForloopinArray {
	public static void main(String args[]) {
		double[] numList = {101.2, 202.2, 303.2,404.2};
		//print all the elements of array
		for(int i=0; i< numList.length; i++) {
			System.out.println(numList[i]);
		}
		
		//Sum all the elements of the array
		double sum = 0; //Initialize double datatype sum variable should be 0
		for(int i=0; i< numList.length; i++) {
			sum = sum + numList[i];
		}
		System.out.println("Sum is" + sum);
		
		//find the largest element of the array
		double max = numList[0]; //Initializing first element as large element.
		for(int i=1; i< numList.length; i++) {
			if(numList[i] > max) {
				max = numList[i];
				}
		}
			System.out.println("Large number is " + max);
			
		//find the smallest element of the array	
			double min = numList[0];
			for(int i=1; i< numList.length; i++) {
				if(numList[i] < min) {
					min = numList[i];
					}
			}
				System.out.println("Small number is " + min);
				
		}
	}


