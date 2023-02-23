package org.javaPrograms;

import java.util.Scanner;

public class CountTheDigits {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number=sc.nextInt();
		int count=0;
		/*First Approch
		while(true) {
			if(number==0)
			{
				break;
				
			}
			count++;
			number=number/10;
		}
		
		System.out.println(count);
		*/
		
	/* Second Approach
		while(number>0) {
			count++;
			number=number/10;
		}
		System.out.println(count);
		*/ 
}
}
