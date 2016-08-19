package Zadaci_18_08_2016;

/*
 * (Sum elements column by column) Write a method that returns the sum of all the
		elements in a specified column in a matrix using the following header:
		public static double sumColumn(double[][] m, int columnIndex)
		Write a test program that reads a 3-by-4 matrix and displays the sum of each
		column. Here is a sample run:
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum_Elements_Column_By_Column {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter 3 x 4 matrix. ");
		
		
		//declare and create matrix of values 3 x 4
		double[][]matrix = new double[3][4];
		
		boolean possible = true;
		
		while(possible){
			
			possible = false;
			
			
			try{
				
				
			
		//matrix input
		for(int i = 0; i < matrix.length;i++){
			
			
			for(int j = 0; j < matrix[i].length;j++){
				
				matrix[i][j] = input.nextDouble();
			}
		}
		
		//to print sum from 0 column index
		for(int i = 0; i < 4; i++){
		System.out.println(" Sum of the column is " + sumColumn(matrix,i));
		}
		}
			
			catch(InputMismatchException ex){
				
				System.out.println(" Invalid input. Enter a number");
				
				possible = true;
			}
			
			finally{
				
				input.nextLine();
			}
		}
		
		input.close();
	}
	
	//sumColumn method
	public static double sumColumn(double[][]m, int columnIndex){
		
		double sum = 0;
		
		
		//add the numbers from column to the sum
		for(int i = 0; i < m.length;i++){
			
			sum+=m[i][columnIndex];
		}
		//return sum
		return sum;
		
		
	}

}
