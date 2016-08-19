package Zadaci_18_08_2016;

/*
 * (Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)

 */

public class Random_Number_Chooser {

	public static void main(String[] args) {

		//method call
		System.out.println( " Number generated " + getRandom(7, 3, 8, 6, 23, 45, 16, 32));
	}
	
	public static int getRandom(int...numbers){//getRandom method
		
		
		//generate random number between 1 and 54
		int randNumber = (int)(Math.random()*54)+1;
		
		
		//check if the numbers in an argument is equal to random number;if it is then get new random number
		for(int i = 0; i < numbers.length;i++){
			
			if(numbers[i]==randNumber){
				
				randNumber = (int)(Math.random()*54)+1;
				i=-1;
			}
		}
		
		return randNumber;//return random number
	}

}
