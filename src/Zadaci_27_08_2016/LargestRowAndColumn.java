package Zadaci_27_08_2016;
/*(Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.) 
 * 
 */
import java.util.ArrayList;
public class LargestRowAndColumn {

	public static void main(String[] args) {

		//create matrix 
		int[][] matrix = new int[4][4];
		
		//generate random 0s and 1s and print matrix
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				
				matrix[i][j] = (int)(Math.random()*2);
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
		//method calls
		largestRow(matrix);
		largestColumn(matrix);
		
		
	}
	//largestRow method
	public static void largestRow (int [][] matrix){
		
		ArrayList<Integer> largestRow = new ArrayList<>();
		
		int counter=0;	
		
		//count rows
		for(int i=0; i<matrix.length; i++){
		
			for(int j=0; j<matrix[i].length; j++){
				
				counter+=matrix[i][j];
				}
				
			//add counter to the list
			largestRow.add(counter);
			
			//restart the counter
			counter = 0;
		}
		// i is the largest sum of the rows
		int i= java.util.Collections.max(largestRow);
		
		//print the index of the row with most 1s
		System.out.println("The row with the most 1s is : " + largestRow.indexOf(i));
		
	}
	//largestColumn method
	public static void largestColumn(int[][] matrix){
		
		ArrayList <Integer> largestColumn = new ArrayList<>();
		int counter = 0;	
		
		for(int col = 0; col<matrix[0].length; col++){
			
			for(int red=0; red<matrix.length; red++){
				//sum of the columns
				counter+=matrix[red][col];
			}
			
			largestColumn.add(counter);
			
			//restart counter
			counter = 0;
				
			}
		// i is the largest sum of the column
		int i= java.util.Collections.max(largestColumn);
		
		//print the index of the column with the most 1s
		System.out.println("The column with the most 1s is : " + largestColumn.indexOf(i));
		
	}	
	}
