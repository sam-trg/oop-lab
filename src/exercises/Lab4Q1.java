package exercises;
/* Consider the already defined STUDENT class. 
 * Provide a default constructor and parameterized constructor to this class. 
 * Also provide a display method. Illustrate all the constructors as well as 
 * the display method by defining Complex objects. */


public class Lab4Q1 {
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		int[] marks1 = {90,95,97,100};
		s1.assign("Tarak Mehta", marks1);
		s1.display();
		
		int[] marks2 = {30,35,37,65};
		Students s2 = new Students("Ishan Awasthi", marks2);	
		s2.display();
	}
}

class Students {
	
	Students(){};
	
	Students(String name, int[] marks) {
		
		assign(name, marks);
		
	}
	
	private String sname;
	private int[] marks_array;
	private int total;
	private double avg;
		
	public void assign(String name, int[] marks) {
			
		sname = name;
		marks_array = marks;
		compute();
	}
		
	public void compute() {
			
		for(int marks:marks_array) {
			total += marks;
		}
		avg = (float)total/marks_array.length;
	}

	public void display() {
		
		System.out.println("Student "+sname+" has "+total+" marks with an average of "+avg);
	}
		
}