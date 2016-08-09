package Zadaci_08_08_2016;

/*Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) 
 * te mu ispiše broj dana u tom mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan
 *  program mu ispisuje da Jan 2011 ima 31 dan.
 * 
 */
import java.util.Scanner;
public class FirstThreeLetters_NumberOfDays {

	
	
	public static void main(String[] args) { //main method

		
		Scanner input = new Scanner(System.in); //create scanner
		
		System.out.println(" Enter a year");
		
		
		
	boolean valid = true;
	
	while(valid){
		valid = false;
	
		try{//ty block
			
		
		int year = input.nextInt();
		
		System.out.println(" Enter first three letters of a month(first uppercase letter");
		String month = input.next();
		
		
		int numberOfDays = 0;
		
		//switch cases for months
		switch(month){
		
		case "Jan": 
		case "Mar":
		case "May":
		case "Jul:":
		case "Aug":
		case "Oct":
		case "Dec":
			
			numberOfDays = 31;
			break;
			
		case "Feb":
			
			if((year % 4 ==0 && year % 100!=0)||(year % 400==0)){ //check if it is leap year
				numberOfDays = 29;
				break;
				
			}
			numberOfDays = 28;
			break;
		
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			
			numberOfDays = 30;
			
		}
		
		//print
		System.out.println(" Month " + month + " in year " + year + " has " + numberOfDays + " days .");
	}
		catch(Exception ex){//catch exception
			System.out.println("Invalid input. Enter a number.");
			valid = true;
		}
		finally{
			input.nextLine();
		}

}
	input.close();
	}}
