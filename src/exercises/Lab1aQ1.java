package exercises;
/*a. Write a method isPrime to accept one integer parameter and to check whether that
parameter is prime or not.
b. Using this method, generate first N prime numbers in the main method*/
import java.util.Scanner;

public class Lab1aQ1 {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for(int i = 2; i <= (int)Math.pow(num, 0.5); i++) {
            if (num%i==0) {
                isPrime = false;
                break;
                }
        }
    return isPrime;
    }

    public static void main(String[] args) {
        int n;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter 'n' for first 'n' primes: ");
        n = src.nextInt();
        int i=3;
        int count=0;
        while(count < n) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                }
        i++; 
        }
    }
}
