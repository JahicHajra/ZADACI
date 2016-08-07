package Zadaci_06_08_2016;
/*Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese.
 *  Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
 *   Razmak izmeðu godina treba biti jedan space.
 */

import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean correct = true;
		
		while(correct){
			correct = false;
		
		try{//try block
			
		
		System.out.println(" Enter first year");
		
		int firstYear = input.nextInt();
		
		System.out.println(" Enter second year "); 
		int secondYear = input.nextInt();
		
		
		int counter = 0; 
		
		for(int i = firstYear; i < secondYear;i++){//loop that goes through the first to second year
			if((i % 4 ==0 && i % 100!=0)||(i%400==0)){//finds the leap years
				counter++;//count them
				System.out.print(i + " ");//and print them
			
			if(counter % 10 ==0){//when it is ten years counted,print them in the next line
				System.out.println();
			}
		}
			}}
		catch(Exception ex){//catch exception and handle it
			System.out.println(" Invalid input. You should enter a number");
			correct = true;
		}
		finally{//finally block
			input.nextLine();
		}
		input.close();
	}

}
}