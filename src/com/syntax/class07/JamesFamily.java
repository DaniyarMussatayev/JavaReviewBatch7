package com.syntax.class07;

public class JamesFamily {
	static String lastN;
	String name;
	int age;

	void printInformation() {
		System.out.println(name + " " + lastN + " is " + age + " old");
	}
	
	public static void main(String[] args) {
		JamesFamily obj =new JamesFamily();
		obj.name = "Nick";
		lastN = "James";
		obj.age =20;
		obj.printInformation();
		
		JamesFamily obj2 =new JamesFamily();
		obj2.name = "Bella";
		lastN = "James";
		obj2.age=21;
		obj2.printInformation();
		
	}
}
