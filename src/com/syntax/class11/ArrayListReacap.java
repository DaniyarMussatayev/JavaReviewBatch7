package com.syntax.class11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReacap {
	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>(); // -->

//		String[] nameArr=new String[4];

		// add(Object o) --> adds an element to existing ArrayList

		nameList.add("James");
		nameList.add("Jimmy");
		nameList.add("Jack");

		nameList.add("James");

		System.out.println(nameList);

		// add(int index, Object o) --> method overloading

		nameList.add(2, "Oliver");

		System.out.println(nameList); // auto indexing - dynamic structure

		// remove(Object o) --> remove(int index)

//		nameList.remove("James");
//		System.out.println(nameList);

		nameList.remove(1);
		System.out.println(nameList);

		// set(int index, Object o)

		nameList.set(1, "Donald");
		System.out.println(nameList);

		// indexOf(Object o) --> returns the index of a given object -- int value
		System.out.println(nameList);

		System.out.println(nameList.indexOf("James"));

		System.out.println(nameList.indexOf("Abraham"));

		// get(int index) --> returns the object at given index

		System.out.println(nameList.get(2));

//		System.out.println(nameList.get(5));  // what is the output

		// size() --> returns the number of objects inside the list

		System.out.println("Number of Objects : " + nameList.size());

		// contains(Object o) --> returns a boolean wheter the list contains the given
		// object

		boolean isContain = nameList.contains("Donald");
		System.out.println(isContain);

		// clear() --> deletes all objects inside the list and returns no value

//		nameList.clear();
		System.out.println(nameList);

		// addAll(Collection c)

		ArrayList<String> names = new ArrayList<>();

		names.add("Michael");
		names.add("Alex");
		names.add("Lionel");

		nameList.addAll(names);

		System.out.println(nameList);

		// non generic declaration of lists

		ArrayList arrList = new ArrayList();

		// generic declaration

		ArrayList<Object> objList = new ArrayList<>();

	}

}
