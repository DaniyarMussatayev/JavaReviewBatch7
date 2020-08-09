package com.syntax.class10;

public interface A {
	
	public static final String SCHOOL_NAME="Harvard University";
	
	void method1();

	void method2();

	default void method3() {

	}

	static void staticMethod() {
		System.out.println("123");
	}

}
