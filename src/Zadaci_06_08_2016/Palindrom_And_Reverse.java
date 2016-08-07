package Zadaci_06_08_2016;
/*Napisati metode sa sljedeæim headerima: public static int reverse(int number) i public static boolean isPalindrome
 * (int number). Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije.
 *  Koristite reverse metodu da implementirate isPalindrome metodu.
 *   Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne.
 */

import java.util.Scanner;
public class Palindrom_And_Reverse {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		boolean possible = true;
		
		while(possible){//while loop 
			possible = false;
			
		
			try{//try block
				
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		System.out.println(" Reverse number is " +reverse(number));
		
		if(isPalindrom(number)){//if number is palindrom ,print it
			
			System.out.println(" Number is palindrome " + reverse(number));
		}
		else{
			System.out.println("Number is not palindrome " + reverse(number));
		}}
			catch(Exception ex){//catch block catch exception and handle it
				System.out.println(" Invalid input. Enter a number");
				possible = true;
			}
			finally{//finally block
				input.nextLine();
			}}
		
	input.close();

	}
	public static int reverse(int number){//reverse method
		int reverseNumber =0;
		
		while(number!=0){//while number is not 0
			
			reverseNumber = reverseNumber*10;//find reverse number
			reverseNumber = reverseNumber + number%10;
			number=number/10;
		}
		return reverseNumber;//return reverse number
		
	}
	
	public static boolean isPalindrom(int number){//isPalindrom method
		
//if the number is equal to the number in reverse,it is palindrom
return (number==reverse(number)); 
			
		}

	}