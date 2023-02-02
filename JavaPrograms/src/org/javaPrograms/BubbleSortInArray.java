package org.javaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortInArray {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int size=sc.nextInt();
           int []a = new int[size];
           for(int i=0;i<size;i++) {
        	  a[i]= sc.nextInt();
           }
           
//		int[] a = { 200, 3, 100, 1, 2 ,78};
		int value = a[0];
		System.out.println("===============Before sorting=================");
		System.out.println("             "+Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (value > a[j]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					value = a[j];
				} else {
					value = a[j];
				}
			}
			value = a[0];
		}
		System.out.println("===============After sorting=================");
		System.out.println("             "+Arrays.toString(a));
//		for (int b : a) {
//			System.out.println(b);
//		}

	}

}
