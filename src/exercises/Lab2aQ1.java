package exercises;

import java.util.Scanner;

public class Lab2aQ1 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		n = src.nextInt();
		int[] intArray= new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			intArray[i] = src.nextInt();
		}
		
		int key;
		System.out.print("Enter search term: ");
		key = src.nextInt();
		
		for(int i=0; i<n; i++) {
			if(intArray[i]==key) {
				System.out.println(key+ " found at " + i + "th index");
			}
		}
	}
	
}
