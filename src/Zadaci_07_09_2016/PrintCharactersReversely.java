package Zadaci_07_09_2016;
/*(Print the characters in a string reversely) Write a recursive method that displays
a string reversely on the console using the following header:
public static void reverseDisplay(String value)
 * For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.
 */
import java.util.Scanner;
public class PrintCharactersReversely {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter characters");
		String s = input.nextLine();
		
		reverseDisplay(s);
	}
	
	//method for printing characters reversely
	public static void reverseDisplay(String value){
		
		//if it is only one letter,print it
		if(value.length()==1){
			System.out.println(value);
		}
		else{
			//print the last letter
			System.out.print(value.charAt(value.length()-1));
			
			//remove last letter
			reverseDisplay(value.substring(0, value.length()-1));
		}
	}

}
