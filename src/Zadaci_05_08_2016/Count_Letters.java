package Zadaci_05_08_2016;
/* Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 * public static int countLetters(String s). Napisati program koji pita korisnika da unese neki string 
 * te mu vrati koliko taj string ima slova.
 */
import java.util.Scanner;
public class Count_Letters {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);//create scanner
		System.out.println(" Enter a string");

		String s = input.nextLine();
System.out.println(" This string has " + countLetters(s) + " letters ");//method call
	}//end main method
	
	public static int countLetters(String s){//countLetters method
		
		int counter = 1;
	for(int i = 0;i<s.length()-1;i++){//loop that goes over the string,excluding the first one(0)
		if(s.charAt(i)>= 'a' && s.charAt(i)<='z')//finds the letters
			
			counter++;//count the letters
		}
	return counter;//return number of letters
	
	
	}//end method
	

}//end class
