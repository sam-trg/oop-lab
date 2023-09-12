package exercises;

/* Perform the following operations by adding member functions to the program implemented in the above question
a) Sort the student records with respect to semester and CGPA.
b) Sort the student record with respect to name. */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Lab5Q4 {

	static pupils1[] studentsArray = new pupils1[2];
	
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			
			studentsArray[i] = new pupils1();
			System.out.print("Enter student name: ");
			studentsArray[i].name = src.nextLine();
			System.out.print("Enter student sem no.: ");
			studentsArray[i].sem = src.nextShort();
			System.out.print("Enter student CGPA: ");
			studentsArray[i].cgpa = src.nextFloat();
			src.nextLine();
			
		}
		
		String key;
		
		do {
			
			System.out.println("Enter sorting criteria 'name', 'sem' or 'cgpa': ");
			
			key = src.nextLine();
			
			switch(key) {
			
			case "name":
			
				Arrays.sort(studentsArray, Comparator.comparing(student -> student.name));
				pupils1.display();
				break;
				
			case "sem":
				
				Arrays.sort(studentsArray, Comparator.comparing(student -> student.sem));
				pupils1.display();
				break;
				
			case "cgpa":
				
				Arrays.sort(studentsArray, Comparator.comparing(student -> student.cgpa));
				pupils1.display();
				break;
				
			case "exit":
				
				System.exit(0);
				
			default:
				
				System.out.println("Invalid choice");
			}
			
		} while(true);
		
	}
}

class pupils1 {
	
	
	String name; short sem; float cgpa;
	
	public static void display() {
		
		for(pupils1 student: Lab5Q4.studentsArray) {
			
			System.out.println("Student "+ student.name +" in Sem " + student.sem + " with CGPA " + student.cgpa);
			
		}
		
	}
		
}