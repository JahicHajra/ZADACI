package Zadaci_13_08_2016;

/* Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeðen kao argument:
 *  public static void reverse(int number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji 
 *  pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. 
 * 
 */


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class Reverse_Number {

	
	
	public static void main(String[] args) {//main method
		Scanner input = new Scanner(System.in);//create scanner
		
		System.out.println(" Enter a number.");//prompt the user to enter a number
		
		boolean correct = true;
		
		while(correct){
			correct = false;
		
		try{
			
		//number input
		int number = input.nextInt();
		
		System.out.println(" The reverse number is ");reverse(number);//method call
	}
	catch(InputMismatchException ex){//catch exception
		System.out.println(" Invalid input. Enter a number");
		correct=true;
	}
		finally{//finally block
			input.nextLine();
		}
		}
	}
	public static void reverse(int number){//reverse method
		
		int num =1;
		
		//reverse number and print it
		while(number!=0){
		num =number%10;
		System.out.print(num);
		
		number=number/10;
		}
	}
}
