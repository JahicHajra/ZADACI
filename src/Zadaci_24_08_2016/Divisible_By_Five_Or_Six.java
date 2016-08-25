package Zadaci_24_08_2016;

/*(Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.
 * 
 */
import java.math.BigDecimal;
public class Divisible_By_Five_Or_Six {

	public static void main(String[] args) {

		
		String numString = "0";
		
		//loop that goes through numbers from 1-50
		for(int i = 0;i < 49;i++){
			
			numString+="0";
		}
			BigDecimal number = new BigDecimal(numString);
			
			int counter = 0;
			
			while(counter < 10){
				//check if the number is divisible by 5 or 6
				BigDecimal remainder1 = number.remainder(new BigDecimal(5));
				BigDecimal remainder2 = number.remainder(new BigDecimal(6));
				
				//if it is divisible(if remainder is equal to 0,count it
				if(remainder1.equals(BigDecimal.ZERO)|| remainder2.equals(BigDecimal.ZERO)){
					
					counter++;
					
					System.out.println(counter + ":" + number);
				}
				number = number.add(BigDecimal.ONE);
			}
			
	}
}


