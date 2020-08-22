package com.syntax.class12;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String value :");

		String str = scan.nextLine();

		String temp = str.toLowerCase().replaceAll("[^a-z]", "");

		System.out.println(temp);

		String nonRepatedChars = "";

//		for(int i=0; i<temp.length(); i++) {
//			boolean isRepeated=false;
//			for(int j=0; j<i; j++) {
//				if(temp.charAt(i)==temp.charAt(j)) {
//					isRepeated=true;
//					break;
//				}
//			}
//			
//			if(!isRepeated) {
//				nonRepatedChars+=temp.charAt(i);
//			}			
//		}

		// find out each character repeated how many times?

//		for(int i=0; i<nonRepatedChars.length(); i++) {
//			int count=0;
//			for(int j=0; j<temp.length(); j++) {
//				if(nonRepatedChars.charAt(i)==temp.charAt(j)) {
//					count+=1;
//				}
//			}
//			
//			System.out.println(nonRepatedChars.charAt(i)+" is repeated "+ count + " times");
//		}

		// Using set inteface

		Set<Character> chars = new TreeSet<>();

		for (int i = 0; i < temp.length(); i++) {
			chars.add(temp.charAt(i));
		}

		System.out.println(chars);

	}

}
