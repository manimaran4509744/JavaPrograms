package org.javaPrograms;

public class SwappingTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		int a=20;
		int b=50;
		System.out.println("Before swapping The value of A is:"+a);
		System.out.println("Before swapping The value of B is:"+b);
		System.out.println("======================================");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping The value of A is:"+a);
		System.out.println("After swapping The value of B is:"+b);
		System.out.println("======================================");
	}

}
