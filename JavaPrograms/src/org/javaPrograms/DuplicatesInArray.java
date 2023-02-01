package org.javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] num = { 2, 4, 5, 7, 7 };
//        boolean flag=false;
//        for(int i=0;i<num.length;i++) {
//        	for(int j=i+1;j<num.length;j++) {
//        		if(num[i]==num[j]) {
//        			System.out.println("The duplicate value is "+num[j]);
//        			flag=true;
//        		}
//        	}
//        }
//        if(flag==true) {
//        	System.out.println("Duplicate is found");
//        }
//        else {
//        	System.out.println("Duplicate isn't found");
//        	
//        }
		// Approach2
		Set<Integer> set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			int num2 = num[i];
			boolean status = set.add(num2);
			if (status == false) {
				System.out.println("Duplicate is found :" + num[i]);
			}
		}

	}

}
