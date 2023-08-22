package exercises;
/* Define a Class STUDENT having following Members: sname, marks_array, total, avg and provide the following methods:
assign(): to assign initial values to the STUDENT object display(): to display the STUDENT object
compute(): to Compute Total, Average mark */

public class Lab3Q1{
	
	public static void main(String[] args) {
		
		STUDENT s1 = new STUDENT();
		int[] marks1 = {90,95,97,100};
		s1.assign("Tarak Mehta", marks1);
		s1.display();
		
		STUDENT s2 = new STUDENT();
		int[] marks2 = {30,35,37,65};
		s2.assign("Ishan Awasthi", marks2);
		s2.display();
	}
}

class STUDENT {
	
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
