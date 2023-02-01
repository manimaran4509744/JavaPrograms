package org.javaPrograms;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		int count = 0;
		String set1[] = { "Akash","Ganesh","Vignesh"};
		String set2[] = { "Akash", "Ganesh", "Vignesh" };
//		if(set1.length==set2.length) {
//		for (String newSet1 : set1) {
//			String value = newSet1;
//			for (String newSet2 : set2) {
//				if (value.equals(newSet2)) {
//					count++;
//				}
//			}
//			
//		}
//		if (count == 3) {
//			System.out.println("Both arrays are equal");
//		} else {
//			System.out.println("Both arrays are different");
//		}
//		}
//		else {
//			System.out.println("Both the array have different length  so they are different to each other");
//		}
		
		
		//Second Approach
//		boolean set=Arrays.equals(set1, set2);
//		System.out.println(set);
		
		
		//Third Approach
		boolean status=false;
		if(set1.length==set2.length) {
		for(int i=0;i<set1.length;i++) {
			if(set1[i].equals(set2[i])) {
				status=true;
				
			}
			else {
				status=false;
			}
	
		}
		}
		else 
		{
			System.out.println("Arrays length are different");
		}
		System.out.println("Both the arrays are "+status);
		
	}

	}
