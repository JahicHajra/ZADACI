package Zadaci_20_08_2016;


/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of
integers and displays whether the two are strictly identical. 
 * 
 */
 
import java.util.InputMismatchException;

public class Is_Equal_Matrix {

	
public static void main(String[] args) {//main method

		
		//create scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		//prompt the user to enter the first 3x3 matrix
		System.out.println(" Enter the first 3x3 matrix");
		
		
		//declare and create the first 3x3 matrix
		int[][]matrix = new int[3][3];
		
		
		
		boolean possible = true;
		
		
		while(possible){
			
			possible = false;
			
			
			try{
				
			
		
		//first matrix input
		for(int i = 0; i < matrix.length;i++){
			
			for(int j = 0; j< matrix[i].length;j++){
				
				matrix[i][j]=input.nextInt();
			}
		}
		
		//prompt the user to enter the second 3x3 matrix
		System.out.println(" Enter the second 3x3 matrix");
		
		
		//declare and create the second 3x3 matrix
		int[][]matrix2 = new int[3][3];
		
		
		//the second matrix input
		for(int i = 0; i< matrix2.length;i++){
			
			for(int j = 0; j< matrix2[i].length;j++){
				
				matrix2[i][j]=input.nextInt();
			}
		}
		 //method call
		if(isSameMatrix(matrix,matrix2)){
		
		System.out.println(" Two matrices are the same. ");
	}
	else{
		System.out.println(" The matrices are not the same");
	}}
		
			
			
			catch(InputMismatchException ex){
			
			System.out.println(" Invalid input. Enter a number.");
			
			possible = true;
		}
	
			
			
			finally{
		
		input.nextLine();
		
	}
		}
		
		input.close();
	}
	//isSameMatrix method
	public static boolean isSameMatrix(int[][]m1, int[][]m2){
		
		boolean same = true;
		
				//checks if the two matrix length are the same
				if(m1.length!=m2.length){
					
					same =  false;
				}
				
				//checks if the indexes of two matrix are the same
				for(int i = 0; i<m1.length;i++){
					for(int j = 0; j < m1[i].length;j++){
						if(m1[i][j]!=m2[i][j]){
							
							same = false;
						}
			}
		}
		return same;
	}

}
