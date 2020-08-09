package com.syntax.class09;

public class Square extends Shape{
	// we created a class and define and implement some methods
	// we created other class -- Square and Rectangle -- and extend them to the firt class (Shape Class)
	
	int length;
	
	public Square(int length) {
		super();
		this.length = length;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area of the given Square is : "+ (length*length));
	}
	
	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of the given Square is : "+(4*length));
	}
}
