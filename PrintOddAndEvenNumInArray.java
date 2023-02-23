package org.javaPrograms;

public class PrintOddAndEvenNumInArray {

	public static void main(String[] args) {
 
		int []a = {2,5,7,8,9};
		for(int b:a) {
			if(b%2==0) {
				System.out.println(b+" is an even number");
			}
			else {
				System.out.println(b+" is an odd number");
			}
		}
		
		
		
		
	}

}
