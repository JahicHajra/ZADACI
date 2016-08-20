package Zadaci_19_08_2016;

/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:
public static void sort(int m[][])
 The method performs a primary sort on rows and a secondary sort on columns.
For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 * 
 */

public class Sort_Two_Dimensional_Array {

	public static void main(String[] args) {

		
		//declare and create an array 
		int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
		
		//sort method call
		sort(array);
		
		
		//print matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	//sort method
	public static void sort(int[][]m){
		
		
		//replace rows using temp variable in order to place them in ascending order
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-i-1; j++) {
				
				
				if (sum(m[j]) > sum(m[j + 1])) {
					int[] temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
					
				}
			}
		}
		
		//replace columns using temp variable to place them in ascending order
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-i-1; j++) {
				
				
				
				if (m[j][0] > m[j + 1][0]) {
					int[] temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
					
				}
			}

}
	}
	
	//sum method
	public static int sum(int[] m) {
		
		// the method returns sum of rows in matrix
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		return sum;
	}
	

}