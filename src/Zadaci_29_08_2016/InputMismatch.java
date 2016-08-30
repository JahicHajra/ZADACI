package Zadaci_29_08_2016;

/*(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect
 * 
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		boolean correct = true;
		
		System.out.println(" Enter two numbers");
		
		// do enter a number 
		do{
			
		
		try{ //try block
			
			//user input
			number1 = input.nextInt();
			number2 = input.nextInt();
			
			//print sum
			System.out.println(" The sum of the numbers is " + (number1+number2));
			correct = false;
		}//end try block
		catch(InputMismatchException ex){ // catch exception and handle it 
			
			//message for user to enter a number
			System.out.println(" Invalid input. Enter a number.");
			
			//number input
			input.nextLine();
		}//end catch block
	}
		while(correct); //while it is correct

}
}