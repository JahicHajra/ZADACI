package Zadaci_15_08_2016;

/*
 *  Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.

 */

public class Sum_Of_Numbers {

	public static void main(String[] args) {

		
		double sum= 0.0;
		
		
		//loop that goes from 1 to 99 incrementing for 2
		for(int i = 1; i <= 98;i+=2){
			
			
			//add the number i to the sum divided by (i+2.0)
			sum+=(double)i /(i + 2.0);
		}
		
		//print the sum
			System.out.print(sum );
		}
	

	}
