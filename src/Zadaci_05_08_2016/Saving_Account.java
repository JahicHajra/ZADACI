package Zadaci_05_08_2016;
/*Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje.
 *  Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati 
 *  stanje raèuna. 
 */

public class Saving_Account {

	public static void main(String[] args) { //main class

java.util.Scanner input = new java.util.Scanner(System.in); //scanner input

System.out.println(" Enter a monthly amount of savings "); // enter a number of savings
double amount = input.nextInt();

System.out.println(" Enter number of months");//enter a number of months
int numberOfMonths = input.nextInt();

double annualInterestRate = 5; //declare annual interest rate

double monthlyInterestRate = annualInterestRate/1200;//declare monthly interest rate

double account=0;//declare account


for(int i = 0; i<numberOfMonths;i++){//loop that counts number of months
	account = (amount+account)*(1+monthlyInterestRate); //adding an amount to the account each month + interest rate
}

//print account 
System.out.println(" Stanje na racunu nakon " + numberOfMonths + " je " + account); 
	}

}
