//U10316030

//楊子育
//8.7 11.3


import java.util.Scanner;

public class Account{
	//Main method
    public static void main(String[] args) {
		//Created an object,並給入值
		CheckingAccount object = new CheckingAccount();
		SavingAccount object2 = new SavingAccount();
		//呼叫method
		object.Checking();
		System.out.print(object.toString());
		object2.Saving();	
		System.out.print(object2.toString());

	
	
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
	public int getID(){
	
		return id;
		
	}
	
	//Set a new id
	public void setID(int id){
	
		this.id = id;
	
	}
	
	//Return balance
	public double getBalance(){
	
		return balance;
	
	}
	//Set a new balance
	public void setBalance(double balance){
	
		this.balance = balance;
	
	}
	
	//Set a new annualInterestRater
	public void setAnnualInterestRate(double annualInterestRate){
	
		this.annualInterestRate = annualInterestRate;
	
	}
	
	//Get dateCreated
	public java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}
	
	//Return MonthlyInterestRate
	public double getMonthlyInterestRate(){
	
		return annualInterestRate / 12;
	
	}
	
	//Return MonthlyInterest
	public double getMonthlyInterest(){
	
		return balance*getMonthlyInterestRate()/100;
	
	}
	
	//領出金額
	public void Withdraw(double take){
	
		balance = balance - take;
		
	}
	
	//存入金額
	public void Deposit(double store){
	
		balance = balance + store;
	
	}
	
	
	//Return a string representation of this object
	public String toString(){
	
		return "Date: " + getDateCreated() + "  MonthlyInterest: " + getMonthlyInterest() + "  Balance: " +getBalance()+ "\n";
	
	}

}

//CheckingAccount class
class CheckingAccount extends TestAccount{
	//Data fields
	private int id = 0;
	private double balance = 0;
	private double take = 0;
	private double store = 0;
	
	//Construct a no-arg constructor
	CheckingAccount(){
		
		super();
		
	}
	
	//Constructor with the specified id and balance
	CheckingAccount(int id, double balance){
		
		super(id, balance);

	}
	
	//Checking method
	public void Checking(){
		
		//輸入使用者ID
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your ID: ");
		id = input.nextInt();
		super.setID(id);
		
		
		//一開始使用者有20000
		setBalance(20000);
		System.out.println("You have $" + getBalance());
		
		super.setAnnualInterestRate(4.5);
		
		
		System.out.print("How much do you take? ");
		take = input.nextDouble();
			
		//錢不夠 要先存錢
		if(take > 20000){
			System.out.print("You have no enough money. \nYou need to store money. ");
		}
				
		super.Withdraw(take);
		
		
		while(super.getBalance() < 0){
			
			System.out.print("How much do you store? ");
			store = input.nextDouble();
			//存入的錢仍不夠提就要再存錢
			if((super.getBalance() + store) < 0){
				System.out.println("You need to store money to balance.");
			}
			super.Deposit(store);
			
		}
		
		System.out.println();
	}
	
	//Return a string representation of this object
	public String toString(){
		return super.toString();
	}
	
}


class SavingAccount extends TestAccount{
	//Data fields
	private int id = 0;
	private double balance = 0;
	private double take = 0;
	private double store = 0;
	
	//Construct a no-arg constructor
	SavingAccount(){
		
		super();
		
	}
	
	//Constructor with the specified id and balance
	SavingAccount(int id, double balance){
		
		super(id, balance);

	}
	
	//Saving method
	public void Saving(){
		
		//輸入使用者ID
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your ID: ");
		id = input.nextInt();
		super.setID(id);
		
		//一開始使用者有20000
		setBalance(20000);
		System.out.println("You have $" + getBalance());
		
		super.setAnnualInterestRate(4.5);
		
		//錢不夠不能提 要再輸入一次你提的錢
		do{
			
			System.out.print("How much do you take? ");
			take = input.nextDouble();
			
			if(take > 20000){
				System.out.print("You have no enough money. \nPlease enter again. ");
			}
				
		}while(take > 20000);
		super.Withdraw(take);
		
		
		System.out.print("How much do you store? ");
		store = input.nextDouble();
		super.Deposit(store);
		System.out.println();
	}
	
	//Return a string representation of this object
	public String toString(){
		return super.toString();
	}
	
	
}





















