package org.javaPrograms;

public class RemoveSpecialCharInString {

	public static void main(String[] args) {

		String s = "!@#$%Akash";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
