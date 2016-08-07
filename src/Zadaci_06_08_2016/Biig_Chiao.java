package Zadaci_06_08_2016;
/*Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze 
 * na neparnim pozicijama. Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */
import java.util.Scanner;
public class Biig_Chiao {

	public static void main(String[] args) {//main method
		
		Scanner input = new Scanner(System.in);//create scanner

		boolean good = true; //declare boolean
		
		while(good){ //while loop to continue input
			good = false;
		
		try{//try block
			
		
		
		System.out.println("Unesite string");//string input
		String s=input.nextLine();
		
		
	
		for(int i=0; i<s.length(); i++){//loop to check string 
		if(i % 2==0)//finds every second letter
		System.out.print(s.charAt(i));//print
		
}//end if
		}//end loop
		catch(Exception ex){//catch exception and handle it
			System.out.println(" You should enter letters.");
			good = true;
		}
		
		finally{
			input.nextLine();//finally block,execute it anyway
			
		}//end finally block
		}//end while loop
		input.close();
	}//end method

}//end class
