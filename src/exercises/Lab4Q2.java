package exercises;
/* Consider the already defined EMPLOYEE class. Provide a default constructor, 
 * and parameterized constructor. Also provide a display method. 
 * Illustrate all the constructors as well as the display method by defining Time objects. */

import java.util.Scanner;

public class Lab4Q2 {

	public static void main(String[] args) {
		
		Employees emp1 = new Employees();
		emp1.read();
		
		Scanner src = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = src.nextLine();
		System.out.print("Enter employee ID: ");
		int id = src.nextInt();
		System.out.print("Enter Basic Salary: ");
		double basic = src.nextDouble();
		Employees emp2 = new Employees(name, id, basic);
		
		emp1.display();
		emp2.display();
		
		src.close();
		
	}
}

class Employees {
	
	Employees(){}
	
	Employees(String name, int id, double basic_sal) {
		Ename = name;
		Eid = id;
		Basic = basic_sal;
		compute_net_sal();
	}
	
	private String Ename, Email;
	private int Eid;
	private double Basic, DA, Gross_Sal, Net_Sal;
	
	public void read() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		Ename = sc.nextLine();		
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
	
	public void display() {
		
		System.out.println("Employee "+Eid+" "+Ename+" has net salary "+ Net_Sal);
	}
}
	
