package Zadaci_16_08_2016;

/*Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D
 *  predstavlja broj. Program treba da provjerava da li je broj unese�en u ispravnom formatu. Ukoliko nije,
 *   program pita korisnika da poku�a ponovo. Ukoliko jeste une�en u pravom formatu, program zavr�ava sa radom.
 * 
 */
import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {

		Scanner unos= new Scanner(System.in);
		System.out.println("Enter SSN");

		String s= unos.nextLine();
		
		if(s.charAt(3)== '-' && s.charAt(6)=='-'){
			System.out.print("SSN is correct");
		}
		else{
			System.out.println("SSN is incorrect");
				unos.close();
		}
	}

}
