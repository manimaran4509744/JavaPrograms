package org.javaPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//First Approach
//		if(a>b&&a>c) {
//			System.out.println("A is greatest among other two numbers");
//		}
//		else if(b>a&&b>c) {
//			System.out.println("B is greatest among other two numbers");
//		}
//		else if(c>a&&c>b){
//			System.out.println("C is greatest among other two numbers");
//		}
//		else{
//			 System.out.println("Dont enter the same numbers ");
//		}
//		
		
		int largest=a>b?a:b;
		int largest2=largest>c?largest:c;
		System.out.println("The Greatest number is  : "+largest2);
	}

}
