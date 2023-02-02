package org.javaPrograms;

import java.util.Scanner;

public class ReverseTheWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] s1 = s.split("\\W+");
		// firstApproach
//		for(int i=0;i<s1.length;i++) {
//			String newString= s1[i];
//			StringBuilder sb = new StringBuilder(newString);
//			newString=sb.reverse().toString();
//			s1[i]=newString;
//		}
//		
//		for(String s2:s1) {
//			System.out.println(s2);
//		}
//		
		// SecondApproach
		String temp = "";
		for (int i = 0; i < s1.length; i++) {
			
			
			String newString = s1[i];
			for (int j = newString.length() - 1; j >= 0; j--) {
				char ch = newString.charAt(j);
				temp = temp + ch;

			}
			temp=temp+" ";
		}
		temp=temp.trim();
		s=temp;
		System.out.println(s);
		

	}

}
