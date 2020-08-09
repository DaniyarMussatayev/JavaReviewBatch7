package com.syntax.class11;

import java.util.ArrayList;
import java.util.List;

public class SeleniumSample {

	public static void main(String[] args) {

		ArrayList<String> dayList = new ArrayList<String>();

		dayList.add("Monday");
		dayList.add("Tuesday");
		dayList.add("Wednesday");
		dayList.add("Thursday");
		dayList.add("Friday");

		for (String day : dayList) {
			if (day.equals("Tuesday")) {
				System.out.println("Tuesday is selected");
			}
		}

		List<List<String>> credentials = new ArrayList<>();

		List<String> user1 = new ArrayList<String>();

		user1.add("admin");
		user1.add("Qwert123");

		List<String> user2 = new ArrayList<String>();

		user2.add("hvanli");
		user2.add("Qaz123");

		credentials.add(user1);
		credentials.add(user2);

		for (List<String> userCrd : credentials) {
			for (String val : userCrd) {
				System.out.println(val);
			}
			System.out.println("-------------------");
		}

	}

}
