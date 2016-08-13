package Zadaci_12_08_2016;

/*
 *  Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja provjerava da li je broj 
 *  prost/prime. Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 
 *  0 do 100000.
 */

public class Primes {

	public static void main(String[] args) {//main method

		
		int counter = 0;	
		
		for (int i = 0; i < 100000; i++) {	//loop that goes from 0-100000
			if(isPrime(i) != 0) {	//method call -if the number is not 0		
				counter++;	//count it				 
				System.out.print((counter % 10 == 0) ? i+"\n" : i+" ");//print numbers ten in line
			}
		}
	}
	
	public static int isPrime(int n) {//isPrime method
		
//return 0 if the number is 1 or if it is divisible with that number		
		if (n == 1) return 0;			
		for (int i = 2; i < n; i++) {	
			if (n % i == 0) 		
				return 0;
		}
		return n;			// if the number is prime,return it
	}
	
		
		
	}
		
		
	
