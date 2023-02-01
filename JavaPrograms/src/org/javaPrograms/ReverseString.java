package org.javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		  /*First approach 
		  StringBuilder sb = new StringBuilder(word); sb.reverse();
		  System.out.println(sb);
		  */
		 
		
		  /*Second approach 
		  StringBuilder sb = new StringBuilder(); for(int
		  i=word.length()-1;i>=0;i--) { char charAt = word.charAt(i);
		  sb.append(charAt);
		  
		  } System.out.println(sb);
		 */
		
		 /*Third approach 
		  String s =""; for(int i=word.length()-1;i>=0;i--) { char
		  charAt= word.charAt(i); String charValue=Character.toString(charAt); s=
		  s+charValue; } System.out.println(s);
		   */
		 
	
		/*Fourth approach 
		 String s=""; char[] wordList = word.toCharArray(); for(int
		  i=wordList.length-1;i>=0;i--) { char list= wordList[i]; s=s+list;
		  
		  } System.out.println(s);
		 */

	}
}
