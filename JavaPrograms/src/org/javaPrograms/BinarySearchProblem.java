package org.javaPrograms;

import java.util.Arrays;

public class BinarySearchProblem {

	public static void main(String[] args) {
        
		int[] i = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int search = 2;
//		int lowest = 0;
//		int largest = i.length - 1;
//		boolean flag=false;
//		while (lowest <= largest) {
//			int middle = (lowest + largest) / 2;
//			if (i[middle] == search) 
//			{
//				System.out.println("The number is found");
//				System.out.println("The index positon of search number is :  " );
//				flag=true;
//				break;
//			}else if (i[middle] > search) {
//				largest = middle - 1;
//			} 
//			else if  (i[middle] < search) {
//				lowest = middle + 1;
//		}
//		 }
//         if(flag!=true) {
//        	 System.out.println("The number isn't found");
//        
//	}
         int binarySearch = Arrays.binarySearch(i, 50);
         System.out.println(binarySearch);
         
         

	}
	}
