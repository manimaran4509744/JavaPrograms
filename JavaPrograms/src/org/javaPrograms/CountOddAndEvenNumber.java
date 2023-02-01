package org.javaPrograms;

import java.util.Scanner;

public class CountOddAndEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int givenNum = sc.nextInt();
		int oddCount = 0;
		int evenCount = 0;
		int rev = 0;

		while (givenNum > 0) {
			rev = givenNum % 10;
			givenNum = givenNum / 10;
			if (rev % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("The odd number count in given number is: " + oddCount + "\n"
				+ "The even number count in given number is: " + evenCount);

	}

}
