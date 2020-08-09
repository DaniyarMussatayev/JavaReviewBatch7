package com.syntax.class11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUserDefinedObjects {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		Student stu1 = new Student("ST0001", "Donald", "Duck", 65);
		Student stu2 = new Student("ST0002", "Michael", "Knight", 55);

		students.add(stu1);
		students.add(stu2);

		students.add(new Student("ST9999", "Oliver", "Kahn", 46));

		// how many elements do we have inside students list

//		System.out.println(students.size());

		students.add(new Student("ST9990", "Lionel", "Messi", 34));

		// How can we iterate and access Student objects inside students list

		// regular for loop --> we have index values
		// advanced/for each loop
		// iterator

		// Regular for loop

		int size = students.size();
		// index values --> 0, 1, 2, 3

		for (int i = 0; i < size; i++) {

			Student stu = students.get(i); // --> retrive the Student object at the given index

//			String nameAndlastName=stu.name+" "+stu.lastName;
//			String stuId=stu.stuId;
//			int age=stu.age;
//			
//			System.out.println(nameAndlastName);
//			System.out.println("Student ID : "+stu.stuId);
//			System.out.println("Age : "+age);

//			stu.displayInfo();

//			System.out.println("--------------------------------");

		}

		// enhanced / for each loop

		for (Student stu : students) {
//			stu.displayInfo();
			System.out.println("-----------------");
		}

		// iterator --> hasNext() , next(), remove();
		/*
		 * 1. create iterator object 2. use while loop to iterate ArrayList
		 */

		Iterator<Student> it = students.iterator();
		// hasNext() --> returns us a boolean whether iterator has any more elements

////		stu1 obj
//		Student a=it.next(); // brings us the first student inside students ArrayList
//		
//		a.displayInfo();
//		
//		System.out.println("---------------------------------");
////		stu2 obj
//		
//		a=it.next();
//		a.displayInfo();
//		
//		System.out.println("---------------------------------");
//		
////		stu3 obj
//		
//		a=it.next();
//		a.displayInfo();
//		System.out.println("---------------------------------");
//		
////		stu4 obj
//		
//		a=it.next();
//		a.displayInfo();
//		
//		
//// What happens if we use next() one more time?
//		
//		it.next().displayInfo();

		while (it.hasNext()) {
			Student s = it.next();
			s.displayInfo();
			System.out.println("==================");
		}

		// we can use iterator only for once with a while loop
		// we need to reinitialize iterator

		it = students.iterator();

		// how to delete all Student objects inside students ArrayList by using iterator

//		while(it.hasNext()) {
//			it.next();
//			it.remove();
//		}

//		System.out.println(students);

		// How to delete all elements in a list with regular for loop

//		for(int i=0; i<students.size(); i++) {
//			students.remove(0);
//		}	
//		
//		System.out.println(students.size());

		for (int i = students.size() - 1; i >= 0; i--) {
			students.remove(i);
		}

		System.out.println(students.size());
	}

}
