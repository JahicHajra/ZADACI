package Zadaci_19_08_2016;

/*(Largest row and column) Write a program that randomly fills in 0s and 1s into
a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
most 1s. Here is a sample run of the program:
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2
 * 
 */

public class Largest_Row_And_Column {

	
	public static void main(String[] args) {

        // declare and create 4 by 4 matrix
        int[][] matrix = new int[4][4];

       
        int largestRowIndex = 0;
        int largest = -1;
        
        //generate random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = (int)(Math.random() * 2);
                rowCount += matrix[i][k];
            }
            
            
            //find the row with the most 1s
            if (rowCount > largest) {
                largestRowIndex = i;
                largest = rowCount;
            }
        }

        // find largest column index
        int largestColumnIndex = 0;
        largest = -1;
        for (int k = 0; k < matrix[0].length; k++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnCount += matrix[i][k];
            }
            if (columnCount > largest) {
                largest = columnCount;
                largestColumnIndex = k;
            }

        }

        // print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.printf("%d", matrix[i][k]);
            }
            System.out.printf("\n");
        }
        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The larges column index: " + largestColumnIndex);
    }
}