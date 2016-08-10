package Zadaci_09_08_2016;
/*Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), pronalazi najveæi od
 *  unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio.  Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 
 *  program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta. 
 * 
 */
import java.util.Scanner;


public class LargestNumber {
	

	public static void main(String[] args) {//main method

		Scanner input = new Scanner(System.in);//scanner created
		
		
		boolean possible = true;
		
		while(possible){
			possible = false;
			
			
			try{
				
		
		
		System.out.println(" Enter numbers. 0 ends input. ");
		
		int number = input.nextInt();
		int counter = 0;
		int largest = number;
		while(number !=0){ //enter numbers as long as it is 0
			
			number = input.nextInt();
		
			if(number>largest){//if number is greater than largest,the number is largest
				largest=number;
				counter = 1;//count once
			}//end if statement
			else if(number ==largest){//if number is the largest,count it
				counter++;
			
			}//end else-if statement
			}//end while loop
			System.out.println("Largest is " + largest);//print it
			
			System.out.println(" The largest shows up " + counter + " times");
		}
			
			
			catch(Exception ex){
				System.out.println(" Invalid input. Enter a number.");
				possible = true;
			}
			
			finally{
				
				input.nextLine();
			}
}
		input.close();
	}}
