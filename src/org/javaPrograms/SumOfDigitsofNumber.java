package org.javaPrograms;

import java.util.Scanner;

public class SumOfDigitsofNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		int rev=0;
		while(number>0) {
			rev=number%10;
			sum=sum+rev;
			number=number/10;
			
		}
		System.out.println("The Sum of the given number is "+sum);
		
		
	}

}
