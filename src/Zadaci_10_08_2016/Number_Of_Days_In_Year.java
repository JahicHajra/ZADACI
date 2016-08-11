package Zadaci_10_08_2016;

/* Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: public static int 
 * numberOfDayInAYear(int year). Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu
 *  te ispisuje broj dana za svaku godinu u rasponu.
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;//scanner import


public class Number_Of_Days_In_Year {

	public static void main(String[] args) {//main method

		Scanner input = new Scanner(System.in);//create scanner
		
		
		boolean correct = true;
		
		
		
		System.out.println(" Enter the first year");
		
		
		while(correct){
			
			correct = false;
		
			try{
				
				
			
		int year = input.nextInt();
		
		System.out.println(" Enter the second year");
		int secondYear = input.nextInt();
		
		for(int i = year; i <= secondYear;i++){
		System.out.println("Year " + i + " has " + numberOfDayInAYear(i) + " days" );
		
	}}
			
			catch(InputMismatchException ex){
				System.out.println(" Invalid input. Enter a number");
				correct = true;
			}
			
			finally{
				input.nextLine();
			}}
		input.close();
		
	}
		public static int numberOfDayInAYear(int year){//numberOfDays method
		
			int numberOfDays = 0;
		
		if((year % 4==0 && year %100!=0)||(year %400==0)){ //check if year is leap year,if it is number of days is 366
			
			numberOfDays = 366;
			
		}
		else
			
		
		numberOfDays = 365;//if it is not leap year,number of days in a year is 365
		
		
	
		return numberOfDays;
}
}