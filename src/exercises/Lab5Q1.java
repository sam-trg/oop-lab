package exercises;
/* Add the following string processing methods to the class Employee:
 * 
 * a) formatEmployeeName(): A method that formats the employee's name by capitalizing
 *    the first letter of each word and converting the remaining letters to lowercase. 
 *    For example, if the employee's name is "JOHN DOE", this method would transform it to "John Doe".
 *    
 * b) generateEmail(): A method that generates an email address for the employee based on their name. 
 *    For example, if the employee's name is "John Doe", this method would generate an email address like "jdoe@example.com". */

import java.util.Scanner;

public class Lab5Q1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = src.nextLine();

		EMP emp1 = new EMP(name);
		
		emp1.display();
		
		src.close();
		
	}
}

class EMP {
	
	EMP(){}
	
	EMP(String name) {
		
		Ename = name;
		Ename = Ename.toLowerCase();
		generateEmail();
		formatEmployeeName();
		
	}
	
	private String Ename, Email;

	
	public void formatEmployeeName() {
		
		char[] nameArray = Ename.toCharArray();
		nameArray[0] = Character.toTitleCase(nameArray[0]);
		for(int i=1; i<nameArray.length; i++) {
			if(Character.isWhitespace(nameArray[i])) {
				nameArray[i+1] = Character.toUpperCase(nameArray[i+1]);
				i+=2;
			}
		}
		Ename = String.valueOf(nameArray);
	}
	
	public void generateEmail() {
		
		Ename.toLowerCase();
		String[] nameArr = Ename.split(" ");
		char[] letterArr = nameArr[0].toCharArray();
		Email = letterArr[0] + nameArr[nameArr.length -1] + "@company.com";
	}
	
	
	public void display() {
		
		System.out.println("Employee "+ Ename +" has email " + Email);
	}
}