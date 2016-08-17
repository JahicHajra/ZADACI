package Zadaci_17_08_2016;

/*U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da unese short broj 
 * te mu ispiše svih 16 bita za dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje
 *  0000000000000101
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;


public class Short_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a number as a short integer");
		
		
		boolean correct = true;
		
		while(correct){
			
			correct = false;
			
			try{
				
			
		short number = input.nextShort();
		
		System.out.println(String.format("%016d", Integer.parseInt(Integer.toBinaryString(number))));
			}
			
			catch(InputMismatchException ex){
				
				System.out.println("Invalid input. Enter a number");
				correct = true;
			}
			
			finally{
				input.nextLine();
				
			}}
		input.close();
	}

}
