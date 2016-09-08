package Zadaci_06_09_2016;
/*
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
be defined recursively as follows:
If m % n is 0, gcd(m, n) is n.
 Otherwise, gcd(m, n) is gcd(n, m % n).
 Write a recursive method to find the GCD. Write a test program that prompts the
user to enter two integers and displays their GCD.

 */
import java.util.Scanner;
public class GcdTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter two integers");
		
		int number1 = input.nextInt();
			int number2 = input.nextInt();
		
			System.out.println(" Gcd for " + number1 + " and " + number2 + " is " +
			gcd(number1,number2));//method invocation
	}
	
	//recursive method for finding gcd 
public static int gcd(int m,int n){
	
//base case
	if(m ==0 ||  n==0){
		
		return m+n;
	}
	else{
		return gcd(n, m % n);
		
	}
	
}
}
