package Zadaci_15_08_2016;

/*Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje ime mjeseca za taj broj.
 *  (Januar za 1, Ferbruar za 2....)
 * 
 */

public class Random_Month {

	public static void main(String[] args) {//main method
		
		//generate random number to twelve,+1 because it starts from 0

		int number = (int)(Math.random()*12)+1;
		
		
		//create an array with twelve months
		String[]month = {"January", "February", "March", "April", "May", "Jun", "July", "August",
				
				"September", "October", "November", "December"};
		
		//print random number and month
		
		System.out.println(number +  " is " + month[number-1]);
		}
			
			
		
	}


