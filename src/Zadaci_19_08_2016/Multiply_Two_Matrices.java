package Zadaci_19_08_2016;

/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][]
 multiplyMatrix(double[][] a, double[][] b)
 To multiply matrix a by matrix b, the number of columns in a must be the same as
the number of rows in b, and the two matrices must have elements of the same or
compatible types. Let c be the result of the multiplication. Assume the column size
of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply_Two_Matrices {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		
		double[][]matrix1 = new double[3][3];
		
		System.out.println(" Enter the first matrix");
		
		
		boolean possible = true;
		
		while(possible){
			
			possible = false; 
		
		try{
			
			
		
		//first matrix input
		for(int i = 0; i < matrix1.length;i++){
			for(int j = 0; j < matrix1[i].length;j++){
				
				matrix1[i][j] = input.nextDouble();
			}
		}
		double[][]matrix2 = new double[3][3];
		
		
		System.out.println(" Enter the second matrix"); 
		
		//second matrix input
		for(int i = 0;i < matrix2.length;i++){
			
			for(int j = 0; j < matrix2[i].length;j++){
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		
		//addMatrix method call
		double[][]sum = multiplyMatrix(matrix1, matrix2);
		
		
		//printMatrix method call
		printMatrix(matrix1,matrix2,sum);
		
	

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
	//multiplyMatrix method
	public static double[][]multiplyMatrix(double[][]a,double[][]b){
	
		
	
		double[][]matrix = new double[a.length][a[0].length];
		
		//multiply the elements of the same index 
		for(int i = 0; i < matrix.length;i++){
			for(int j = 0; j< matrix[i].length;j++){
				
				matrix[i][j]= a[i][j] * b[i][j];
			}
		}
		return matrix;
		}
	
	
	
	//printMatrix method
	public static void printMatrix(double[][]matrix1, double[][]matrix2, double[][]sum){
		
		
		//printing the result of the two matrices multiplied(matrix1 * matrix2 = sum)
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.print(" " + matrix1[i][j]);
			}
			if (i == matrix1.length / 2)
				System.out.print(" * ");
			else {
				System.out.print("   ");
			}

			for (int j = 0; j < matrix2[0].length; j++) {
				System.out.print(" " + matrix2[i][j]);
			}
			if (i == matrix2.length / 2)
				System.out.print(" = ");
			else {
				System.out.print("   ");
			}

			for (int j = 0; j < sum[0].length; j++) {
				System.out.print(" " + sum[i][j]);
			}

			System.out.println();
	}

}


}
