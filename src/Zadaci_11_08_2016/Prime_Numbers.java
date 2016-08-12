package Zadaci_11_08_2016;

/* Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000.
 *  Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.

 * 
 */

public class Prime_Numbers {
	
	

	public static void main(String[] args) {



int count = 0; // counter
System.out.println("Prosti brojevi su: ");

for (int i = 2; i <= 1000; i++) { // loop starting from 2 to 1000
	boolean isPrime = true;	
	
	// checking if the number is prime dividing it by number from 2 the number
	for (int j = 2; j < i; j++) {
		if (i % j == 0) { // if it is divisible, it is not prime
			isPrime = false;
			break;
		}
	}
	if (isPrime && i != 0 && i != 1) { // if it is divisible and if it is not 1, count it
		count++;
		System.out.print(i + " ");//print primes
		if (count % 8 == 0) { // when 8 primes counted,primes printed in the next line
			System.out.println();
}

}
}

}
	
}