package Zadaci_19_08_2016;

	/*(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
	matrix filled with 0s and 1s, displays the matrix, and checks if every row and
	every column have an even number of 1s.
	 * 
	 * 
	 */

	public class Even_Number_Of_1s {

		public static void main(String[] args) {

			//declare and create 6x6 matrix
			int[][]matrix = new int[6][6];
			
			
			//generate random 0s and 1s in rows and columns
			for(int i = 0;i<matrix.length;i++){
				
				for(int j = 0; j < matrix.length;j++){
					
					matrix[i][j] = (int)(Math.random()*2);
				}
			}
			 
			
			//print generated random 0s and 1s in rows and columns
			for(int i = 0; i < matrix.length;i++){
				
				for(int j = 0; j < matrix[i].length;j++){
					
					System.out.print( matrix[i][j] + " ");
				}
				
				System.out.println();
			}
			
			
			//method calls
			System.out.println(" Row has even 1s " + isEvenInRows(matrix));
			System.out.println(" Column has even 1s " + isEvenInColumns(matrix));
			
		
			}
		
		//isEvenInRows method
			public static boolean isEvenInRows(int[][]m){
				
				
				//method returns true or false depending on whether there is even number of 1s in rows 
				int count = 0;
				
				for(int i = 0; i < m.length;i++){
					
					for(int j = 0; j<m[i].length;j++){
		
				//count 1s in rows
					if(m[i][j]==1){
						
						count++;
					}
					
					//if count is divisible by 2(if there is even number)return true
					if(count % 2 ==0)
						return true;
					}}
			
			return false;
		}
			
			
			//isEvenInColumns method
			public static boolean isEvenInColumns(int[][]m){
				
				
				//method returns true or false,depending on whether there is even number of 1s in columns
				int count = 0;
				
				for(int i = 0; i < m.length;i++){
				for(int j = 0; j<m[i].length;j++){
					
					
					//if there are 1s in columns,count them
					if(m[j][i]==1){
						
						count++;
				}
					
					//if count is divisible by 2(if there is even number)return true
					if(count % 2 ==0)
						
						return true;
					}}
					
					return false;
					
				}
				}
			

