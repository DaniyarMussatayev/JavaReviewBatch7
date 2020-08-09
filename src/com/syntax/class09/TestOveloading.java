package com.syntax.class09;

public class TestOveloading {
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();

//		obj.method();

		obj.method(15);
//		
		obj.method("word");
//		
		obj.method(15, "word");
//		
		obj.method("tree", 5);
	}

}
