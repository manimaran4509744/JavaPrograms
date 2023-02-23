package org.javaPrograms;

public class CountTheWordInString {

	
	public static void main(String[] args) {
     // char ch2=' ';
      int count=1;
	String word="Akash   Manimaran Durga";
//		for(int i=0;i<word.length();i++) {
//			char ch = word.charAt(i);
//			if(ch==ch2) {
//				count++;
//			}
//		}
		//System.out.println(count);
	
		//secondApproach
	
//		for(int i=0;i<word.length();i++) {
//			char ch3= word.charAt(i);
//			
//			if(ch3==' '&& word.charAt(i+1)!=0) {
//				count++;
//			}
//		}
//		System.out.println(count);
	
//		Third Approach if the given string has morethan two spaces 
	
		String [] s=word.split("\\W+");
		int length2=s.length;
		System.out.println(length2);
	}

	
	
}
