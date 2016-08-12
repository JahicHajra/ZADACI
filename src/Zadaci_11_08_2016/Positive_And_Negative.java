package Zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva 
 * korisnik unijeo, koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. 
 * (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program 
 * treba da ispiše da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek 
 * svih brojeva je 1.25.
 * 
 */
public class Positive_And_Negative {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		int posNumber = 0;
		int sum = 0;
		int negNumber = 0;
		int number = 0;
		
		
		System.out.println(" Enter numbers. 0 ends input");
		
		
		boolean correct = true;
		
		while(correct){
			correct = false;
		
			
			try{
				
			
		for(number = -1;number !=0;){ 
			number = input.nextInt();
			
	
		if(number < 0) //if number is less than 0,count negative numbers
			negNumber++;
		
		else if(number>0) //if number is greater than 0,count positive numbers
			posNumber++;
		sum+=number;//add number to sum
		
		}
		
		
		
		double average = sum/(double)(posNumber +negNumber);//count average 
		
		//print positive and negative numbers,sum and average
		System.out.println(" There are " + posNumber + " positive numbers ");
		System.out.println(" There are " + negNumber + " negative numbers");
		System.out.println(" The sum is " + sum);
		System.out.printf(" Average is %.2f ", average);
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