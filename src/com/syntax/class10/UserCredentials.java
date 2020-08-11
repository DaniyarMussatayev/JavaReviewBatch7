package com.syntax.class10;

public class UserCredentials {
//	Encapsulation Task
//	1.Assume that we have a web application and we are creating login credentials for login.
//	2.Create UserCredentials class
//	3.Declare private username and password instance variables / name and lastName public instance variables
//	4.Create setters for username and password
//	5.Username; 
//	a)Should Not include name and lastName for privacy concerns
//	b)Must be at least 8 characters long
//	6.Password 
//	a)Should not include name, lastName and username
//	b)Must be at least 8 characters long
//	c)Must include at least one uppercase, one lowercase, one number and one special characters
//	7.Create getters for username and and password
//	a)For username we should see first and last characters (ha******li)
//	b)For password we should see only first and last characters (Q*********5)
//	8.Create a login method to logon our we application
//	a)Methods requests user to enter username and password
//	i.If username and password are correct we should see "Login successful" message
//	ii.Otherwise we should see "Invalid credentials" message.
//	9.Create TestLogin class to test your logic. 

	private String username, password;
	public String name, lastName;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		if (password.length() >= 8) {
			if (!(password.contains(name)) || !(password.contains(lastName)) || !(password.contains(username))) {
				if (!(password.equals(password.toUpperCase())) && !(password.equals(password.toLowerCase()))
						&& !(password.equals(password.replaceAll("[0-9]", "")))
						&& !(password.equals(password.replaceAll("\\W", "")))) {
					this.password = password;

				}
			}
		}
	}

	public String getUsername() {
		String print = "";
		for (int i = 0; i < username.length(); i++) {
			if (i == 0 || i == 1 || i == username.length() - 1 || i == username.length()) {
				print += username.charAt(i);
			} else {
				print = "*";
			}
		}
		return print;
	}

	public String getPassword() {
		String print="";
		for(int i=0;i<password.length();i++) {
			if(i==0||i==password.length()-1) {
				print+=password.charAt(i);
			}else {
				print="*";
			}
		}
		return print;
	}
	
	public void login() {
		System.out.println("Please enter your username and password");
		if(username.equals(this.username) && password.equals(this.password)){
			System.out.println("Login successful");
		}else {
			System.out.println("Invalid credentials");
		}
		
	}
}
