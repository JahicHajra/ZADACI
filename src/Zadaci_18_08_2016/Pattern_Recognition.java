package Zadaci_18_08_2016;

/*
 * (Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series.

 */

import java.util.InputMismatchException;


public class Pattern_Recognition {

	
	
	public static void main(String[] args) {


		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		//prompt user to enter number of integers in an array
		System.out.print("Enter the number of values ");
		
		
		boolean possible = true;
		
		while(possible){
			
			possible = false;
		
		
		try{
			
		
		//number input
		int numbers = input.nextInt();
		
		
		//declare and create an array of integers defined by user's input
		int[]array=new int[numbers];
		
		System.out.println("Enter the values: ");
		
		
		//enter numbers 
		for (int i = 0; i < array.length; i++) {
		array[i]= input.nextInt();
		}
		
		
		//method call
		if(isConsecutiveFour(array)){
			System.out.println(" The list has consecutive fours");
		}
		else{
			System.out.println(" The list has no consecutive fours");
		}
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
	
	//isConsecutiveFour method
	public static boolean isConsecutiveFour(int[]values) {
		
		
		
		for (int i = 0; i < values.length - 3; i++) {
			
		boolean isEqual = true;
		
		//return false if values j is not the same as the next increment count
		for (int j = i; j < i + 3; j++) {
			
		if (values[j] != values[(j + 1)]) {
			
		isEqual = false;
		break;
		}
		}
		
		//return true if they are equal
		if (isEqual) return true;
		}
		return false;
	
	}

}
