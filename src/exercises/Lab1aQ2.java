/*
Write a method findSum to find the sum of digits of a number.
 */
package exercises;

import java.util.Scanner;

public class Lab1aQ2 {
    
    static int findSum(int num) {
        int sum = 0;
        int temp = num;
        while (temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        System.out.printf("Sum of digits is %d\n", findSum(num));
    }
}
