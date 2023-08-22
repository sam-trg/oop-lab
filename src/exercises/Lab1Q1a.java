package exercises;
/*Create a method max( ) that has three integer parameters x, y, and z, and it returns the
largest of the three. Do it two ways: once using an if-else-if ladder and once using
nested if statements*/

import java.util.Scanner;

public class Lab1Q1a {
	
	static int max(int x, int y, int z){
		
		int largest;
		if(x >= y && x >= z){
			largest = x;
		} else if(y >= z && y >= x){
			largest = y;
		} else {
            largest = z;
        }
		
        return largest;
    }
    
    public static void main(String[] args){
    	
        Scanner src = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = src.nextInt();
        System.out.print("Enter second number: ");
        int n2 = src.nextInt();
        System.out.print("Enter third number: ");
        int n3 = src.nextInt();
        System.out.println(max(n1, n2, n3));
        src.close();
    }
}
