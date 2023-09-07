package exercises;
/* a. Write a method fact to accept one integer parameter and to find the factorial of a
given number.
b. Using fact method, compute NCR in the main method. */

import java.util.Scanner;

public class Lab1Q3 {
    
    public static int fact(int num) {
            int ans = 1;
            while(num>0) {
                    ans*=num;
                    num-=1;
            }
            return ans;
    }

    public static void main(String[] args) {
            int n, r;
            int nCr;
            Scanner src = new Scanner(System.in);
            System.out.println("Enter 'n' and 'r': ");
            n = src.nextInt();
            r = src.nextInt();
            // nCr n!/r!(n-r)!
            nCr = fact(n)/(fact(r)*fact(n-r));
            System.out.println(nCr);
            src.close();
    }
}
