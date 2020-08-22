package com.syntax.class12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ListRecap {
	public static void main(String[] args) {

		// How can we iterate through a List
		// Regular For Loop --> we have index
		// Enhanced/For Each Loop
		// Iterator

		// --> we have index vaules for each object
		// --> We may have duplicate values with the list

		// --> No duplicate value
		// --> No index value

		// HashSet - LinkedHashSet -- TreeSet

		Set<String> names = new TreeSet<>();

		names.add("Michael");
		names.add("Donald");
		names.add("James");
		names.add("Jimmy");
		names.add("Michael");

		System.out.println(names.size());
		System.out.println(names);

		// Enhanced For Loop

		System.out.println("-------------Regular For Loop--------------");

		for (String name : names) {
			System.out.println(name);
		}

		// Iterator

		System.out.println("-------------Iterator--------------");

		// 1. Declare iterator

		Iterator<String> it = names.iterator();

		// 2. We will loop with while

//		while(it.hasNext()) {
//			String name=it.next();
//			System.out.println(name);
//		}

		// can we access values inside a set without using while with iterator

//		System.out.println(it.next());
//		System.out.println(it.next());

		// can we use for loop to retrieve all values from a set or list

		for (int i = 0; i < names.size(); i++) {
			String name = it.next();
			System.out.println(name);
		}

		// how many methods we have with iterator

		// write a java program to remove duplicate letters from a string without usein
		// Set interface

	}

}
