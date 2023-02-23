package org.javaPrograms;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which symbol or character do you want to be printed like pyramid");
		String character = sc.nextLine();

		System.out.println("How many times do you want to be printed like pyramid");
		int times = sc.nextInt();
		/*
		String space = " ";
		String s = "";
		String h = character;
		int count = 0;
		int n = times * 2;
		int o = times - 2;
		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				for (int k = o - count; k >= 0; k--) {
					s = s + space;

				}
				count++;
				for (int j = 1; j <= i; j++) {

					s = s + h;

				}

				System.out.println(s);
				s = "";

			}

		}
		*/
		//Second Approach
		
		
		for(int i=0;i<=times;i++) {
			for(int j=0+i;j<=times;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				
				System.out.print(character);
			}
			System.out.println();
		}

	}

}
