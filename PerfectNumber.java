package org.javaPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int s=sc.nextInt();
//		int num= s;
//		int sum=0;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				sum=sum+i;
//			}
//		}
//		if(num==sum) {
//			System.out.println("The Given number is perfect number");
//		}
//		
//		else {
//			System.out.println("The Given number isn't perfect number");
//		}

		// Find the perfect number from 1 to 500
		int sum = 0;
		for (int i = 1; i <= 500; i++) {
			for (int j = 1; j <= 500; j++) {
				if (i == j) {
					continue;
				}
				if (i % j == 0) {
					sum = sum + j;
				}
			}

			if (sum == i) {
				System.out.println(i + " is a perfect number ");

			}
			sum = 0;

		}
	}

}
