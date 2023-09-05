package exercises;
/* Consider the already defined EMPLOYEE class. Provide a default constructor, 
 * and parameterized constructor. Also provide a display method. 
 * Illustrate all the constructors as well as the display method by defining Time objects.*/

import java.util.Scanner;

public class Lab5Q1 {

	public static void main(String[] args) {
		
		EMP emp1 = new EMP();
		emp1.read();
		
		Scanner src = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = src.nextLine();
		System.out.print("Enter employee ID: ");
		int id = src.nextInt();
		System.out.print("Enter Basic Salary: ");
		double basic = src.nextDouble();
		EMP emp2 = new EMP(name, id, basic);
		
		emp1.display();
		emp2.display();
		
		src.close();
		
	}
}

class EMP {
	
	EMP(){}
	
	EMP(String name, int id, double basic_sal) {
		Ename = name;
		Eid = id;
		Basic = basic_sal;
		compute_net_sal();
		Ename = Ename.toLowerCase();
		generateEmail();
		formatEmployeeName();
	}
	
	private String Ename, Email;
	private int Eid;
	private double Basic, DA, Gross_Sal, Net_Sal;
	
	public void read() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		Ename = sc.nextLine();
		Ename = Ename.toLowerCase();
		generateEmail();
		formatEmployeeName();		
		System.out.println("Enter employee ID: ");
		Eid = sc.nextInt();
		System.out.println("Enter basic salary: ");
		Basic = sc.nextLong();
		compute_net_sal();
	}
	
	public double compute_net_sal() {
		
		DA = 0.52 * Basic;
		Gross_Sal = Basic + DA;
		Net_Sal = Gross_Sal - 0.3 * Gross_Sal;
	
		return Net_Sal;
	}
	
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
		
		System.out.println("Employee "+Eid+" "+Ename+" has net salary "+ Net_Sal + " and email " + Email);
	}
}