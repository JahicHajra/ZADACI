package Zadaci_05_08_2016;
/*Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */
import java.util.Scanner; 
public class Reverse_Numbers {

	public static void main(String[] args) {//main method
		
		Scanner input = new Scanner(System.in);//create scanner
		
		boolean correct = true;//declare boolean
		
		while(correct){ //continue input
			correct = false;
		
			try{//try block
				
			
			System.out.println(" Enter an array of 10 numbers ");//message to user to enter numbers
		
			int[]array = new int[10];//create an array of ten numbers
		
			for(int i = 0; i < array.length;i++){//initialize array with input numbers
				array[i]= input.nextInt();

	}

	for(int i = array.length-1;i>=0;i--){//initialize array to print reverse numbers
		System.out.print(array[i] + " ");
	}//end for loop
	
	}//end try block
	catch(Exception ex){//handle the object if the input is wrong(if user enters a letter or a symbol)
		System.out.println(" Invalid input. You should enter a number ");//print message to user
		correct = true;//continue input
	}//end catch block
			
			finally{//finally block ,enter the numbers anyway
				input.nextLine();
			}//end finally block
	}//end while loop
input.close();//scanner closed
}//end method
}//end class