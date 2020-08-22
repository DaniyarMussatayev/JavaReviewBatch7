package com.syntax.class12;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateNumberRemover {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence?");
		String str = scan.nextLine();

		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			boolean isRepeated = false;
			for (int j = 0; j < i; j++) {
				if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated) {
				temp += str.charAt(i);
			}
		}

		System.out.println(temp);

		Set<Character> uniqueChars = new TreeSet<>();

		for (int i = 0; i < str.length(); i++) {
			uniqueChars.add(str.toLowerCase().charAt(i));
		}

		System.out.println(uniqueChars);

	}

}
