package org.javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Actually primenumber will come only in one table and then that given prime number table eg: suppose we give 2 to find out it is prime number or not then it should only be able to be divided by one table and 2 table and not able to be divided by other table
		// Then only it is a prime number.
		// if the number is able to be divided other than 1 and its number then it's not prime number.
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		//primenumber starts from 2 and if the given number is greater than 1 then only it might be primenumber otherwise it can't be.
		
		if(number>1) {
			//Here i = 1 means , going to divide the number from 1 onwards untill upto the given number.
			for(int i=1; i<=number;i++) {
				if(number%i==0) {
					count++;
				}
				
			}
			if(count<=2) {
				System.out.println("Given number is a primenumber");
			}
			else {
				System.out.println("Given number isn't a prime number");
			}
		}
		else {
			System.out.println("Given number isn't a prime number");
		}
	}

}
