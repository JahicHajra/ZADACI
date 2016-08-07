package Zadaci_06_08_2016;

import java.util.Scanner;


public class Runway_Length {
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);

		boolean correct = true;
		
		while(true){
			correct = false;
			
			try{//try block
				

	System.out.println(" Enter speed and accelaration [m/s]");
	
double v = input.nextDouble();

double a = input.nextDouble();

double length = (v*v)/(2*a);//calculate length


System.out.println(" Runway length is: " + length);//print length

			}
catch(Exception ex){//catch block,catch exception and handle it
	
	System.out.println("Invalid input. Enter a number");
	
	correct = true;
}
			finally{//final statements
				input.nextLine();
			}//end finally block
	
}//end while loop
		
		}//end method
	
	}//end class
