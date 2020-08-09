package com.syntax.class11;

public class Collection {
	// primitive and non-primitive
	// byte-short-int-long-float-doauble-boolean-char
	// String, User created objects
	// Non-primitive data
	// Wrapper Class -> Converts primitive data into object

	public static void main(String[] args) {

		// byte-short-int-long-float-doauble-boolean-char
		// Byte, Short, Integer, Float, Double, Boolean, Character

		// boxing --> Converting a primitive type data to a non primitive one
		// boxing
		// auto-boxing
		// unboxing
		// unboxing
		// auto unboxing

		Integer i = new Integer(15); // boxing
		Integer i1 = 45; // auto boxing

		// unboxing --> Converting a non-primitive value to a primitive value

		int i2 = i1.valueOf(i1); // --> unboxing
		int i3 = i; // --> auto unboxing

		// We do not need to do for boxing and unboxing primitive values

		// Arrays in Java
		// What kind of data type we can put in an array? A: primitive and Non-primitive

		int[] numArr = { 12, 3, 15, 16, 56 };
		String[] strArr = { "Oliver", "Jesus", "Moses", "Abraham" };

		Student[] students = new Student[3];

		students[0] = new Student("ST001", "Michael", "Knight", 65);
		students[1] = new Student("ST002", "Donald", "Duck", 56);

		Student stu = new Student("ST003", "Jimmy", "Johns", 35);

		students[2] = stu;

		// we can put primitive and non-primitive values inside an Array
		// we cannot use primitive values while using collections

	}

}
