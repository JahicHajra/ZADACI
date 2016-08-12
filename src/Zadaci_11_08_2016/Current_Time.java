package Zadaci_11_08_2016;

/*Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka
 *  pozivanja metode. Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu "Trenutni datum i 
 *  vrijeme: 22. juli, 2015 19:59:47"
 */


import java.util.Date; 
public class Current_Time {
	

	public static void main(String[] args) {//main method

		Date date = new Date(System.currentTimeMillis());//create object date using currentTimeMIllis method
		
		System.out.println(" Current date and time " + date.toString()); //print date and time
	}

}
