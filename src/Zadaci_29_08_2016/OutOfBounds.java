package Zadaci_29_08_2016;

/*(ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
Creates an array with 100 randomly chosen integers.
Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds
 * 
 */

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class OutOfBounds {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//create an array of 100 integers
		int[]array = new int[100];
		
		//generate random numbers from 0-10 and print array
		for(int i = 0; i < array.length;i++){
			array[i] = (int)(Math.random()*10);
			
			System.out.print(array[i] + " ");
		}
		
		int index;
		boolean correct = true;
		
		
		System.out.println("\nEnter the index for a number");
		
		do{
			
			
			try{
				
				index = input.nextInt();
		
			//print the number which stands on index entered by user
			System.out.println(" Index " + index + " is number " + array[index]);
		
	
				
				correct = false;
				
		}		
		catch(ArrayIndexOutOfBoundsException ex){ // catch exception and handle it
				
				System.out.println(" Out of bounds. Enter a number of index from 0-100.");
				
				input.nextLine();
			}
		}
		while(correct);

}
}