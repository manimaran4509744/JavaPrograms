package org.javaPrograms;

public class SumOfArray {

	public static void main(String[] args) {

		int[] a = { 2, 5, 7, 8, 9 };
		int sum = 0;
		// FirstApproach
		// int i=0;
//		while(i<a.length) {
//			sum= sum+a[i];
//			i++;
//		}
		// SecondApproach
		for (int b : a) {
			sum = sum + b;
		}
		System.out.println("The sum of given array is : " + sum);

	}

}
