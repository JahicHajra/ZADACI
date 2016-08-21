package Zadaci_20_08_2016;


import java.util.Date;
public class Account {

	
	

	public int id;
	public double balance; // balance for account
	public double annualInterestRate; //stores the current interest rate
	public Date dateCreated; //stores the date account created

	//no arg construtor
	Account () {
	
	}
	//constructor with specific id and initial balance
	Account(int newId, double newBalance) {
	    id = newId;
	    balance = newBalance;
	}
	Account(int newId, double newBalance, double newAnnualInterestRate) {
	    id = newId;
	    balance = newBalance;
	    annualInterestRate = newAnnualInterestRate;
	   
	}
	//accessor/ mutator methods for id, balance, and annualInterestRate
	public int getId() {
	    return id;
	}
	public double getBalance() {
	    return balance;
	}
	public double getAnnualInterestRate() {
	    return annualInterestRate;
	}
	public void setId(int newId) {
	    id = newId;
	}
	public void setBalance(double newBalance) {
	    balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
	    annualInterestRate = newAnnualInterestRate;
	}
	//accessor method for dateCreated
	public void setDateCreated(Date newDateCreated) {
	    dateCreated = newDateCreated;
	}
	//define method getMonthlyInterestRate
	double getMonthlyInterestRate() {
	    return (annualInterestRate/100)/12;
	}
	
	double getMonthlyInterest(){
		return balance * ((annualInterestRate/100)/12);
	}
	//define method withdraw
	double withdraw(double amount) {
	    return balance -= amount;
	}   
	//define method deposit
	double deposit(double amount) {
	    return balance += amount;   
	}
	}