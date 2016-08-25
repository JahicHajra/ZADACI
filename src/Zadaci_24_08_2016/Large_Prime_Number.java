package Zadaci_24_08_2016;

/*(Large prime numbers) Write a program that finds five prime numbers larger
than Long.MAX_VALUE.
 * 
 */


import java.math.BigInteger;
public class Large_Prime_Number {

	public static void main(String[] args) {

		//create BigInteger object with max value of long number
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		
		int counter = 0;
		
		BigInteger prime;
		
		//loop that runs until counter reaches 5
		while(counter<5){
			
			//probablePrime method find prime number greater than number
			prime = number.nextProbablePrime();
			
			System.out.println(prime);
			
			counter++;
			
			//in each iteration increment number by one
			number = new BigInteger(prime + "");
		}
	}


}
