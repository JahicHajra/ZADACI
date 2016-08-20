package Zadaci_19_08_2016;

/*(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours.
 * 
 */

public class Number_Of_Hours {

	

	public static void main(String[] args) {
		
		
		//declare and create 2D array of working hours
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 },
				          { 7, 3, 4, 3, 3, 4, 4 },
				          { 3, 3, 4, 3, 3, 2, 2 },
				          { 9, 3, 4, 7, 3, 4, 1 },
				          { 3, 5, 4, 3, 6, 3, 8 },
				          { 3, 4, 4, 6, 3, 4, 4 }, 
				          { 3, 7, 4, 8, 3, 8, 4 },
				          { 6, 3, 5, 9, 2, 7, 9 } };

		//declare and create 2D array and  call method for calculating hours
		int[][] totalHours = computeHours(hours);

		//descendingOrder method call
		descendingOrder(totalHours);
		
		//print employees and total working hours

		for (int i = 0; i < totalHours.length; i++) {

			System.out.println("Employee " + totalHours[i][0]
					+ " total hours = " + totalHours[i][1]);
		}

	}

	// computeHours method
	public static int[][] computeHours(int[][] m) {

		//declare and create 2D array
		int[][] totalHours= new int[m.length][2];

		//first column for employees,the second for hours(sum method call)
		for (int i = 0; i < m.length; i++) {
			totalHours[i][0] = i;
			totalHours[i][1] = sum(m, i);
			
		}

		return totalHours;
	}

	
	
	// sum method
	public static int sum(int[][] m, int row) {

		
		//sum elements of the matrix row
		int total = 0;
		for (int column = 0; column < m[row].length; column++) {
			total += m[row][column];
		}
		return total;
	}

	
	
	//descendingOrder method
	public static void descendingOrder(int[][] m) {

		//the method sorts the array in descending order
		
	
		for (int i = 0; i < m.length - 1; i++) {

			int index = i;
			int max = m[i][1];
			
			for (int j = i + 1; j < m.length; j++) {
				
				//replace the sum of working hours and employees index
				
				if (max < m[j][1]) {
					max = m[j][1];
					index = j;
					
				}
			}

			
			
			if (index != i) {
				
				m[index][1] = m[i][1];
				m[i][1] = max;
				
				m[index][0] = m[i][0];
				m[i][0] = index;
			}

		}

	}

}

