package exercises;
/* Find the addition of two matrices and display the resultant matrix  */

import java.util.Scanner;

public class Lab2Q4 {
	
	public static void main(String[] args) {
		
		int r, c;
        Scanner src = new Scanner(System.in);
		System.out.print("Enter no. of rows of matrices: ");
		r = src.nextInt();
		System.out.print("Enter no. of columns of matrices: ");
		c = src.nextInt();
		
		int[][] matrix1= new int[r][c];
		for(int i=0; i<r; i++) {
		    for(int j=0; j<c; j++) {
		    	System.out.printf("Enter [%d,%d]th element of the 1st matrix: ", i,j);
				matrix1[i][j] = src.nextInt();
		    }
        }
		
		int[][] matrix2= new int[r][c];
		for(int i=0; i<r; i++) {
		    for(int j=0; j<c; j++) {
		    	System.out.printf("Enter [%d,%d]th element of the 2nd matrix: ", i,j);
				matrix2[i][j] = src.nextInt();
		    }
        }
		
		int[][] sumMatrix = new int[r][c];
		for(int i=0; i<r; i++) {
		    for(int j=0; j<c; j++) {
		    	sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		    }
        }
		
        for(int i=0; i<r; i++) {
		    for(int j=0; j<c; j++) {
		        System.out.printf("%d ", sumMatrix[i][j]);
		    }
        System.out.print("\n");
        }
        src.close();
	}
}