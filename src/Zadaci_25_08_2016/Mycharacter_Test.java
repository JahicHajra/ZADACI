package Zadaci_25_08_2016;
/*
 * (Implement the Character class) The Character class is provided in the Java
library. Provide your own implementation for this class. Name the new class
MyCharacter.
 * 
 */

public class Mycharacter_Test {

	public static void main(String[] args) {

		//Test program
		
				//checks if the character is lower case,upper case,letter and digit,respectively

				MyCharacter a = new MyCharacter('l');
				
				System.out.println(a.isLowerCase());
				
				System.out.println(a.isUpperCase());
				
				System.out.println(a.isLetter());
				
				System.out.println(a.isDigit());
				
			}
	}