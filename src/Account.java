//U10316030
//���l�|
//8.7 11.3

public class Account{
	//Main method
    public static void main(String[] args) {
		//Created an object,�õ��J��
		TestAccount object = new TestAccount(1122,20000);
		//�I�smethod
		object.Withdraw(2500);
		object.Deposit(3000);
		object.setAnnualInterestRate(4.5);
		System.out.print(object.toString());
	
	}

}
	
	
class TestAccount{
	//Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	//Construct a no-arg constructor
	TestAccount(){
	
	dateCreated = new java.util.Date();
	
	}
	
	//Constructor with the specified id and balance
	TestAccount(int id, double balance){
	
    this.id = id;
    this.balance = balance;
	dateCreated = new java.util.Date();
	
	}

	//Return id
	int getID(){
	
		return id;
		
	}
	
	//Set a new id
	void setID(int id){
	
		this.id = id;
	
	}
	
	//Return balance
	double getBalance(){
	
		return balance;
	
	}
	//Set a new balance
	void setBalance(){
	
		this.balance = balance;
	
	}
	
	//Set a new annualInterestRater
	void setAnnualInterestRate(double annualInterestRate){
	
		this.annualInterestRate = annualInterestRate;
	
	}
	
	//Get dateCreated
	java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}
	
	//Return MonthlyInterestRate
	double getMonthlyInterestRate(){
	
		return annualInterestRate / 12;
	
	}
	
	//Return MonthlyInterest
	double getMonthlyInterest(){
	
		return balance*getMonthlyInterestRate()/100;
	
	}
	
	//��X���B
	void Withdraw(double take){
	
		balance = balance - take;
		
	}
	
	//�s�J���B
	void Deposit(double store){
	
		balance = balance + store;
	
	}
	
	
	//Return a string representation of this object
	public String toString(){
	
		return "Date: " + getDateCreated() + "  MonthlyInterest: " + getMonthlyInterest() + "  Balance: " +getBalance();
	
	}

}