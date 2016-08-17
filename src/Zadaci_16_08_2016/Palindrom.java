package Zadaci_16_08_2016;

/*Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti 
 * broj palindrom. Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 
 * 121, 131, itd.
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Palindrom {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number.");
		
		
		boolean correct = true;
		
		while(correct){
			
			correct = false;
		
			
			try{
				
				
			
		//number input
		int number = input.nextInt();
		
		if(isPalindrom(number)){//method call
			
			System.out.println(" Number " + number + " is palindrom");
		}
		
		else{
			System.out.println(" Number " + number + " is not palindrom");
		}
	}
			catch(InputMismatchException ex){
				
				System.out.println(" Invalid input. Enter a number");
				
				correct = true;
			}
			
			finally{
				
				input.nextLine();
			}}
		input.close();
		}
	
	public static boolean isPalindrom(int n){
		
		int number =0;
		
		
		//reverse number	
		for(int i = n;i!=0;i/=10){
			
			number = number*10+i%10;
		
			
		}
		if(n == number){
			
			return true;
		}
		
			return false;
			
		}
	}


