package Zadaci_05_08_2016;
/*  Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka).
 *  Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */
import java.util.Random;//import random statement
public class Random_Card {

	public static void main(String[] args) {//main method

		
			
		//declare string type array for card numbers and enter the card ranks
		String[] cardNumber={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		//declare string type array for card suit and enter all four of them
			String[] cardSuit={"Heart", "Diamond", "Spade", "Club"};
			
			//create random object
	Random r=new Random();
		
	//print random card number and suit
	System.out.println(" The card you picked is " + cardNumber[r.nextInt(13)] + " " + cardSuit[r.nextInt(4)]);
	
		
		}//end method
}//end class