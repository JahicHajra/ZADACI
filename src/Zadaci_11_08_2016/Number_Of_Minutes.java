package Zadaci_11_08_2016;

/*
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku koliko je 
 * to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_Of_Minutes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			
			System.out.println(" Enter a number of minutes");
			
			boolean correct = true;
			
			
			while(correct){
				correct = false;
			
				try{
					
				
			long minutes = input.nextLong(); // minutes input
			
			/*years calculated diving entered minutes by number of minutes in an hour,hours in day,
			 *  and days in a year
			 */
			
			double years = minutes / 60 / 24 / 365; 
			
			
			/*days calculated using a remainder for days left after number of years is calculated
			 * 
			 */
			double days = (minutes / 60 / 24 % 356);
			
			//print years and days calculated
			
			System.out.println( minutes + " minutes is " + years + " years " + " and " + days + " days ");
			
		
		
	}
				catch(InputMismatchException ex){
					System.out.println(" Invalid input. Enter a number");
					correct = true;
				}
				
				finally{
					input.nextLine();
				}

}
			input.close();
			
	}}
