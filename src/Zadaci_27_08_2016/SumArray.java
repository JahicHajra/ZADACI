package Zadaci_27_08_2016;
/*(Sum ArrayList) Write the following method that returns the sum of all numbers
in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class SumArray {

	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		//create arrayList
		ArrayList<Double>list = new ArrayList<>();
		
		
		System.out.println(" Enter a list of five numbers");
		
		//list of numbers input
		for(int i = 0; i < 5;i++){
			
			list.add(check());
		}
		
		System.out.println(" The list is");
		print(list);//method call
		
		System.out.println(" The sum of the list is " + sum(list));//sum method call
	}
		
	//sum method
		public static double sum(ArrayList<Double>list){
			
			double sum = 0;
			
			//check the list and add numbers of the list to the sum
			for(int i = 0; i < list.size();i++){
				sum+=list.get(i);
			}
			return sum;//return sum
		}
		
		//print method
		public static void print(ArrayList<Double>list){
			
			//print list
			for(int i = 0; i < list.size();i++){
				
				System.out.println(list.get(i) + "");
			}
		}
		
		public static double check(){
			
			double number = 0;
			
			boolean correct = true;
			
			do{
				
				try{
					
					number = input.nextDouble();
					
					correct = false;
				}
				
				catch(InputMismatchException ex){
					
					System.out.println(" Invalid input. Enter a number");
					
					input.nextLine();
				}
			}
			
			while(correct);
			return number;
		}

}
