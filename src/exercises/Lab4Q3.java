package exercises;
/* Define a class to represent a Bank account. Include the following members. Data members:
1. Name of the depositor
2. Account number.
3. Type of account.
4. Balance amount in the account.
5. Rate of interest (static data)
Provide a default constructor and parameterized constructor to this class. Also provide Methods:
1. To deposit amount.
2. To withdraw amount after checking for minimum balance.
3. To display all the details of an account holder.
4. Display rate of interest (a static method)
Illustrate all the constructors as well as all the methods by defining objects.*/


public class Lab4Q3 {

}

class BankAccount {
	
	BankAccount(){};
	
	BankAccount(String name, long accountNo, String type, double amount, float roi) {
		
		depositorName = name;
		accountNumber = accountNo;
		accountType = type;
		balance = amount;
		rate = roi;
	}
	
	String depositorName;
	long accountNumber;
	double balance;
	static float rate;
	String accountType;
	
	void deposit(double amt) {
		
		balance += amt;
		System.out.println("New balance is: "+balance);
		
	}
	
	void withdraw(int debit) {
		
		System.out.println("Current balance is: "+balance);
		if(debit>=balance) {
			balance-=debit;
			System.out.println("New balance is: "+balance);
		} else {
			System.out.println("Low balance. Cannot withdraw.");
		}
		
	}
	
	static float displayROI() {
		return rate;
	}
	
	
}