package Zadaci_07_09_2016;
/*(Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following
method header:
public static int count(String str, char a)
 For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
 * 
 */
import java.util.Scanner;
public class OccurenceOfCharacter {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println(" Enter a string");
String s = input.nextLine();


System.out.println(" Enter a character you want to count");
char ch = input.next().charAt(0);

System.out.println( " The character " + ch + " occurs " + count(s,ch) + " time(s)");//method invocation
	}

	
	public static int count(String s, char ch){
		
		
		if(s.length()<1)
			return 0;
		//if characters match, increment counter
		else if(s.charAt(s.length()-1)==ch)
			return 1+count(s.substring(0, s.length()-1), ch);
		
		else
			//remove character by using recursion
			return 0 + count(s.substring(0, s.length()-1),ch);
		}
	}


