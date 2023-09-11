package exercises;

import java.util.Collections;
import java.util.Scanner;

/* Write and execute a Java program to convert strings containing numbers into 
 * comma- punctuated numbers, with a comma every third digit from the right.
e.g., Input String : “1234567” Output String : “1,234,567” */


public class Lab5Q6 {

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		
		Scanner src = new Scanner(System.in);
		
		String input = src.nextLine();
		
		StringBuilder answerMaker = new StringBuilder();
		
		StringBuilder inputFormatter = new StringBuilder(input);
		
		inputFormatter.reverse();
		
		for(int i = 0; i<inputFormatter.length(); i++) {
			
			if(i%3==0 && i!=0) answerMaker.append(',');
			
			answerMaker.append(inputFormatter.charAt(i));
			
		}
		
		answerMaker.reverse();
		
		String answer = answerMaker.toString();
		
		System.out.println(answer);
		
	}

}
