package Zadaci_06_09_2016;
/*(Sum series) Write a recursive method to compute the following series:
m(i) = 1 +...

 Write a test program that displays m(i) for i = 1, 2, . . ., 10
 * 
 */

public class SumSeries_18_4 {

	public static void main(String[] args) {


		System.out.println(sum(10));
	}

	
	//recursive method that finds the sum of series 
	public static double sum(double n){
		
		if(n<=1)
			
			return n;
		
		return 1/n + sum(n-1);
		}
	}
