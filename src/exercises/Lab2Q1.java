package exercises;
/*Write a program that creates an array of integers and then uses a for loop to reverse
the order of the elements in the array */
import java.util.Scanner;

public class Lab2Q1 {

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
		System.out.print("Your original list is: ");
		for(int num:intArray) {
			System.out.print(num +" ");
		}
		System.out.print("\n");
		
		reverseList(intArray);

    }
    
    static void reverseList(int[] intArray){
        int len = intArray.length;
        int[] reversedArray = new int[len];
        for(int i=len-1, j=0; i>=0; i--,j++) {
			reversedArray[j] = intArray[i];
		}
		System.out.print("Your reversed list is: ");
		for(int num:reversedArray) {
			System.out.print(num +" ");
		}
		System.out.print("\n");
    }
}
