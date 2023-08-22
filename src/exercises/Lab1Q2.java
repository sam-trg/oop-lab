package exercises;
/*a. Write a method reverse to accept one integer parameter and to return the reversed
digits of accepted number
b. Using this method, check whether the inputted number is palindrome or not.*/

import java.util.Scanner;

public class Lab1Q2 {
    static int reverse(int num){
        int reversed = 0;
        int temp = num;
        while(temp>0){
            reversed = reversed*10 + temp%10;
            temp /= 10;
        }
        return reversed;
}
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        System.out.printf("The given number %s", reverse(num) == num ? "is a palindrome.\n" : "is not a palindrome");
        src.close();
    }

    
}
