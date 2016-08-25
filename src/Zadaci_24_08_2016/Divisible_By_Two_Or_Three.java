package Zadaci_24_08_2016;

/*(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
divisible by 2 or 3.
 
 */
import java.math.BigDecimal;
public class Divisible_By_Two_Or_Three {

	
	public static void main(String[] args){
		
		String numString = "1";
		
		//loop that goes through numbers from0-50
		for(int i = 0; i < 49;i++){
			
			numString+="0";
		}
		
		
		BigDecimal number = new BigDecimal(numString);
		
		int counter = 0;
		
		while(counter<10){
			
			//check if the numbers are divisible by two or three
			BigDecimal remainder1 = number.remainder(new BigDecimal(2));
			BigDecimal remainder2 = number.remainder(new BigDecimal(3));
			
			//if both remainders are equal to 0,print the number and increment counter
			if(remainder1.equals(BigDecimal.ZERO) || remainder2.equals(BigDecimal.ZERO)){
				
				counter++;
				
				System.out.println(counter + ":" + number);
			}
			
			number = number.add(BigDecimal.ONE);
			
		}
		
		
	}
}

