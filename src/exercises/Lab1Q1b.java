package exercises;
/*Create a method max( ) that has three integer parameters x, y, and z, and it returns the
largest of the three. Do it two ways: once using an if-else-if ladder and once using
nested if statements*/
import java.util.Scanner;

public class Lab1Q1b {
    static int max(int x, int y, int z){
        if(x > y) {
            if(y > z)
                return x;
            if(z > x)
                return z;
         }
        if(y>z)
            return y;
        return z;
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
    }
}
