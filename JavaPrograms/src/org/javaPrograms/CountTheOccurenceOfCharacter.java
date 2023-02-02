package org.javaPrograms;

public class CountTheOccurenceOfCharacter {

	public static void main(String[] args) {

		String s = "AKASHMANIMARAN";
		//First Approach
//		char[] ch = s.toCharArray();
//		char value = 'M';
//	
//		int count = 0;
//		boolean flag = false;
//		for (int i = 0; i < ch.length; i++) {
//			char ch1 = ch[i];
//			if (ch1 == value) {
//				flag = true;
//				count++;
//			}
//
//		}
//		if (flag != true) {
//			System.out.println("The Character " + value + " doesn't have occurence in the given string");
//
//		}
//		System.out.println("The Number of Occurence of " + value + " is : " + count);
		
		//Second Approach
		String value2="M";
	     int orginalLength=s.length();
	    int presentLength= s.replace(value2,"").length();
	    int newCount=orginalLength-presentLength;
	    System.out.println("The Number of Occurence of "+value2+" is :"+newCount);
	    
	

	}

}
