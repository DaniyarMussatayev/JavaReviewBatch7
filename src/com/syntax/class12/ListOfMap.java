package com.syntax.class12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {
	public static void main(String[] args) {

		Map<String, String> emp1 = new HashMap<>();

		emp1.put("name", "James");
		emp1.put("lastName", "Miller");
		emp1.put("gender", "Male");

		Map<String, String> emp2 = new HashMap<>();

		emp2.put("name", "Victoria");
		emp2.put("lastName", "Green");
		emp2.put("gender", "Female");

		Map<String, String> emp3 = new HashMap<>();

		emp3.put("name", "John");
		emp3.put("lastName", "Terry");
		emp3.put("gender", "Male");

		List<Map<String, String>> employees = new ArrayList<>();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		// we will use collections and map for test parametrization --> to test our
		// application with
		// different sets of data

		// lets try to retrieve all information of employees one by one

		for (int i = 0; i < employees.size(); i++) {
			Map<String, String> emp = employees.get(i);

			String name = emp.get("name");
			String lastName = emp.get("lastName");
			String gender = emp.get("gender");

			System.out.println(name + " " + lastName + " is a " + gender);

			System.out.println("-------------------------");
		}

	}

}
