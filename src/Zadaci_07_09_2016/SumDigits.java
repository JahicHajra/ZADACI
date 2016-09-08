package Zadaci_07_09_2016;
/*(Sum the digits in an integer using recursion) Write a recursive method that
computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
 For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.
 * 
 */
import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println(" Enter an integer as a long number");
		
		long n = input.nextLong();
		
		System.out.print(sumDigits(n));
	}
public static int sumDigits(long n){
	
	//if number is less than 10,print it
	if(n<10){
		return (int) n;
	}
	
	//return sum of last digit and remove digits using recursion
	return (int)(n % 10)+ sumDigits(n / 10);
	}
}
