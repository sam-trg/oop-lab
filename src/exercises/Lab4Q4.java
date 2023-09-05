package exercises;
/* Create a class called Counter that contains a static data member 
 * to count the number of Counter objects being created. 
 * Also define a static member function called showCount() 
 * which displays the number of objects created at any given point of time.
 * Illustrate this. */

public class Lab4Q4 {
	
	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		c2.showCount();
		
	}
	
}

class Counter {
	
	static int count;
	
	Counter() {
		
		count++;
		
	}
	
	void showCount() {
		
		System.out.println(count+" objects have been created.");
		
	}
	
}