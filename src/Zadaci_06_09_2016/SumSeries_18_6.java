package Zadaci_06_09_2016;
/*(Sum series) Write a recursive method to compute the following series:
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10
 */

public class SumSeries_18_6 {

	public static void main(String[] args) {

		System.out.println(sum(10));
	}
	
	//recursive method for computing the sum of series
	public static double sum(double n){
		
		if(n<1)
			
			return 0;
			return n/((2*n)+1)+sum(n-1);
		}
	}
