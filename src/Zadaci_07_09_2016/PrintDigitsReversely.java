package Zadaci_07_09_2016;
/*(Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:
public static void reverseDisplay(int value)
 For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal.
 * 
 */
import java.util.Scanner;
public class PrintDigitsReversely {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println(" Enter an integer");
	
	int number = input.nextInt();
	
	reverseDisplay(number);//method invocation
	}
	
	
	//reverseDisplay method,prints numbers reversely
	public static void reverseDisplay(int value){
		
		//print the digit if it is less then 10
		if(value<10){
			System.out.println(value);
		}
		
		else{
			
			//print last digit
			System.out.print(value % 10);
			
			//remove last digit
			reverseDisplay(value/10);
		}
	}

}
