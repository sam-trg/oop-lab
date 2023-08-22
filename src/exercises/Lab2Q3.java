package exercises;
/* Print all the prime numbers in a given 1D array */

import java.util.Scanner;

public class Lab2Q3 {

    public static boolean isPrime(int num) {
        
    	boolean isPrime = true;
        for(int i = 2; i <= (int)Math.pow(num, 0.5); i++) {
            if (num%i==0) {
                isPrime = false;
                break;
            }
        }
        if(num==0 || num ==1) {isPrime = false;}
        return isPrime;
    }
    
    public static void main(String[] args) {    
        
    	int n;
		System.out.print("Enter number of elements: ");
		Scanner src = new Scanner(System.in);
		n = src.nextInt();
		int[] intArray= new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter a number: ");
			intArray[i] = src.nextInt();
		}
		
		for(int num: intArray) {
		    if(isPrime(num)) {System.out.print(num + " ");}
        }
		src.close();
    }
}
