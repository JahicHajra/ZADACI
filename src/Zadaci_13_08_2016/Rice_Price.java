package Zadaci_13_08_2016;

/*Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. Program pita korisnika da unese težinu
 *  i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu
 * 
 */


import java.util.InputMismatchException;
import java.util.Scanner;
public class Rice_Price {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter weigth and price of the first pack");
		
		
		
		boolean correct = true;
		while(correct){
			correct = false;
			
		try{
		
		//input weigth and price of the first package
		double weigth = input.nextDouble();
		double price = input.nextDouble();
		
		System.out.println(" Enter weigth and price of the second pack");
		
		//input weigth and price of the second package
		double weigth1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		//check which price is better
		if((price/weigth)<(price1/weigth1)){
			
			System.out.println(" The first pack is better");
		}
		
		else if((price/weigth)==(price1/weigth1)){
			System.out.println("The packs are the same");
		}
		else{
			System.out.println(" The second pack is better.");
		}
		
	}
		catch(InputMismatchException ex){
			System.out.println(" Invalid input. Enter a number");
			correct = true;
		}
		finally{
			input.nextLine();
		}

}}}
