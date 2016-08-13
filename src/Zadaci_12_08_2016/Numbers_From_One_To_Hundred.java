package Zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji 
 * broj puta unijet. Pretpostavimo da nula prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva
 *  2 5 6 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta,
 *   broj 23 jednom, itd.
 * 
 */

public class Numbers_From_One_To_Hundred{
static Scanner input = new Scanner(System.in);

public static void main(String[]args){//main method
	

int[] numbers = new int[100]; // create an array of 100


System.out.print("Enter the numbers between 1 and 100-0 ends the input): ");


counter(numbers);//method call

// Display results
for (int i = 0; i < numbers.length; i++) {
	if (numbers[i] > 0)
		System.out.println((i + 1) + " occurs " + numbers[i] + " time"
				+ (numbers[i] > 1 ? "s" : ""));
}
}

public static void counter(int[] numbers) {//counter method

boolean correct= true;


while (correct) {
	correct = false;
	
	
	try {//try block
		int number;
		
		
	//enter the number if numbers are equal or greater than 1 and equal or less than 100
		do {
			number = input.nextInt();
			if (number >= 1 && number <= 100)
				numbers[number - 1]++;//increment element by one -1 for indexes starts with 0
		} 
		
		while (number != 0);//as long as the input is 0
	} 
	
	catch (InputMismatchException ex) {//catch exception for invalid input
		System.out.println("Invalid input: Enter an integer. ");
		correct = true;
	}
	
	finally {
		input.nextLine();
	}
}
}}
