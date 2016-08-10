package Zadaci_09_08_2016;

/*Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
 * Metoda treba da koristi sljedeæi header: public static String convertMillis(long millis).
 *  Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  Na primjer convertMillis(100000) 
 *  treba da vrati 0:1:40.
 * 
 */
import java.util.Scanner;//scanner import


public class Miliseconds {

	
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a number of miliseconds");
		
		boolean possible = true;
		
		while(possible){
			possible = false;
			
			
			try{
				
		
		long miliseconds = input.nextLong();
		
System.out.println(convertMillis(miliseconds));//method call


			}
			
			catch(Exception ex){
				System.out.println(" Invalid input. Enter a number. ");
				possible = true;
			}
			
			finally{
				input.nextLine();
			}}
		input.close();
	}
	
	public static String convertMillis(long millis){//convertMillis method
		
	//get total seconds,minutes and hours
		long seconds = millis/1000;
		long minutes = seconds / 60;
		long hours = minutes / (60*60);
		
		return hours%24+":"+minutes%60+":"+seconds%60; //return hours,minutes and seconds
	}

}
