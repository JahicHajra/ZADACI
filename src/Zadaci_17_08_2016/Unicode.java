package Zadaci_17_08_2016;

/*
 * Napisati program koji prima karakter te vraæa njegov Unicode. Primjer: ukoliko korisnik unese karakter E 
 * program mu vraæa 69 kao unicode za taj karakter.

 */


import java.util.Scanner;
public class Unicode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println(" Enter a character");
		
		
		boolean correct = true;
		
		while(correct){
			
			correct = false;
			
			try{
				
			
		//character input
		String ch = input.next();
		
		
		//print unicode for the character
		System.out.println(" Unicode is " + (int)ch.charAt(0));
			}
		catch(Exception ex){
			
			System.out.println("");
			
			correct = true;
		}
			
			finally{
				input.nextLine();
			}
		}
		input.close();
	}

}
