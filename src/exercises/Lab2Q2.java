package exercises;
/*Write a program that creates an integer array of length N, fills the array with the
sequence of values (from 1 to N) using a for loop, and then loops through the array
printing out the values. Use a for-each style for loop to print out the values */
import java.util.Scanner;

public class Lab2Q2 {

    public static void main(String[] args) {
        int N;
		System.out.print("Enter number of elements: ");
		Scanner src = new Scanner(System.in);
		N = src.nextInt();
		int[] intArray= new int[N];
		for(int i=0; i<N; i++) {
			intArray[i] = i+1;
		}
		for(int num:intArray) {
			System.out.print(num +" ");
        }
    }
}
