package com.syntax.class11;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		Student stu1 = new Student("ST0001", "Donald", "Duck", 65);
		Student stu2 = new Student("ST0002", "Michael", "Knight", 55);

		students.add(stu1);
		students.add(stu2);

		students.add(new Student("ST9999", "Oliver", "Kahn", 46));
		
//		List<String> nameLastNameList=students.get(0).getNameAndLastName();
		
//		String name=nameLastNameList.get(0);
//		String lastname=nameLastNameList.get(1);
//		
//		System.out.println(name);
//		System.out.println(lastname);
		
		for(Student stu:students) {
			List<String> nameAndLastnameList=stu.getNameAndLastName();
			
			for(String str:nameAndLastnameList) {
				System.out.println(str);
			}
			
			System.out.println("==========================");
		}
	}

	

}
