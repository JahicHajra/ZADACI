package Zadaci_29_08_2016;

/*(IllegalArgumentException) Modify the Loan class in Listing 10.2 to
throw IllegalArgumentException if the loan amount, interest rate, or
number of years is less than or equal to zero.
 * 
 */

import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class IllegalArgument {

	public static void main(String[] args) {

		
		  try {
	            Loan loan = new Loan();
	            loan.setAnnualInterestRate(0);
	            loan.setNumberOfYears(0);
	            loan.setLoanAmount(100);
	            
	}
		  
		  catch(IllegalArgumentException ex){
			  
			  System.out.println(" Illegal argument exception.");
		  }

}}

