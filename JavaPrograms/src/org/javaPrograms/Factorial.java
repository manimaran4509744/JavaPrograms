package org.javaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
//		for(int i=number-1;i>=0;i--) {
//			factorial=factorial*(number-i);
//		}
//		System.out.println(factorial);
		// Second Approach
//		for(int i=1;i<=number;i++) {
//			factorial = factorial*i;
//		}
//		System.out.println(factorial);
                //Third Approach
		int i = 1;
		while (i <= number) {
			factorial = factorial * i;
			i++;
		}
		System.out.println(factorial);

	}

}
