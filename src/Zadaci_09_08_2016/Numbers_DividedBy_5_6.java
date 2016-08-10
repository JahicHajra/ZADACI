package Zadaci_09_08_2016;

/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, 
 * koji su djeljivi i sa 5 i sa 6. 
 * Razmak izmeðu brojeva treba biti taèno jedan space. 
 */

public class Numbers_DividedBy_5_6 {

	public static void main(String[] args) {//main method
		
		
		java.util.Scanner in = new java.util.Scanner(System.in);

		boolean correct = true;
		
		while(correct){
			correct = false;
			
			
			try{//try block
				
				
		
		int counter = 0;
		
		for(int i = 100;i<=1000;i++){ //loop that goes from 100-1000
			
			if(i % 5 == 0 && i % 6 == 0){//if the numbers are divisible by 5 & 6,count them
				counter++;
				System.out.print(i + " "); //print numbers
				
	
				if(counter %10==0){//when counter reaches 10,print them in the next line
					
					System.out.println();
				}
				}
			}//end loop
		}//end try-block
			
				catch(Exception ex){//catch block
					System.out.println("");
					correct = true;
				}
			finally{
				in.nextLine();
			}
		}//end while loop
in.close();
}
}