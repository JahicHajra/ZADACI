package Zadaci_29_08_2016;

public class Loan {

	//data fields
	private double annualInterestRate; 
	private int numberOfYears; 
	private double loanAmount; 
	private java.util.Date loanDate; 
	
	//Default constructor 
	public Loan() { 
		this(2.5, 1, 1000); 
		} 
	
	 // Construct a loan with specified annual interest rate, number of years, and loan amount  
	public Loan(double annualInterestRate, int numberOfYears,  double loanAmount) { 
		
		if (annualInterestRate<=0){
			throw new IllegalArgumentException("Ilegal Argument Exception.");
		}
		if (numberOfYears<=0){
			throw new IllegalArgumentException("Ilegal Argument Exception.");
		}
		if (loanAmount <= 0){
	         throw new IllegalArgumentException("Ilegal Argument Exception.");
			}
		this.annualInterestRate = annualInterestRate; 
		this.numberOfYears = numberOfYears; 
		this.loanAmount = loanAmount;      
		loanDate = new java.util.Date();     
		}
	
	 // set accessors and mutators for data fields  
	public double getAnnualInterestRate() {  
		return annualInterestRate; 
		} 
	
	public void setAnnualInterestRate(double annualInterestRate) {  
		if (annualInterestRate<=0){
			throw new IllegalArgumentException("Ilegal Argument Exception.");
		}
		this.annualInterestRate = annualInterestRate;
		} 

	public int getNumberOfYears() { 
		return numberOfYears; 
		} 
	
	public void setNumberOfYears(int numberOfYears) { 
		if (numberOfYears<=0){
			throw new IllegalArgumentException("Illegal Argument Exception.");
		}
		this.numberOfYears = numberOfYears;     
		} 

	public double getLoanAmount() {  
		return loanAmount; 
		} 
	 
	public void setLoanAmount(double loanAmount) { 
		if (loanAmount <= 0){
	         throw new IllegalArgumentException("Ilegal Argument Exception.");
			}
		this.loanAmount = loanAmount; 
		} 
	
	// Find monthly payment 
	public double getMonthlyPayment() { 
		double monthlyInterestRate = annualInterestRate / 1200; 
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); 
		return monthlyPayment; 
		} 
	
	// Find total payment  
	public double getTotalPayment() { 
		double totalPayment = getMonthlyPayment() * numberOfYears * 12; 
		return totalPayment; 
		} 
	
	// Return loan date  
	public java.util.Date getLoanDate() { 
		return loanDate; 
	}
}
