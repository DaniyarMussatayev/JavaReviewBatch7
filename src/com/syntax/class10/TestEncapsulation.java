package com.syntax.class10;

public class TestEncapsulation {
public static void main(String[] args) {
		
		School stu=new School("John", "Terry", "JT0001");
		
//		stu.setSSN("1234567890");
		
//		stu.setSSN("12345678t");
		stu.setSSN("123457896");
		
		String SSN=stu.getSSN();
		
		System.out.println(SSN);
	}


}
