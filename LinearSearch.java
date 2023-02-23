package org.javaPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 6, 4 };
		Scanner sc = new Scanner(System.in);
		int findThisNumber = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < num.length; i++) {
			if (findThisNumber == num[i]) {
				flag = true;
				System.out.println("Found Number is :" + num[i]);
				break;
			}

		}
		if (flag == true) {
			System.out.println("Number is found");
		} else {
			System.out.println("Number isn't found");
		}

	}

}
