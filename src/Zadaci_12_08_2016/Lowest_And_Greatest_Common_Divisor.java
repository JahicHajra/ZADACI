package Zadaci_12_08_2016;

/*
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te ispisuje najveæi i 
 * najmanji zajednièki djelilac za ta dva broja.

 */
import java.util.InputMismatchException;
import java.util.Scanner;


public class Lowest_And_Greatest_Common_Divisor {

	public static void main(String[] args) {//main method


		Scanner input = new Scanner(System.in);//create scanner
	
	System.out.println(" Enter two numbers");
	
	boolean correct = true;
	
	while(correct){
		correct = false;
	
		try{
	
			//numbers input
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	
	//initialize gcd and lcd
	int gcd = 1;
	int lcd = 1;
	
	
	//check if the numbers 1 and 2 are divisible with the number(i)
	for(int i = 2; i <=number1;i++){
		if(number1 % i ==0 && number2 % i ==0){
			lcd = i;//if they are lcd is i
			break;
		}
	}
	//check if the number1 and number2 are divisible with the number(j)
	for(int j = 2; j <=number1;j++){
		if(number1 % j ==0 && number2 % j==0){
			gcd = j;//if they are divisible, gcd is j
		}
		
		
}
	//print the greatest and lowest common divisor of two numbers
	System.out.println(" The greatest common divisor is " + gcd + " and the lowest common divisor is " + lcd);
	
	}
catch(InputMismatchException ex){
	System.out.println(" Inavalid input. Enter a number.");
	correct = true;
	
}
		
		finally{
			input.nextLine();
		}
}
	
	}}
