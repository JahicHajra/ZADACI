package Zadaci_04_08_2016;
/*Napisati program koji uèitava neodreðeni broj cijelih brojeva 
 * (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva 
 * a koliko je bilo brojeva ispod prosjeka. 
 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 * 
 */
import java.util.Scanner;

public class Average_Numbers {

	public static void main(String[]args){//main method
	
		
		Scanner input = new Scanner(System.in);//scanner import
	
	
	int numbers=1; //declare numbers to be entered and set value 1
	int counter =0;//declare counter to count numbers entered and set value 0
	int total = 0;//declare sum of the numbers entered,set value 0
	double average =0;//declare average to be calculated,set value 0
	int a =0;//declare counter
	
	
	int[]array= new int[100];//declare array and create it
	
	System.out.println("Enter the numbers");//display the message for user

	
	boolean good = true;//declare good and with the initial true
	
	while(good){
		good = false;
try{

	while(numbers !=0 && numbers<array.length){/*as long as user does not enter 0 and 
		as long as user does not enter 100 numbers(array length)
		user enters numbers
		*/
	numbers= input.nextInt();
	
if (numbers !=0){ //if number is not 0
	
	array[a] = numbers;//numbers are placed in the array
	total+=numbers;//sum all numbers entered
	counter++;//count numbers entered
	a++;//counter increment
	
}//end if statement

}//end while loop
}
	catch(Exception ex){
		System.out.println(" Invalid input. Enter a number");//print message to user if he enter symbol or letter
		good = true; //enter numbers again
	}//end catch block
finally{//finally block to enter the numbers anyway
	input.nextLine();//scanner close
}//end finally block
	}//end while loop

average = total/counter;//calculate average(divide all numbers entered with the counter of the numbers

int belowAverage = 0;//declare counter for numbers below average
int aboveAverage = 0;//declare counter for numbers above average
int sameAsAverage = 0;//declare counter for numbers which are as same as average


for (int i = 0; i < counter;i++){//set loop to go through all numbers entered

	
	if(array[i]<average){//find numbers int the array which are below average
	
	belowAverage++;//count numbers that are below average

}//end if-statement
else if(array[i]>average){//then find numbers in the array that are above average
	aboveAverage++;//count the numbers above average
	}//end else-if statement


else if (array[i]==average){//find numbers that are as same as average
	sameAsAverage++;//count the numbers that are as same as average
}//end else if statement
}//end for loop

System.out.println("Total is " + total);//print sum of numbers entered
System.out.println("Average is " + average);//print calculated average of numbers entered
System.out.println(" There are " + belowAverage + " numbers below average");//print numbers below average
System.out.println(" There are " + aboveAverage +  " numbers above average ");//print numbers above average
System.out.println(" There are " + sameAsAverage + " numbers same as average");//print numbers as same as average
input.close();//scanner closed
	}//end method
	}//end class