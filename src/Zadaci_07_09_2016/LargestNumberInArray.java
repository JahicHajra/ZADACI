package Zadaci_07_09_2016;
/*(Find the largest number in an array) Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element
 * 
 */
import java.util.Scanner;
public class LargestNumberInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter an array of 8 integers");
		
		//create array of eight numbers
		int[]array = new int[8];
		
		//numbers input
		for(int i = 0; i < array.length;i++){
			array[i]=input.nextInt();
		}
		
		//method invocation
		System.out.println( " The largest number in array is " + displayLargest(array, array.length-1));
		
	}
	
	public static int displayLargest(int[]array, int i){
		
		//returning the largest number in array,using recursion
		if(i<0){
			return array[0];
		}
		else{
			
			return Math.max(array[i], displayLargest(array, i-1));
		}
		
		
		
		
		
	}}