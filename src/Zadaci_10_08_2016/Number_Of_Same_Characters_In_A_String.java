package Zadaci_10_08_2016;
/*
 *  Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 *  Metoda treba da koristi sljedeæi header: public static int count(String str, char a).
 *   Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2.
 *    Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu te
 *     mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 */


import java.util.InputMismatchException;
import java.util.Scanner;//import Scanner

public class Number_Of_Same_Characters_In_A_String {

	
	
	public static void main(String[] args) {//main method
		

		Scanner input = new Scanner(System.in);//create scanner
		
		
		boolean correct = true;
		
		
		System.out.println(" Enter a string ");
		
		
		while(correct){
			
			correct = false;
		
			
			try{//try block
			
		
		
		String str = input.nextLine(); //string input
		
		System.out.println(" Which character you want to count in a string?");
	
		char ch = input.next().charAt(0);//character input
		
		System.out.println(" character " + ch + " shows up " + count(str,ch) + " times.");//method call
	
			}//end try block
			
			catch(InputMismatchException ex){//catch exception
				
				System.out.println(" Invalid input. Enter a string. ");
				
				correct = true;
			}
			finally{
				input.nextLine();
			}
		}//end while loop
		input.close();
		
	}
	public static int count(String str, char a){//count method
		
		int counter = 0;
		
		for(int i = 0; i<str.length();i++){//loop that goes through the string
			
			if(str.charAt(i)==a){ //if the input character is in the string,count it
				
				counter++;
			}
		}
		return counter;//return counter
		
		
	}

}
