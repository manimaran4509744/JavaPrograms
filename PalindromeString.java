package org.javaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String reverse="";
		int inputLength=input.length();
		for(int i=inputLength-1;i>=0;i--) {
			char ch=input.charAt(i);
			reverse=reverse+ch;
			
		}
		
          if (input.equals(reverse)) {
			System.out.println("The Given Word is Palindrome");
		} else {

			System.out.println("The Given Word isn't Palindrome");
			
			
		}
	}

}
