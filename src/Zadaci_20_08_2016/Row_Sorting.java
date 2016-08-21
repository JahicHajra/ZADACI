package Zadaci_20_08_2016;


/*(Row sorting) Implement the following method to sort the rows in a twodimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
 Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix. Here is a sample run:
 * 
 */


import java.util.Arrays;
public class Row_Sorting {

	
	public static void main(String[] args) {

		//create scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//prompt the user to enter 3x3 matrix
		System.out.println(" Enter 3 x 3 matrix");
		
		
		//declare and create 3 x 3 matrix
		
		double[][]matrix = new double[3][3];
		
		
		//matrix input
		for(int i = 0; i < matrix.length;i++){
			
		for(int j = 0; j < matrix[i].length;j++){
			
		matrix[i][j]=input.nextDouble();
		
		}
		}
		
		//declare and create new matrix and call method
		double[][]m = sortRows(matrix);
		
		
		//print new matrix
		for(int i = 0; i<m.length;i++){
			for(int j = 0;j<m[0].length;j++){
				System.out.printf("%3.2f ", m[i][j]);
				
			}
			System.out.println();
		}
		}

	
	
	//sortRows method
    public static double[][] sortRows(double[][] m) {

        double[][] sortedRows = new double[m.length][m[0].length];

        
        
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                    sortedRows[i][j] = m[i][j];
            }
        }
        
        // sort only rows
        for (int i = 0; i < sortedRows.length; i++) {

          Arrays.sort(sortedRows[i]);
        }
        return sortedRows;
    }
}
