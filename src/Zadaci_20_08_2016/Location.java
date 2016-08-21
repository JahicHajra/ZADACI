package Zadaci_20_08_2016;

/*
 * 
 * (The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)

The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array.

 * 
 */

public class Location {

	

	//data fields
	public int row;
	public int column;
	public double maxValue;
	
	static java.util.Scanner input = new java.util.Scanner (System.in); 
	
	public static void main(String[] args) {
		
		//declare and create 3 x 3 matrix
		double[][] matrix =  new double[3][3];
		
		
		//matrix input
		System.out.println("Unesite matricu [3x3]: ");
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				matrix[i][j]= input.nextInt();
			}
		}
		//create locate object
		Location locate = new Location();
		locate=locateLargest(matrix);
		
		System.out.println("The largest number in matrix is "+ locate.maxValue+
				"\nRow: "+locate.row+
				"\nColumn: "+locate.column);

	}
	
	public static Location locateLargest(double[][] a){
		 
		//create locate object
		Location locate = new Location();
		
		 locate.row = 0; 
		 locate.column = 0; 
		 locate.maxValue = a[0][0];
		 
		 
		 
		 //find the largest number in matrix
		 for (int i = 0; i < a.length; i++) {
		 
			 for (int j = 0; j < a.length; j++) {
		 
				 if (a[i][j] > locate.maxValue) {
		                 locate.row = i; 
		                 locate.column = j; 
		                 locate.maxValue = a[i][j];
		 
		             }
		         }
		     }
		 
		  return locate; 
}
}
