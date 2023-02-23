package org.javaPrograms;

public class Anagram {

	public static void main(String[] args) {

		String GivenWord = "RANT";
		// This logic will only work if checkword doesn't contain any duplicate
		// characters
		String CheckWord = "TANP";
		char[] ch = CheckWord.toCharArray();
		int count = 0;
		int sizeOfWord = GivenWord.length();
		for (int i = 0; i < GivenWord.length(); i++) {

			char value = GivenWord.charAt(i);

			for (int j = 0; j < ch.length; j++) {

				if (value == ch[j]) {
					count++;
				}

			}

		}
		if (count == sizeOfWord) {

			System.out.println("The Given word is Anagram");
		} else {

			System.out.println("The Given word isn't Anagram");
		}
	}

}
