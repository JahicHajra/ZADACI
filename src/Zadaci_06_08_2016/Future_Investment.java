package Zadaci_06_08_2016;
/*Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina te vraæa 
 * buduæu vrijednost investicije koristeæi se sljedeæom formulom:
 *  buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 *  Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i
 *   1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */
import java.util.Scanner;
public class Future_Investment {

	public static void main(String[] args) {//main method

		
		Scanner input = new Scanner(System.in);//scanner input
		
		boolean correct = true;//declare boolean
		
		while(correct){//while loop to continue input
			correct = false;
		
			try{//try block
		
		System.out.println(" Enter amount of investment"); //amount of investment input
		double amount = input.nextDouble();
		
		System.out.println(" Enter annual interest rate");//input annual interest rate divided by the number of months
		double annualInterestRate = input.nextDouble()/12;
		

		System.out.println(" Enter a number of years");//number of years input
		double numberOfYears = input.nextDouble();
		
		//calculate future amount
		double futureAmount = amount * Math.pow((1 + (annualInterestRate/100)),( numberOfYears * 12));
		
	
	System.out.println(" Future amount of investment is " + futureAmount);

}
			catch(Exception ex){//catch exception and handle it
				System.out.println(" Invalid input. Enter a number");
				correct = true;
			}
			finally{//finally block,execute it anyway
				input.nextLine();
			}
	
	}
		input.close();
		}}