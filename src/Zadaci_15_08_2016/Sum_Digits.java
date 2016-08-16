package Zadaci_15_08_2016;
/*Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite sljedeæi header: 
 * public static int sumDigits(long n). Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Sum_Digits {

	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.println(" Enter a number as a long integer");
			 
			
			boolean correct = true;
			
			while(correct){
				correct = false;
				
			try{
				
				
			//input long integer
			long n= input.nextLong();
			 		
			 		
			 
			 		System.out.println("The sum of the digits is " + sumDigits(n));//method call
			 	}
			
			catch(InputMismatchException ex){//catch exception and handle it
				System.out.println(" Invalid input. Enter a number");
				correct = true;
			}
			
			finally{
				
				input.nextLine();
			}
			}
			
			}
			 
			 	public static int sumDigits(long n) {
			 		
			 		int sum = 0;
			 
			 		//as long as the number is not 0, add up the digits and return sum
			 		while (n != 0) {
			 		
			 			sum += n % 10;
			 			n /= 10;
			 		}
			 
			 		return sum;
			 
			 	}
		
		
	}

