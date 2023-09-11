package exercises;
/* Add the following string processing methods to the class STUDENTS1:
a) extractInitials(): A method that extracts the initials from the STUDENTS1's name. 
	For example, if the STUDENTS1's name is "John Doe", this method would return "JD".
b) removeWhitespace(): A method that removes any whitespace characters from the STUDENTS1's name. 
	For example, if the STUDENTS1's name is "John Doe", this method would transform it to "JohnDoe".
c) List all the STUDENTS1 names containing a particular sub string.
d) Sort the STUDENTS1 alphabetically */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab5Q2 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		
		int num = src.nextInt();
		src.nextLine();
		STUDENTS1[] studentsArray = new STUDENTS1[num];
		
		for(int i=0; i<num; i++) {
			
			System.out.print("Enter student name: ");
			studentsArray[i] = new STUDENTS1();
			studentsArray[i].sname = src.nextLine();
			
		}
		
		System.out.println("Enter search term: ");
		
		String key;
		
		key = src.nextLine();
		
		String[] namesArray = new String[num];
		
		for(int i=0; i< num; i++) {
			
			namesArray[i] = studentsArray[i].sname;
			
		}
		
		Arrays.sort(studentsArray, Comparator.comparing(student -> student.sname));
		
		for(STUDENTS1 student: studentsArray) {
			
			if(student.sname.contains(key)) {
				
				System.out.println(student.sname);
				
			}
		}
	}
}

class STUDENTS1 {
	
	
	String sname, initials, nametext;
	
	
	public void extractInitials() {
		
		StringBuffer initialsMaker = new StringBuffer();
		String name = sname.toUpperCase();
		String[] nameArr = name.split(" ");
		for(String word: nameArr) {
			initialsMaker.append(word.charAt(0));
		}
		initials = initialsMaker.toString();

	}
	
	public String removeWhitespace() {
		
		StringBuilder nametextMaker = new StringBuilder();
		String[] nameArray = sname.split(" ");
		for (String word: nameArray) {
			nametextMaker.append(word);
		}
		nametext = nametextMaker.toString();
		
		return nametext;
	}

	public void display() {
		
		System.out.println("Student "+sname+"'s name without whitespace is " + removeWhitespace());
	}
		
}