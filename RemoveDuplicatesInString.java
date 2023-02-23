package org.javaPrograms;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String s = "AKASH";
		char search = '\u0000';
		System.out.println("Before removing the duplicates in the string");
		System.out.println(s);
		System.out.println("================");
		for (int i = 0; i < s.length(); i++) {
			search = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char ch = s.charAt(j);
				String value = Character.toString(ch);
				if (ch == search) {
					System.out.println("The duplicates in the string ");
					System.out.println(ch);
					s = s.replace(value, "");

				}
			}
		}
		System.out.println("================");
		System.out.println("After removing the duplicates in the string");
		System.out.println(s);

	}

}
