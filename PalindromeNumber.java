package org.javaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = num;
		int rev = 0;
		while (true) {
			if (num == 0) {
				break;
			}
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (reverse == rev) {

			System.out.println("Given number is palindrome");

		} else {
			System.out.println("Given number is not palindrome");
		}

	}

}
