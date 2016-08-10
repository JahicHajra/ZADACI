package Zadaci_09_08_2016;

/*Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici (0 za ponedjeljak, 
 * 1 za utorak...) i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu ispisuje da je danas
 *  utorak a dan u buduænosti je petak.) 
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;//import scanner
public class FutureDay {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);//create scanner
		
		
		boolean possible = true;
		
		while(possible){
			possible = false;
		
			
			try{
				
			
		System.out.println(" Enter a number for today's day");
		int number = input.nextInt();
		
		System.out.println(" Enter a number of days after today's day");
		int nextDays = input.nextInt();

		
		//calculate the future day adding the number of days to come to the number of today's day using 
		//remainder of 7, since week has 7 days.
		
		int futureDay = ((number + nextDays)%7);
		
		System.out.println(" Today is " + day(number) + " and in the next " + nextDays + " days will be " + 
		day(futureDay));//method call
		
		
	}
			catch(InputMismatchException ex){
				System.out.println(" Invalid input. Enter a number");
				possible = true;
			}
			finally{
				input.nextLine();
			}
	
		}
		input.close();
		}
	public static String day(int numDay){//day method
		
		
		String day = null;
		
		switch(numDay){//switch-case statements for days in a week
		
		case 0: 
			
			day = "Monday";
			
			break;
			
		case 1:
			
			day = "Tuesday";
			
			break;
			
		case 2:
			
			day = "Wednesday";
			
			break;
			
		case 3:
			
			day = "Thursday";
			
			break;
			
		case 4:
			
			day = "Friday";
			
			break;
			
		case 5:
			
			day = "Saturday";
			
			break;
			
		case 6:
			
			day = "Sunday";
			
			break;
			
		}
		return day;
		
		
		
		}
	}


