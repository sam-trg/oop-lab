package exercises;
/* Design a class which represents a student. Every student record is made up of the following fields.
a. Registration number (int)
b. Full Name (String)
c. Date of joining (Gregorian calendar)
d. Semester (short)
e. GPA (float)
f. CGPA (float)
Whenever a student joins he will be given a new registration number. Registration number is calculated as follows. 
If year of joining is 2012 and he is the 80th student to join then his registration number will be 1280.

Write member functions to do the following.
a) Provide parameterized constructors to this class
b) Write display method which displays the record. Test the class by writing
suitable main method.
c) Create an array of student record to store minimum of 5 records in it. Input the
records and display them. */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab5Q3 {

	public static void main(String[] args) {
		
		final int LEN = 2;
		
		pupil[] studentsArray = new pupil[LEN];
		
		Scanner src = new Scanner(System.in);
		
		String name, doj; short sem; float gpa,cgpa;
		
		for(int i=0; i<LEN; i++) {
			
			System.out.print("Enter name: ");
			name = src.nextLine();
			System.out.print("Enter dd-MM-yyyy: ");
			doj = src.nextLine();
			System.out.print("Enter sem number: ");
			sem = src.nextShort();
			System.out.print("Enter GPA: ");
			gpa = src.nextFloat();
			System.out.print("Enter CGPA: ");
			cgpa = src.nextFloat();
			
			src.nextLine(); // need to clear stray '/n''s from input buffer between subsequent uses of nextLine()
			
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(doj, format);
			
			studentsArray[i] = new pupil(name, date, sem, gpa, cgpa);
			
		}
		
		for(pupil student : studentsArray) {
			
			student.display();
			
		}

	}

}

class pupil {
	
	static int count=0;
	String fullName, regNo;
	LocalDate joiningDate;
	short sem;
	float gpa, cgpa;
	
	
	pupil(String name, LocalDate date, short sem, float gpa, float cgpa) {
		
		count++;
		fullName = name;
		joiningDate = date;
		this.sem = sem;
		this.gpa = gpa;
		this.cgpa = cgpa;
		String year = Integer.toString(joiningDate.getYear());
		StringBuilder regMaker = new StringBuilder(year);
		regMaker.delete(0, year.length()-2);
		regMaker.append(count);
		regNo = regMaker.toString();
				
	}
	
	void display() {
		
		System.out.println("Student "+fullName+" reg no. "+regNo+" joined on "+joiningDate+" in Sem "+sem+" with GPA "+gpa+" and CGPA "+cgpa);
		
	}
	
}
