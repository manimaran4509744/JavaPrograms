package org.javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingInArrayBuiltInMethods {

	public static void main(String[] args) {

		Integer[] a = { 23, 34, 53, 25, 13, 32 };
		// FirstApproach
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));

		// SecondApproach
//        Arrays.parallelSort(a);
//        System.out.println(Arrays.toString(a));
		
		
		// DescendingOrder
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}
