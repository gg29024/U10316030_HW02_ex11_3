//U10316030
//楊子育
//8.7 11.3


import java.util.Scanner;

public class Account{
	//Main method
    public static void main(String[] args) {
		//Created an object,並給入值
		TestAccount object = new TestAccount(1122,20000);
		//呼叫method
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
	void setBalance(double balance){
	
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
	
	//領出金額
	void Withdraw(double take){
	
		balance = balance - take;
		
	}
	
	//存入金額
	void Deposit(double store){
	
		balance = balance + store;
	
	}
	
	
	//Return a string representation of this object
	public String toString(){
	
		return "Date: " + getDateCreated() + "  MonthlyInterest: " + getMonthlyInterest() + "  Balance: " +getBalance();
	
	}

}


class CheckingAccount extends TestAccount{

	private int id = 0;
	private double balance = 0;
	private double take = 0;
	private double store = 0;
	
	CheckingAccount(){
		
		super();
		
	}
	
	CheckingAccount(int id, double balance){
		
		super(id, balance);

	}
	
	public void Checking(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your ID: ");
		id = input.nextInt();
		super.setID(id);
		
		super.setBalance(20000);
		System.out.println("You have $" + getBalance());
		
		super.setAnnualInterestRate();
		
		
		System.out.print("How much do you take? ");
		take = input.nextDouble();
			
		if(take > 20000){
			System.out.print("You have no enough money. \nYou need to store money. ");
		}
				
		super.Withdraw(take);
		
		
		while(super.getBalance() < 0){
			
			System.out.print("How much do you store? ");
			store = input.nextDouble();
			
			if((super.getBalance() + store) < 0){
				System.out.println("You need to store money to balance.");
			}
			super.deposit(store);
			
		}
		
		
	}
	
	public String toString(){
		return super.toString();
	}
	
}


class SavingAccount extends TestAccount{
	
	private int id = 0;
	private double balance = 0;
	private double take = 0;
	private double store = 0;
	
	SavingAccount(){
		
		super();
		
	}
	
	SavingAccount(int id, double balance){
		
		super(id, balance);

	}
	
	public void Saving(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your ID: ");
		id = input.nextInt();
		super.setID(id);
		
		super.setBalance(20000);
		System.out.println("You have $" + getBalance());
		
		super.setAnnualInterestRate();
		
		
		while(take > 20000){
			
			System.out.print("How much do you take? ");
			take = input.nextDouble();
			
			if(take > 20000){
				System.out.print("You have no enough money. \nPlease enter again. ");
			}
				
		}
		super.Withdraw(take);
		
		
		System.out.print("How much do you store? ");
		store = input.nextDouble();
		super.deposit(store);
		
	}
	
	public String toString(){
		return super.toString();
	}
	
	
}





















