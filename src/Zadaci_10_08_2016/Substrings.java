package Zadaci_10_08_2016;

/*Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string substring
 *  prvog stringa. Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje
 *   da je BC substring ABCD
 *   stringa.
 */
import java.util.Scanner;
public class Substrings {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a first string");
		
		String str1 = input.nextLine();
		
		System.out.println(" Enter a second string");
		
		String str2 = input.nextLine();
		
		input.close();
		
	
			if(str1.contains(str2)){
				System.out.println(str2 + " is substring of " + str1);
			}
			else
				System.out.println(str2 + " is not substring of " + str1);
		}


}