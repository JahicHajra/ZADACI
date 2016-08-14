package Zadaci_13_08_2016;

/*
 *  (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti kao
 *   i procenat tog ra�una kojeg �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu.
 *    Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program treba da 
 *    ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculate_Tips {
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the amount of bill");
		
		
		
		boolean correct = true;
		
		while(correct){
			correct = false;
			
			
		try{
			
		
		double bill = input.nextDouble();//number input
		
		System.out.println("Enter the tip in percentage");
		double tip = input.nextDouble();//number in percentage
	
		
		//calculate amount of tip dividing amount of tip by 100 and multiplying it with the amount of bill
		double tipAmount = bill * (tip/100);
			
		//calculate total adding the amount of tip to the amount of bill
			double total = (bill + tipAmount);
		//print 
		System.out.println(" Total is " + total + " and tip is " + tipAmount);
	}
		catch(InputMismatchException ex){
			System.out.println("Invalid input. Enter a number");
			correct = true;
		}
		finally{
			input.nextLine();
		}

}
}}