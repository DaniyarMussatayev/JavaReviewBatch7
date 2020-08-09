package com.syntax.class10;

public interface Vehicle {
	// Steps to achieve abstraction with interface
		// 1. Create an interface
		// 2. Create public abstract methods and/or public static final variables inside interface
		// 3. Create a class and apply inheritance
		// 4. Implement all unimplemented methods inside the concrete class
		
		void changeGear(int gear);  // --> public abstract
		void speedUp (int speed);
		void applybreak(int brk);
		
		default void lastMethod() {};
		
		// can we make abstract methods other than public?
		// can we decrase visibility?
		// can we have static class in interface?  --> Yes
		// can we have default methods inside interface? --> Yes
		
		default void method1() {
			System.out.println("I am a method implemented inside Interface");
		}
		
		// ChromeDriver class extends RemoteWebdriver  implements WebDriver interface


}
