package exercises.additional;
/* The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book. The ISBN is based upon a 10-digit code. The ISBN is legal if:
1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
example: For an ISBN 1401601499:
Sum=1×1 + 2×4 + 3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.
Write a program to implement the following methods: inputISBN( ) to read the ISBN code as a 10-digit integer. checkISBN() to perform the following check operations :
i) If the ISBN is not a 10-digit integer, output the message “ISBN should be a 10 digit number” and terminate the program.
ii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above. 
If the sum is divisible by 11, output the message, “Legal ISBN”; otherwise output the message, “Illegal ISBN” */

import java.util.Scanner;

public class Lab3aQ1 {
	
	public static void main(String[] args) {
		System.out.println("Welcome to ISBM Checker!");
		ISBN ISBN = new ISBN();
		ISBN.inputISBN();
		ISBN.checkISBN();
	}
}

class ISBN {
	
	long ISBN;
	
	void inputISBN() {
		
		System.out.print("Enter ISBN: ");
		Scanner src = new Scanner(System.in);
		ISBN = src.nextLong();
	}
	
	void checkISBN() {
		
		String ISBN = Long.toString(this.ISBN);
		if(ISBN.length() != 10) {
			System.out.println("ISBN must be 10 digits.");
			System.exit(0);
		} else {
			
			int total = 0;
			for(int i=0; i< ISBN.length(); i++) {
				
				total += (Character.getNumericValue(ISBN.charAt(i))*(i+1));
			}
			
			System.out.println((total%11==0)?"Valid ISBN":"Invalid ISBN");
		}
	}
	
}