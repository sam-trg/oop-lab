package exercises;
/*Define a class Mixer to merge two sorted integer arrays in ascending order */

import java.util.Scanner;
import java.util.Arrays;

public class Lab3Q3 {

	public static void main(String[] args) {
		
		Mixer m1 = new Mixer();
		m1.accept();
		Mixer m2 = new Mixer();
		m2.accept();
		m1 = m1.mix(m2);
		m1.display();
	}
}

class Mixer {
	
	private int arr[];

	public void accept() {
		
		Scanner src = new Scanner(System.in);
		int n, elem;
		System.out.println("Enter the number of elements: ");
		n = src.nextInt();
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Enter element: ");
			elem = src.nextInt();
			
			
			
			boolean isDuplicate = false;
			for(int j=0; j<i; j++) {
				if(arr[j]==elem) {
					isDuplicate = true;
					break;
				}
			}
			
			if(isDuplicate) { 
				System.out.println("Please enter unique element");
				i--;
			} else {
				arr[i] = elem;
			}
		}
		Arrays.sort(arr);
	}
	
	public Mixer mix(Mixer A) {
		
		int len = arr.length + A.arr.length;
		int[] temp = new int[len];
		
		System.arraycopy(arr, 0, temp, 0, arr.length);
		System.arraycopy(A.arr, 0, temp, arr.length, A.arr.length);
		
		Arrays.sort(temp);
		
		A.arr = temp;
		
		return A;
	}
	
	public void display() {
		
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}
}
	
	
