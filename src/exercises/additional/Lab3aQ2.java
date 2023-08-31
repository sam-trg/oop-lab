package exercises.additional;
/* Create a Die class with one integer instance variable called sideUp. Give it a getSideUp() method 
 * that returns the values of sideUp and a void roll() method that changes sideUpto a random value from 1 to 6.
 * Then create a DieDemo class with a method that creates two Die objects, 
 * rolls them, and prints the sum of the two sides up. */

import java.util.Random;

public class Lab3aQ2 {
	
	public static void main(String[] args) {
		
		Dice Die1 = new Dice();
		Dice Die2 = new Dice();
		Die1.roll();
		Die2.roll();
		int sum = Die1.getSideUp() + Die2.getSideUp();
		System.out.println("Sum of rolls is "+ sum);
		
	}
	
}

class Dice {
	
	private int sideUp;
	
	int getSideUp() {
		
		return sideUp;
	}
	
	void roll() {
		
		Random roll = new Random();
		sideUp = roll.nextInt(6)+1;
				
	}
}