package exercises;
/* Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods:
i) read(): to read N employee details
ii) display(): to display employee details
iii) compute_net_sal(): to compute net salary */

import java.util.Scanner;

public class Lab3Q2 {
	
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int N = src.nextInt();
		EMPLOYEE employees[] = new EMPLOYEE[N];
		for(int i=0; i<N; i++) {
			employees[i] = new EMPLOYEE();
			employees[i].read();
		}
		for(int i=0; i<N; i++) {
			employees[i].display();
		}
	}
}

class EMPLOYEE {
	
	private String Ename;
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
		Net_Sal = compute_net_sal();
	}
	
	public double compute_net_sal() {
		
		DA = 0.52 * Basic;
		Gross_Sal = Basic + DA;
	
		return Gross_Sal - 0.3 * Gross_Sal;
	}
	
	public void display() {
		
		System.out.println("Employee "+Eid+" "+Ename+" has net salary "+ Net_Sal);
	}
}
	
	
	
