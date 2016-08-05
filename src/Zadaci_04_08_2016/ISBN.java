package Zadaci_04_08_2016;

/*ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10.
 *  Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se 
 *  sljedeæom formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
 *   Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 *   Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. 
 *   (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
 *    Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)

 */
import java.util.Scanner;//import statement
public class ISBN {

	
	public static void main(String[] args) throws Exception{ //main method

			Scanner input=new Scanner(System.in);//create scanner
			
			
			boolean possible = true; //declare boolean 
			
			while(possible){ //while loop for continue input
				possible = false;
			
				
				try{// try block 
				
			
			
			System.out.println("Enter nine-digit number"); //displays message for user to enter numbers
			String number=input.nextLine(); //number input
			
			int newNumber=0;//declare new number
			String s="0123456789";
			for(int i=0; i<10; i++){ //loop to go from zero to ten numbers
				for(int j=0; j<9; j++){//loop to go to nine numbers
					if(number.charAt(j)==s.charAt(i))
						newNumber+=i*(j+1);
				}	//end inner loop
			}//end outer loop
				
				if(newNumber%11==10) 
				number=number+"X";//x added to number
			else
				number+=newNumber%11;//newNumber added to number
			System.out.println(number);//print number

		}//end try block
			catch(Exception ex){//handle exception if user enters a letter or less-than-nine-digit number
				System.out.println(" Wrong input. Enter a nine-digit number");//print message
				possible = true;
			}
				
				finally{//finally block,print the number anyway
					input.nextLine();
		}//end while loop
			
			
		
			}//
				
			
				input.close();
				

			}
			
		}
