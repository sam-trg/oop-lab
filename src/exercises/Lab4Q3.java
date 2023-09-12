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
Illustrate all the constructors as well as all the methods by defining objects. */


public class Lab4Q3 {
	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("Mahesh D.", 121111081, "Savings", 5000);
		acc1.display();
		acc1.deposit(189.57);
		acc1.display();
	}
	
}

class BankAccount {
	
	BankAccount(){};
	
	BankAccount(String name, long accountNo, String type, double amount) {
		
		depositorName = name;
		accountNumber = accountNo;
		accountType = type;
		balance = amount;
	} 
	
	String depositorName;
	long accountNumber;
	double balance;
	static float rate = 6;
	String accountType;
	
	void deposit(double amt) {
		
		balance += amt;
		System.out.println("New balance is: "+balance);
		
	}
	
	void withdraw(double debit) {
		
		System.out.println("Current balance is: "+balance);
		if(debit>=balance) {
			balance-=debit;
			System.out.println("New balance is: "+balance);
		} else {
			System.out.println("Low balance. Cannot withdraw.");
		}
		
	}
	
	void display() {
		
		System.out.printf("Account %d holder %s has balance %.2f in their %s account.\n", accountNumber, depositorName, balance, accountType);
	}
	
	static float displayROI() {
		return rate;
	}
	
	
}
