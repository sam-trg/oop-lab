package exercises;

import java.util.Collections;
import java.util.Scanner;

/* Write and execute a Java program to convert strings containing numbers into 
 * comma- punctuated numbers, with a comma every third digit from the right.
e.g., Input String : “1234567” Output String : “1,234,567” */


public class Lab5Q6 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		String input = src.nextLine();
		
		StringBuilder answerMaker = new StringBuilder();
		
		int count=0;
		StringBuilder inputFormatter = new StringBuilder();
		inputFormatter.reverse();
		
		for(char i : inputFormatter.toString().toCharArray()) {
			
			if(count%3==0) {
				answerMaker.append(',');
			}
			answerMaker.append(i);
			count++;
			
		}

		
		String answer = answerMaker.reverse().toString();
		
		System.out.println(answer);
		
	}

}
