package Zadaci_10_08_2016;

/* Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7.
 *  Takoðer, program ispisuje broj svih moguæih kombinacija.  Dakle, program treba da ispiše sve moguæe parove 
 *  brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21. 
 * 
 */

public class Combination_Number {

	public static void main(String[] args) {//main method


		java.util.Scanner input = new java.util.Scanner(System.in);
		
		boolean correct = true;
		
		int count = 0;
		
		while(correct){
			correct = false;
			
			try{//try block
				
		
		for(int i = 1; i <=7;i++){//loop that goes from 1-7
			
			for(int j = i + 1; j<=7;j++){//loop that add 1 to each number from 1-7
				
				System.out.printf("(%1d,%1d)",i, j); //print them in parentheses
				count++;//count them
			}
		}
		System.out.println("\nThe number of combinations is " +  count); //print the count

	}
			
			catch(Exception ex){
				System.out.println(" ");
				correct = true;
			}
			
			finally{
				input.nextLine();
			}

}//end while loop
		
		input.close();
		}//end main method
}