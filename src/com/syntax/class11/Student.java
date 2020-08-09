package com.syntax.class11;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name, lastName, stuId;
	int age;

	public Student(String stuId, String name, String lastName, int age) {
		this.stuId = stuId;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Student ID : " + stuId);
		System.out.println("Name and Lastname : " + name + " " + lastName);
		System.out.println("Age : " + age);
	}

	public List<String> getNameAndLastName() {
		List<String> info = new ArrayList<>();
		info.add(name);
		info.add(lastName);
		return info;
	}

}
