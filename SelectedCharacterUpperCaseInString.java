package org.javaPrograms;

public class SelectedCharacterUpperCaseInString {

	public static void main(String[] args) {

		String s = "akash";
		char firstChar = 'k';
		char secondChar = 'h';
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String character = Character.toString(ch);
			if (ch == firstChar || ch == secondChar) {
				String upper = character.toUpperCase();
				s = s.replace(character, upper);
			}

		}
		System.out.println("After the converting into uppercase of given characters");
		System.out.println(s);

	}

}
