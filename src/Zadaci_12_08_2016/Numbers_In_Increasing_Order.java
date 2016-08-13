package Zadaci_12_08_2016;

/*Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem 
 * redosljedu. Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u 
 * rastuæem redosljedu.  
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Numbers_In_Increasing_Order {
	
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println(" Enter three numbers");
		
		boolean possible = true;
		
		while(possible){
			
			possible = false;
		
			
			try{
				
			
		
		//three numbers input
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

	
	System.out.println(" Reverse numbers are "); increasingOrder(num1,num2,num3);//method call

	}
			
			catch(InputMismatchException ex){
				System.out.println(" Invalid input. Enter a number.");
				possible = true;
			}
			
			finally{
				input.nextLine();
			}
		}
		input.close();
	}

	public static void increasingOrder(int num1,int num2,int num3){
		
		
int temp = 0;//declare temp and initialize it 0

if(num2<num1){ //if number 2 is smaller than number 3,replace them
	temp = num2;
	num2 = num1;
	num1 = temp;
		
	}
if(num3<num2){ //if number 3 is smaller than number 2,replace them
	temp = num3;
	num3 = num2;
	num2 = temp;
}
	
if(num1>num3){ //if number 1 is greater than number 3,replace them
	temp = num1;
	num1 = num3;
	num3 = temp;
}

//print three numbers
System.out.println(num1 + " " + num2 + " " + num3);
	
	}
		}


