package exercises.additional;
/* Write a program that creates a "triangular" two-dimensional array A of 10 rows. 
 * The first row has length 1, the second row has length 2, the third row has length 3, and so on. 
 * Then initialize the array using nested for loops so that the value of A[i][j] is i+j. 
 * Finally, print out the array in a nice triangular form*/

public class Lab2aQ2 {
	
	public static void main(String[] args) {
		
		int[][] triangulArray = new int[10][10];
		for(int i=1; i<10; i++) {
			for(int j=0; j<i; j++) {
				triangulArray[i][j] = i + j;
			}
		}
		
		for(int i=1; i<10; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(triangulArray[i][j]+ " ");
			}
		System.out.println("");
		}

	}

}
