package Zadaci_24_08_2016;

/*(Square numbers) Find the first ten square numbers that are greater than
Long.MAX_VALUE. A square number is a number in the form of n2
. For example,
4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast
 * 
 */
import java.math.BigDecimal;
public class Square_Numbers {

	public static void main(String[] args) {
		
	

		//BigDecimal object with long max value
		BigDecimal maxValue = new BigDecimal(Long.MAX_VALUE);
		
		long start = (long)(Math.sqrt(Long.MAX_VALUE));
		
		BigDecimal n = new BigDecimal(start);
		
		int counter = 0;
		
		//loop that runs until counter reaches 10
		while(counter < 10){
			
			BigDecimal square = n.multiply(n);
			
			//check if the number is square number
			if(square.compareTo(maxValue)>=0){
				
				counter++;
				
				System.out.println(counter + ":" + square);
				
				
			}
			n = n.add(BigDecimal.ONE);
		}
	}

}
