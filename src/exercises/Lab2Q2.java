package exercises;

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
