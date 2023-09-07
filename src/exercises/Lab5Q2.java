package exercises;
/* Add the following string processing methods to the class STUDENTS1:
a) extractInitials(): A method that extracts the initials from the STUDENTS1's name. 
	For example, if the STUDENTS1's name is "John Doe", this method would return "JD".
b) removeWhitespace(): A method that removes any whitespace characters from the STUDENTS1's name. 
	For example, if the STUDENTS1's name is "John Doe", this method would transform it to "JohnDoe".
c) List all the STUDENTS1 names containing a particular sub string.
d) Sort the STUDENTS1 alphabetically */


public class Lab5Q2 {

	public static void main(String[] args) {
		
		STUDENTS1 s1 = new STUDENTS1();
		int[] marks1 = {90,95,97,100};
		s1.assign("Tarak Mehta", marks1);
		s1.display();
		
		int[] marks2 = {30,35,37,65};
		STUDENTS1 s2 = new STUDENTS1("Ishan Awasthi", marks2);	
		s2.display();
	}
}

class STUDENTS1 {
	
	STUDENTS1(){};
	
	STUDENTS1(String name, int[] marks) {
		
		assign(name, marks);
		
	}
	
	private String sname, initials;
	private int[] marks_array;
	private int total;
	private double avg;
		
	public void assign(String name, int[] marks) {
			
		sname = name;
		extractInitials();
		marks_array = marks;
		compute();
	}
		
	public void compute() {
			
		for(int marks:marks_array) {
			total += marks;
		}
		avg = (float)total/marks_array.length;
	}
	
	public void extractInitials() {
		
		StringBuffer initialsMaker = new StringBuffer();
		String name = sname.toUpperCase();
		String[] nameArr = name.split(" ");
		for(String word: nameArr) {
			initialsMaker.append(word.charAt(0));
		}
		initials = initialsMaker.toString();

	}

	public void display() {
		
		System.out.println("Student "+sname+" ("+initials+") has "+total+" marks with an average of "+avg);
	}
		
}