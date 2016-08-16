package Zadaci_15_08_2016;
/*Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom:
 *  public static void printMatrix(int n). Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 *  Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.

 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix_NxN {
	public static void main(String[] args) { //main method

		Scanner input= new Scanner(System.in); //Scanner creating
				boolean possible = true; //declare boolean variable
				
				while(possible){ 
					possible = false;
				

		try{ //enter a number

		System.out.println(" Enter a number");
		int number = input.nextInt(); //number input

		printMatrix(number); 
		}

		catch(InputMismatchException ex){ //catch an exception
			System.out.println(" Wrong input. Enter an integer!");
			
			possible = true; 
		}
		finally{
			input.nextLine(); //enter the number anyway
		}}
				input.close(); // scanner close

			}
		public static void printMatrix(int number){ //printMatrix method
			

			int[][]matrix = new int[number][number]; //declaring matrix
			
			for(int i = 0; i < matrix.length;i++){ //Loop for listing 0s and 1s
				for(int j = 0; j < matrix[i].length;j++){
					matrix[i][j]= (int)(Math.random()*2);
				} //end of inner loop
				}// end of outer loop
			
			//print random 1s and 0s with the space in between
			for(int i = 0;i<matrix.length;i++){ 
				for(int j = 0; j < matrix[i].length;j++){
					System.out.print(matrix[i][j] + " ");
				
				} // end of inner loop
					
				System.out.println(); 
				
			} //end of inner loop
			
			
		} // end of method
		} //end of class