package com.syntax.class10;

public class TestLogin {
	public static void main(String[] args) {
		UserCredentials user = new UserCredentials();
		user.name="Syntax";
		user.lastName="Tech";
	
		user.setUsername("admin");
		user.setPassword("1234567890");
		System.out.println(user.getUsername());

		
	}

}
