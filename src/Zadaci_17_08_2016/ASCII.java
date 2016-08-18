package Zadaci_17_08_2016;

/*Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 * 
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ASCII {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a number
		System.out.println(" Enter a number");
		
		
		boolean correct = true;
		
		while(correct){
			
			correct = false;
			
			try{
				
		//number input
		int n = input.nextInt();
		
		//print character 
		System.out.println( "Character with the number " + n + " is " + (char)n);
		
	
	}
			catch(InputMismatchException ex){//catch exception
				System.out.println(" Invalid input. Enter a number");
				correct = true;
			}
finally{
	input.nextLine();
}
}
		input.close();
		}}
