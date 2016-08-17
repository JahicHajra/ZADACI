package Zadaci_16_08_2016;

/*Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa
 *  kao i prvo slovo stringa. 
 * 
 */
import java.util.Scanner;
public class Length_And_The_First_Character_Of_A_String {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a string");
		
		//string input
		String s = input.nextLine();
		//print the string length and the first character
		System.out.printf("String length is : %d and the first letter is : %s", s.length(), s.charAt(0));
		input.close();
	}

}

