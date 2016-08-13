package Zadaci_12_08_2016;

/*
 *  Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja u 
 *  sljedeæem formatu AAA-1234. Napisati program koji nasumièno generiše tablicu.
 */


public class Registration_Number {

	public static void main(String[] args) {//main method

		
		
		// generate 3 uppercase letters
		
	
		int ch1 = 65 + (int)(Math.random() * 26);
		int ch2 = 65 + (int)(Math.random() * 26);
		int ch3 = 65 + (int)(Math.random() * 26);
		
		
		//generate 4 numbers
		
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random()*10);
		
		
		//print number
		System.out.println((char)ch1 + "" + (char)ch2 +""+ (char)ch3 + "-" + number1 + number2 + number3 + number4);
	}
	}


