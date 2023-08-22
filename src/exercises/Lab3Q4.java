package exercises;
/* Create a class called Stack for storing integers. The instance variables are:
• An integer array
• An integer for storing the top of stack (tos)
Include methods for initializing tos, pushing an element to the stack and for popping an element from the stack.
 The push()method should also check for “stack overflow” and pop() should also check for “stack underflow”. 
 Use a display( ) method to display the contents of stack.
 */

import java.util.Scanner;

public class Lab3Q4 {
	
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		Stack s = new Stack();
		
		while(true) {
			
			System.out.println("Enter operation 'push' 'pop' 'display' 'exit' ");
			String choice = src.nextLine();
			
			switch(choice)
			{
				case "push":
					System.out.print("Enter element to push: ");
					int num = src.nextInt();
					src.nextLine(); // to account for ln char
					s.push(num);
					break;
				case "pop":
					s.pop();
					break;
				case "display":
					s.display();
					break;
				case "exit":
					System.exit(0);
					break;
				default:
					System.out.println("Invalid input");
			}
		}
	}

}

class Stack {
	
	private static final int SIZE = 5;
	private int[] stack = new int[SIZE];
	private int tos = -1;
	
	public void setTos(int x) {
		if(x>=-1)
			tos = x;
		else
			System.out.println("Invalid");
	}
	
	public void push(int item) {
		
		if(tos==SIZE-1) {
			System.out.println("Stack overflow");
		} else {
			tos+=1;
			stack[tos] = item;
		}
	}
	
	public void pop() {
		
		if(tos==-1) {
			
			System.out.println("Stack underflow");
			
		} else {
			
			System.out.println("Popped element " + stack[tos]);
			tos-=1;
		}
	}
	
	public void display() {
		
		for(int i=tos; i>=0; i--) {
			
			System.out.println(stack[i]);
		}
	}
}