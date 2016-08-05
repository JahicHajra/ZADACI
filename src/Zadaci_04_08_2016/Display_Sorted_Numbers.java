package Zadaci_04_08_2016;
/* Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 */

import java.util.Scanner; //import scanner
public class Display_Sorted_Numbers { 

	public static void main(String[] args) { //main method
		
		Scanner input = new Scanner(System.in); //Scanner import
		
		boolean correct = true; //boolean variable initialized true
		 
		while(correct){ //loop for repeating the input 
			correct = false;//initialize it false
			
		
		try{ // try to enter the input and call method
		System.out.println(" Enter three numbers "); //message for user
		
		double num1 = input.nextDouble(); //three numbers enterd
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		System.out.println(" Sorted numbers are : " );displaySortedNumbers(num1,num2,num3);//method call
		} //print sorted numbers
		
		catch(Exception ex){ //if the user enter letter or symbol, handle exception
			System.out.println(" Invalid input. You need to put a number"); 
			correct = true;//enter the numbers again
		}//end catch block
	finally{
		input.nextLine(); //enter the number anyway
	}//end finally block
		}//end while loop
		
		input.close(); //close scanner
		}//end method
	
	public static void displaySortedNumbers(double number1, double number2, double number3)throws Exception{ 
		//method displaySortedNumbers ,declare exception
		
		double temp = 0; //declare double variable temp and initialize it 0
		
		
			if(number1 >number2){ //if first number is greater than the second one,replace them
				temp = number1;
				number1 = number2;
				number2 = temp;
			}//end if-statement
			
			if(number2 > number3){ //if the second number is greater than third,replace them
				temp = number3;
				number3 = number2;
				number2 = temp;
				
			}//end if-statement
			
			if(number3 < number1){ //if the third number is less than the first one, replace them
				temp = number1;
				number1 = number3;
				number3 = temp;
			}//end if-statement
			
		System.out.print( number1 + " + " + number2 + " + " + number3);	//print sorted numbers
		}//end method
	
		
	}//end class